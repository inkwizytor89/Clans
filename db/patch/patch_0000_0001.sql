create table users (
    id serial,
    login varchar(40) UNIQUE,
    password VARCHAR(40),
    nick VARCHAR(40),
    email VARCHAR(40) UNIQUE,
    updated TIMESTAMP,
    created TIMESTAMP
);

select * from users;