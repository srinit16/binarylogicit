-- create database bankingdb
create database bankingdb;
use bankingdb;
-- create table customer [ cust_id [ varchar(20) ], cust_name, cust_address, cust_phone ]
CREATE TABLE CUSTOMER(
	CUST_ID VARCHAR(20) primary key,
    CUST_NAME VARCHAR(30) not null,
    CUST_ADDRESS VARCHAR(50),
    CUST_PHONE VARCHAR(15)
);

-- create table AccountCategory [ category_id [int ], account_type ]
CREATE TABLE AccountCategory(
	CATEGORY_ID INT primary key,
    ACCOUNT_TYPE varchar(20)
);

-- creating table account--- [ acc_id, balance, overdraft_limit, cust_id, type_id [ int ] ]
-- DROP TABLE ACCOUNT;
CREATE TABLE ACCOUNT(
	ACC_ID INT primary key auto_increment,
    BALANCE DOUBLE DEFAULT 0.0,
    OVERDRAFT_LIMIT DOUBLE  DEFAULT 0,
    CUST_ID VARCHAR(20),
    TYPE_ID INT,
    constraint fk_acc_cust_custid foreign key(CUST_ID) references CUSTOMER(CUST_ID)
);

ALTER TABLE ACCOUNT ADD constraint acc_typeId_CategoryId foreign key(TYPE_ID) references AccountCategory(CATEGORY_ID);
