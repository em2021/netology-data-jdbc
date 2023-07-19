create schema if not exists netology;

create table if not exists netology.customers (
	id serial primary key unique,
	name varchar(255) constraint name_contains_only_letters check (name similar to '[A-z]*'),
	surname varchar(255) constraint surname_contains_only_letters check (surname similar to '[A-z]*'),
	age int constraint age_is_positive check (age > 0),
	phone_number varchar(50) constraint phone_number_contains_only_numbers check (phone_number similar to '[0-9]*') unique
);

create table if not exists netology.orders (
	id serial primary key unique,
	date date not null,
	customer_id int not null references netology.customers (id),
	product_name varchar(255) not null,
	amount numeric not null constraint amount_is_positive check (amount > 0)
);