\echo 'patch0003'

create table if not exists inventories (
    member_id integer REFERENCES members(id),
    item_id int not null REFERENCES items(id),
    efficiency real default 1.0,
    created TIMESTAMP default now()
);

create table if not exists available_inventories (
    member_id integer REFERENCES members(id),
    item_id int not null REFERENCES items(id),
    created TIMESTAMP default now()
);

create table if not exists equipments (
    member_id integer REFERENCES members(id),
    main_hand integer REFERENCES items(id),
    off_hand integer REFERENCES items(id),
    head integer REFERENCES items(id),
    shoulders integer REFERENCES items(id),
    chest integer REFERENCES items(id),
    wrist integer REFERENCES items(id),
    hands integer REFERENCES items(id),
    waist integer REFERENCES items(id),
    legs integer REFERENCES items(id),
    feet integer REFERENCES items(id),
    cloak integer REFERENCES items(id),
    neck integer REFERENCES items(id),
    first_ring integer REFERENCES items(id),
    second_ring integer REFERENCES items(id),
    unique(member_id)
);
