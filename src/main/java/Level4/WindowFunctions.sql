--Row_number()--> give rank in continous manner
select name, salary, row_number() over (order by salary desc) as rank from employee;
--rank()-->same rank for same values
select name,salary ,rank() over (order by salary desc) as rank from employee;
--dense_rank()-->no gap 
select name, salary , dense_rank() over (order by salary desc) as rank from employee;
--partion_by()-->
select name,salary, rank() over (partition by salary order by salary desc) as new_sal from employee;

--top 2 employee
select * from (SELECT name, salary , row_number() over (order by salary desc) as rank from employee) t where rank<=2;
--top 3 highest salary
select name,salary,row_number() over (order by salary desc) from employee limit 3;