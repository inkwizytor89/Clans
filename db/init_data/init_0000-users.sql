\echo 'init_0000'

select add_user('kamil', 'kamil', 'kamil', 'male', 'kamil@emial.com');
select add_user('sylwia', 'sylwia', 'sylwia', 'female', 'sylwia@emial.com');
select add_user('adrian', 'adrian', 'adrian', 'male', 'adrian@emial.com');
select add_user('karol', 'karol', 'karol', 'male', 'karol@emial.com');
select add_user('user5', 'user5', 'user5', 'female', 'user5@emial.com');
select add_user('user6', 'user6', 'user6', 'female', 'user6@emial.com');
select add_user('user7', 'user7', 'user7', 'female', 'user7@emial.com');
select add_user('user8', 'user8', 'user8', 'male', 'user8@emial.com');
select add_user('user9', 'user9', 'user9', 'male', 'user9@emial.com');


insert into user_roles (user_id, role) values (get_user_id('kamil'), 'ADMIN');
insert into user_roles (user_id, role) values (get_user_id('sylwia'), 'ADMIN');
insert into user_roles (user_id, role) values (get_user_id('adrian'), 'ADMIN');
