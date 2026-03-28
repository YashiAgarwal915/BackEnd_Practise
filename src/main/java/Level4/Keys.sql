create table users(
    id int PRIMARY KEY,
    name varchar(50) NOT NULL,
    email varchar(100) UNIQUE
);

drop table orders;

create table orders(
    order_id int PRIMARY KEY,
    USER_ID INT,
    Foreign Key (USER_ID) REFERENCES users(id),
    amount int CHECK(AMOUNT>0)
);

ALTER TABLE ORDERS DROP CONSTRAINT 
INSERT INTO USERS VALUES(1,'YASHI','YASHI@123');
INSERT INTO USERS VALUES(1,'ROHIT','YASHI@123');