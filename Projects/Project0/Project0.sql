--My Database for Employees
drop table if exists employees; --drop before testing
create table if not exists employees(
	e_id serial primary key,
	e_firstname varchar(30) not null,
	e_lastname varchar(30) not null,
	e_username varchar(50) unique,
	e_password varchar(50) not null,
	e_role varchar(50),
	man_e_id integer references employees(e_id),
	isman BOOLEAN
);
--insert data for employees, making 5 employees 1 of which being a manager
insert into employees (e_firstname, e_lastname, e_username, e_password, e_role, man_e_id, isman) values ('Ethelda', 'Oldham', 'Username', 'Password', 'Soda Design Engineer', 1, false);
insert into employees (e_firstname, e_lastname, e_username, e_password, e_role, man_e_id, isman) values ('Marita', 'Sprowle', 'msprowle1', 'TbbnFk5TZ','Soda Resources Manager', 2, false);
insert into employees (e_firstname, e_lastname, e_username, e_password, e_role, man_e_id, isman) values ('Mayor', 'Doles', 'mdoles3', 'PwJrPFHBA','Soda Tech', 3, false);
insert into employees (e_firstname, e_lastname, e_username, e_password, e_role, man_e_id, isman) values ('Verla', 'Guyot', 'vguyot4', 'SJsaYammT','Soda Quality Control', 4, false);
insert into employees (e_firstname, e_lastname, e_username, e_password, e_role, man_e_id, isman) values ('Sully', 'Klain', 'Username1', 'Password','Soda Therapist', 5, true);










drop table if exists Customers; --drop before testing
create table if not exists Customers(
	c_id serial primary key,
	c_firstname varchar(30) not null,
	c_lastname varchar(30) not null,
	c_username varchar(50) unique,
	c_password varchar(50) not null,
	c_hasActiveOrder Boolean
);
--insert data for customers, example 5 customers 2 with orders
insert into Customers (c_firstname, c_lastname, c_username, c_password, c_hasActiveOrder) values ('John', 'Smith', 'Username', 'Password', false);
insert into Customers (c_firstname, c_lastname, c_username, c_password, c_hasActiveOrder) values ('Cherri', 'Tibbs', 'ctibbs1', 'aUExed', false);
insert into Customers (c_firstname, c_lastname, c_username, c_password, c_hasActiveOrder) values ('Gwenette', 'Cesconi', 'gcesconi2', '68pN3mfttC', false);
insert into Customers (c_firstname, c_lastname, c_username, c_password, c_hasActiveOrder) values ('Delaney', 'Orys', 'dorys3', '5gZScTtMK', true);
insert into Customers (c_firstname, c_lastname, c_username, c_password, c_hasActiveOrder) values ('Babbie', 'Coggeshall', 'bcoggeshall4', 'XGGAWrw', false);





drop table if exists Soda;
create table if not exists Soda(
	s_id serial primary key,
	s_name varchar(20) not null,
	s_brand varchar(30) not null,
	s_flavor varchar(30) not null,
	s_price int not null,
	s_quantity int not null,
	s_isDiet boolean not null,
	s_inStock boolean not null
);
--insert data for soda, example 5 unit of inventory.
insert into Soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock) values (1, 'Coca-Cola', 'Coca-Cola', 'flavor1', 5, 19, false, true);
insert into Soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock) values (2, 'Pepsi', 'Pepsi', 'flavor2', 4, 44, false, true);
insert into Soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock) values (3, 'Fanta', 'Coca-Cola', 'flavor3', 5, 46, true, true);
insert into Soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock) values (4, 'A&W', 'Pepsi', 'flavor4', 4, 47, true, true);
insert into Soda (s_id, s_name, s_brand, s_flavor, s_price, s_quantity, s_isDiet, s_inStock) values (5, 'Nuka-Cola', 'Vault-Tech', 'flavor5', 3, 19, false, true);

