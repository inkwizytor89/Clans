\echo 'unpatch0000'
DROP FUNCTION IF EXISTS add_user(TEXT, TEXT, TEXT, sex_type, TEXT);
DROP FUNCTION IF EXISTS check_password(TEXT, TEXT);
DROP FUNCTION IF EXISTS hash_password(TEXT, TEXT);
DROP FUNCTION IF EXISTS get_user_id(TEXT);
drop table if exists user_roles;
drop table if exists users;
drop table if exists db_version;
drop type sex_type;
