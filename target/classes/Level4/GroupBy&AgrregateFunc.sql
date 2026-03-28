--either in GROUP BY OR inside aggregate function
--count
select name,count(*) from employee group by name;
--sum
select name,sum(salary) from employee group by name;
--Average (AVG)
select name, avg(salary) from employee group by name;
--Min/Max
select name, Min(salary),Max(Salary) from employee group by name;
--Having-->It filters groups
select name,count(*) from employee group by name having count(*)>1;

--Mini task day 5-->
select count(*) from employee;

select sum(salary) as total_salary from employee;

select name, sum(salary) from employee group by name;

select name, avg(salary) from employee group by name;

select name, count(*) from employee group by name;

select name, count(*) from employee GROUP BY name having count(*)>1;

select max(salary) from employee;

select name, sum(salary) from employee group by name order by sum(salary) desc, name desc;

select name, avg(salary) from employee where salary>20000 group by name;