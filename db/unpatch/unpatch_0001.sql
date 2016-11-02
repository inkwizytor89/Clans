\echo 'unpatch 0001'
drop table if exists members;

ALTER TABLE users DROP COLUMN team_id;
drop table if exists teams;
