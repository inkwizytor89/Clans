\echo 'patch0000'

create table if not exists db_version (
    id serial PRIMARY KEY,
    created TIMESTAMP default now()
);

insert into db_version values (0);

create table if not exists users (
    id serial PRIMARY KEY,
    login varchar(40) UNIQUE,
    password VARCHAR(40),
    nick VARCHAR(40),
    email VARCHAR(40) UNIQUE,
    updated TIMESTAMP,
    created TIMESTAMP default now()
);

CREATE OR REPLACE FUNCTION update_users()	
RETURNS TRIGGER AS $$
BEGIN
    NEW.updated = now();
    RETURN NEW;	
END;
$$ language 'plpgsql';

CREATE TRIGGER update_users BEFORE INSERT OR UPDATE ON users FOR EACH ROW EXECUTE PROCEDURE  update_users();

