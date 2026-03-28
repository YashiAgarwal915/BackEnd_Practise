create index idx_name on employee(name);

create index idx_salary on employee(salary);

select * from employee where name='YASHI';

select * from employee where salary>20000;

select * from employee where id=1;

select * from employee where name like '%ASHI';

create index idx_name_sal on employee(name,salary);