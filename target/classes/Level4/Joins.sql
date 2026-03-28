-- Inner join--only matching records
select * from student s inner join employee e on s.id=e.id;

-- left join-- all students + matching employee
select * from student s left join employee e on s.id=e.id;

-- RIGHT JOIN-- ALL EMPLOYEE+MATCHING STUDENT
select * from student s right join employee e on s.id=e.id;

--join with filter
select s.name, e.salary from student s inner join employee e on s.id=e.id where e.salary>20000;

--Mini task day 4-->
CREATE TABLE STUDENTS (
    ID INT,
    NAME VARCHAR(50)
);

CREATE TABLE MARKS(
    STUDENT_ID INT,
    MARKS INT
);

INSERT INTO STUDENTS VALUES(1,'YASHI'),(2,'ROHIT'),(3,'AMAN');

INSERT INTO MARKS VALUES(1,90),(2,80);

--iNNER JOIN
SELECT * FROM STUDENTS S INNER JOIN MARKS M ON S.ID=M.STUDENT_ID;

--LEFT JOIN-->
--(LEFT JOIN +WHERE CONDITION ON RIGHT TABLE-->BEHAVES LIKE INNER JOIN)
SELECT * FROM STUDENTS S LEFT JOIN MARKS M ON S.ID=M.STUDENT_ID;

-- SHOW ALL STUDENTS WITH MARKS >80
SELECT * FROM STUDENTS S INNER JOIN MARKS M ON S.ID=M.STUDENT_ID WHERE M.MARKS>80;
                            --OR
SELECT * FROM STUDENTS S LEFT JOIN MARKS M ON S.ID=M.STUDENT_ID AND M.MARKS>80;
SELECT * FROM STUDENTS S LEFT JOIN MARKS M ON S.ID=M.STUDENT_ID WHERE M.MARKS IS NULL;