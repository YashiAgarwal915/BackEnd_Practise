-- Active: 1774411158242@@127.0.0.1@5432@sqlpractise
create table student (
    id INT,
    name VARCHAR(50),
    marks INT
);

INSERT INTO STUDENT VALUES(1,'YASHI',90);
INSERT INTO STUDENT VALUES(2,'ROHIT',80);

INSERT INTO STUDENT VALUES(3,'AMAN',50);

insert into student values(4,'PRATIK',40);
insert into student values(6,'MANISH');


SELECT * FROM STUDENT;

select name, marks from student;  

select * from student where marks>70;

select * from student where name='YASHI';

--Mini task day 1
create table EMPLOYEE(
    ID INT,
    NAME VARCHAR(50),
    SALARY DECIMAL(10,2)
);

INSERT INTO EMPLOYEE VALUES(1,'YASHI',100000);
INSERT INTO EMPLOYEE VALUES(2,'ROHIT',50000);
INSERT INTO EMPLOYEE VALUES(3,'AMAN',20000);
INSERT INTO EMPLOYEE VALUES (4,'PRATIK',30000.50);
INSERT INTO EMPLOYEE VALUES (5,'GIRIRAJ',10000);

SELECT * FROM EMPLOYEE;

SELECT * FROM EMPLOYEE WHERE SALARY>50000;

SELECT NAME FROM EMPLOYEE;

select * from employee where salary between 20000 and 80000;

select name from employee where name like 'A%';

select name from employee where salary = 10000 or salary= 100000;

--Mini task day2
select * from employee where salary>30000 and name like 'R%';

select * from employee where salary in (10000,50000);

select * from employee where salary between 10000 and 50000;

select * from employee where upper(name) like '%A%';

select * from employee where salary between 20000 and 100000;

select * from employee where salary > 20000 and (name like 'A%' or name like'R%');

--Mini task day 3
select * from employee order by salary;

select * from employee order by name desc;

select * from employee order by salary desc limit 2;

select distinct salary from employee order by salary desc limit 1 offset 1;

select * from employee where salary>20000 order by salary desc limit 3;

-- Top 3 employees sorted by salary DESC,
-- but if salary same → name ASC

select * from employee order by salary desc, name asc limit 3;

create table Account(
    id int PRIMARY key,
    balance int
);

create table members(
    id int primary key,
    name VARCHAR(50),
    age int
);

create table trainers(
    id int primary key,
    name varchar(50),
    speciality varchar(50)
);

create table membership(
    id int primary key,
    member_id int,
    trainer_id int,
    fee int,
    FOREIGN KEY(member_id) REFERENCES members(id),
    FOREIGN key (trainer_id) REFERENCES trainers(id)
);



ALTER TABLE membership
DROP CONSTRAINT membership_member_id_fkey;

ALTER TABLE membership
ADD CONSTRAINT membership_member_id_fkey
FOREIGN KEY (member_id)
REFERENCES members(id)
ON DELETE CASCADE;