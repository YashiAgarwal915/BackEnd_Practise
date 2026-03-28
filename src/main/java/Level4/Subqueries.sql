select * from employee where salary >(select avg(salary) from employee);

--scalar subquery-->usually returns 1 value
select * from employee where salary > (select max(salary) from employee);

--subquery with IN--> multiple values allowed
select * from employee where id in(select id from employee where salary>20000);

--Subquery with exists-->check if related data exist->//better for large dataset
select * from students s where exists (select 1 from marks m where s.id=m.student_id );

--Subquery with not exists--> not related data
select * from students s where not exists(select 1 from marks m where s.id=m.student_id);

--Employee earning above average--:
select * from employee where salary > (select avg(salary) from employee);
--Employee with salary>max salary-edge casee
select * from employee where salary> (select MAX(salary) from employee);
-- students who have  marks
select * from students s where exists (select 1 from marks m where s.id=m.student_id);
--students with no marks
select * from students s where not exists (select 1 FROM marks m where s.id=m.student_id);
--Use IN to find employees with salary > 50000
select * from employee where salary in(select salary from employee where salary>50000);

select s.name, (select count(*) from marks m where s.id=m.student_id) as total_exams from student s;