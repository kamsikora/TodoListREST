create table todos (
    id bigint unsigned primary key auto_increment,
    text varchar(100) not null,
    done BIT
);

insert into todos (text, done) values ('Done todo', 1);
insert into todos (text, done) values ('Undone todo', 0);