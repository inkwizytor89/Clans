\echo 'init_0001'

insert into teams (name, fury, sociality) values ('załoga', 0.1, -0.1);
update users set team_id=1 where id =1;
insert into members (name, fury, sociality, sex, team_id) values ('samiec alfa', 0.1, -0.1, 'male', 1);
insert into members (name, fury, sociality, sex, team_id) values ('samica alfa', 0.1, -0.1, 'female', 1);
insert into members (name, fury, sociality, sex, team_id) values ('samiec beta', 0.1, -0.1, 'male', 1);
insert into members (name, fury, sociality, sex, team_id) values ('samica beta', 0.1, -0.1, 'female', 1);

insert into teams (name, fury, sociality) values ('muchomorki', 0.9, -0.2);
update users set team_id=2 where id =2;
insert into members (name, fury, sociality, sex, team_id) values ('zuza', 0, -0.7, 'female', 2);
insert into members (name, fury, sociality, sex, team_id) values ('marta', 0, -0.7, 'female', 2);
insert into members (name, fury, sociality, sex, team_id) values ('klaudia', 0.8, 0, 'female', 2);

insert into teams (name, fury, sociality) values ('banda', -0.5, -0.1234);
update users set team_id=3 where id =3;
insert into members (name, fury, sociality, sex, team_id) values ('kamil', -0.31, -0.111, 'male', 3);
insert into members (name, fury, sociality, sex, team_id) values ('wojtek', 0.321, 0.411, 'male', 3);
insert into members (name, fury, sociality, sex, team_id) values ('gumiś', 0.51, -0.141, 'male', 3);

insert into teams (name, fury, sociality) values ('gromada', 0.521, 0.6463);
update users set team_id=4 where id =4;
insert into members (name, fury, sociality, sex, team_id) values ('eryk', -0.31, -0.111, 'male', 4);
insert into members (name, fury, sociality, sex, team_id) values ('viktoria', 0.38, -0.64, 'female', 4);
insert into members (name, fury, sociality, sex, team_id) values ('dominika', 0.84, 0.1, 'female', 4);

insert into teams (name, fury, sociality) values ('team 5', 0.21, -0.31);
update users set team_id=5 where id =5;
insert into members (name, fury, sociality, sex, team_id) values ('Olek', 0.13, -0.21, 'male', 5);
insert into members (name, fury, sociality, sex, team_id) values ('Ola', 0.14, -0.11, 'female', 5);

insert into teams (name, fury, sociality) values ('team 6', 0.41, -0.41);
update users set team_id=6 where id =6;
insert into members (name, fury, sociality, sex, team_id) values ('Kamil', 0.13, -0.21, 'male', 6);
insert into members (name, fury, sociality, sex, team_id) values ('Kamila', 0.14, -0.11, 'female', 6);


insert into teams (name, fury, sociality) values ('team 7', 0.15, -0.15);
update users set team_id=7 where id =7;
insert into members (name, fury, sociality, sex, team_id) values ('Stanisław', 0.13, -0.21, 'male', 7);
insert into members (name, fury, sociality, sex, team_id) values ('Stasia', 0.14, -0.11, 'female', 7);


insert into teams (name, fury, sociality) values ('team 8', 0.61, -0.16);
update users set team_id=8 where id =8;
insert into members (name, fury, sociality, sex, team_id) values ('Bartek', 0.13, -0.21, 'male', 8);
insert into members (name, fury, sociality, sex, team_id) values ('Aniela', 0.14, -0.11, 'female', 8);


insert into teams (name, fury, sociality) values ('team 9', 0.17, -0.17);
update users set team_id=9 where id =9;
insert into members (name, fury, sociality, sex, team_id) values ('Gabriel', 0.13, -0.21, 'male', 9);
insert into members (name, fury, sociality, sex, team_id) values ('Gabrysia', 0.14, -0.11, 'female', 9);

