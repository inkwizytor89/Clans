\echo 'patch0000'

CREATE EXTENSION IF NOT EXISTS pgcrypto;

create table if not exists db_version (
    id serial PRIMARY KEY,
    created TIMESTAMP default now()
);

insert into db_version values (0);

CREATE TYPE sex_type AS ENUM ('male', 'female');

create table if not exists users (
    id serial PRIMARY KEY,
    login varchar(40) not null UNIQUE,
    password VARCHAR(75) not null,
    salt VARCHAR(75)  not null,
    nick VARCHAR(40) not null,
    sex sex_type,
    email VARCHAR(40)  not null UNIQUE,
    updated TIMESTAMP default now(),
    created TIMESTAMP default now()
);

CREATE OR REPLACE FUNCTION updated()	
RETURNS TRIGGER AS $$
BEGIN
    NEW.updated = now();
    RETURN NEW;	
END;
$$ language 'plpgsql';

CREATE TRIGGER update_users BEFORE UPDATE ON users FOR EACH ROW EXECUTE PROCEDURE updated();

CREATE OR REPLACE FUNCTION get_user_id(_login text)
RETURNS int AS $$
DECLARE _user_id INT;
BEGIN
  select id into _user_id from users where login = _login;
  return _user_id;
END;
$$  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION hash_password(pass TEXT, salt TEXT)
RETURNS TEXT AS $$
BEGIN
        RETURN crypt(pass, gen_salt('bf',8));
END;
$$  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION check_password(_uname TEXT, _pass TEXT)
RETURNS BOOLEAN AS $$
DECLARE passed BOOLEAN;
BEGIN
        SELECT  (users.password = hash_password(_pass, salt)) INTO passed
        FROM    users
        WHERE   login = _uname;

        RETURN passed;
END;
$$  LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION add_user(_login TEXT, _pass TEXT, _nick TEXT, _sex sex_type, _email TEXT)
RETURNS void AS $$
DECLARE _user_id INT;
DECLARE _salt TEXT;
BEGIN

  _salt := gen_salt('bf',8);

  insert into users (login, password, salt, nick, sex, email) values (_login, hash_password(_pass, _salt), _salt, _nick, _sex, _email) RETURNING id into _user_id;
  insert into user_roles (user_id, role) values (_user_id, 'USER');

END;
$$  LANGUAGE plpgsql;

create table if not exists user_roles (
  user_id int REFERENCES users NOT NULL,
  role varchar(40) NOT NULL,
  created TIMESTAMP default now(),
  UNIQUE (user_id, role)
);
