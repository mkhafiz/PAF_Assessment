drop database if exists eshop;

create database eshop;

use eshop;

create table customers (
    name char(32) not null,
    address varchar(128) not null,
    email varchar(128) not null
);

-- LOAD DATA LOCAL INFILE 'C:\Users\kayu\vttp2022\PAF\eshop\database\data.csv'
-- INTO TABLE customers
-- FIELDS TERMINATED BY ':'
-- -- LINES TERMINATED BY '\n'
-- IGNORE 1 ROWS;

INSERT INTO eshop.customers
VALUES ('fred','201 Cobblestone Lane','fredflintstone@bedrock.com'); 

INSERT INTO eshop.customers
VALUES ('sherlock','221B Baker Street, London','sherlock@consultingdetective.org'); 

INSERT INTO eshop.customers
VALUES ('spongebob','124 Conch Street, Bikini Bottom','spongebob@yahoo.com'); 

INSERT INTO eshop.customers
VALUES ('jessica','698 Candlewood Land, Cabot Cove','fletcher@gmail.com');

INSERT INTO eshop.customers
VALUES ('dursley','4 Privet Drive, Little Whinging, Surrey','dursley@gmail.com'); 

create table order_status (
    order_id char(8) not null,
    deliveryId varchar(128) not null,
    status char(10) not null,
    status_update datetime not null
)

drop database if exists estore;

create database estore;

use estore;

create table orders (
    order_id char(8) not null,
    deliveryId varchar(128) not null,
    name varchar(128) not null,
    address varchar(128) not null,
    email varchar(128) not null,
    status char(10) not null,
    orderDate varchar(50) not null
-- 	private List<LineItem> lineItems = new LinkedList<>();
);
