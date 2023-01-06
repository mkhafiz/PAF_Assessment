drop database if exists eshop;

create database eshop;

use eshop;

create table customers (
    name char(32) not null,
    address varchar(128) not null,
    email varchar(128) not null
);

LOAD DATA LOCAL INFILE 'C:\Users\kayu\vttp2022\PAF\eshop\database\data.csv'
INTO TABLE customers
FIELDS TERMINATED BY ':'
-- LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

-- BULK INSERT SchoolsTemp
--     FROM 'C:\Users\kayu\vttp2022\PAF\eshop\database\data.csv'
--     WITH
--     (
--     FIRSTROW = 2,
--     FIELDTERMINATOR = ':',  --CSV field delimiter
--     ROWTERMINATOR = '\n',   --Use to shift the control to next row
--     -- ERRORFILE = 'C:\Users\kayu\vttp2022\PAF\eshop\database\dataErrorRows.csv',
--     TABLOCK
--     )

