\echo 'patch0001'

create table if not exists teams (
    id serial PRIMARY KEY,
    name varchar(40),
    fury real not null check (fury >=-1 AND fury <=1),
    sociality real not null check (sociality >=-1 AND sociality <=1),
    updated TIMESTAMP default now(),
    created TIMESTAMP default now()
);
CREATE TRIGGER update_teams BEFORE UPDATE ON teams FOR EACH ROW EXECUTE PROCEDURE updated();
ALTER TABLE users ADD COLUMN team_id int REFERENCES teams;

create table if not exists members (
    id serial PRIMARY KEY,
    name varchar(40),
    fury real not null check (fury >=-1 AND fury <=1),
    sociality real not null check (sociality >=-1 AND sociality <=1),
    sex sex_type,
    team_id integer REFERENCES teams,
    updated TIMESTAMP default now(),
    created TIMESTAMP default now()
);
CREATE TRIGGER update_members BEFORE UPDATE ON members FOR EACH ROW EXECUTE PROCEDURE updated();


insert into db_version values (1);
