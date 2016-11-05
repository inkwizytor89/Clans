\echo 'patch0000'

create table if not exists db_version (
    id serial PRIMARY KEY,
    created TIMESTAMP default now()
);

insert into db_version values (0);

CREATE TYPE sex_type AS ENUM ('male', 'female');

create table if not exists users (
    id serial PRIMARY KEY,
    login varchar(40) UNIQUE,
    password VARCHAR(40),
    nick VARCHAR(40),
    sex sex_type,
    email VARCHAR(40) UNIQUE,
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

create table if not exists user_roles (
  user_id int REFERENCES users NOT NULL,
  role varchar(40) NOT NULL,
  created TIMESTAMP default now(),
  UNIQUE (user_id, role)
);
