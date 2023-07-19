--changeset em2021:1
insert into netology.customers (name, surname, age, phone_number)
values ('John', 'Black', 18, '3333333');

insert into netology.customers (name, surname, age, phone_number)
values ('Mike', 'White', 20, '4444444');

insert into netology.customers (name, surname, age, phone_number)
values ('Tom', 'Green', 35, '1111111');
--rollback truncate table netology.customers;