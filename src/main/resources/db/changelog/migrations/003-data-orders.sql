--changeset em2021:1
insert into netology.orders (date, customer_id, product_name, amount)
values ('03/07/2023', 1, 'Beer', 190);

insert into netology.orders (date, customer_id, product_name, amount)
values ('03/07/2023', 2, 'Water', 40);

insert into netology.orders (date, customer_id, product_name, amount)
values ('02/07/2023', 3, 'Bread', 100);
--rollback truncate table netology.orders;