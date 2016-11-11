\echo 'patch0002'

CREATE TYPE item_type AS ENUM ('weapon', 'armor', 'potion', 'item');

create table if not exists items (
    id serial PRIMARY KEY,
    name varchar(40),
    description varchar(256),
    type item_type,
    weight real not null check(weight >=0)
);

create table if not exists bonuses (
    id serial PRIMARY KEY
);

CREATE TYPE armor_type AS ENUM ('head', 'shoulders', 'chest', 'wrist', 'hands', 'waist', 'legs', 'feet', 'cloak', 'necklace', 'ring');

create table if not exists armors (
    item_id int not null REFERENCES items(id),
    type armor_type,
    armor int,
    bonus_id int REFERENCES bonuses(id)
);

CREATE TYPE weapon_kind AS ENUM ('two hand sword', 'one hand sword', 'two hand axe', 'one hand axe', 'two hand mace', 'one hand mace', 'bow', 'slingshot', 'shield');

create table if not exists weapons (
    item_id int not null REFERENCES items(id),
    kind weapon_kind,
    damage real,
    armor int,
    bonus_id int REFERENCES bonuses(id)
);
