--Total marks per student

select s.name , sum(m.marks) as total_marks from Students s join marks m on s.id=m.student_id group by s.name;

-- Average marks:
select s.name, avg(m.marks) as average_marks from students s join marks m on s.id=m.student_id group by s.name;

--count of exam
SELECT s.name, count(m.marks)as Exam from students s join marks m on s.id=m.student_id group by s.name;

select s.name, sum(m.marks) as total_marks from students s join marks m on s.id=m.student_id group by s.name order by total_marks desc limit 1;

select s.name , avg(m.marks) as average_marks from student s join marks m on s.id=m.student_id group by name having avg(m.marks)>70;

select s.name, sum(m.marks) from student s left join marks m on s.id=m.student_id group by s.name order by s.name desc;

select s.name, sum(m.marks) from students s join marks m on s.id=m.student_id group by s.name having sum(m.marks)>150;

--FROM → JOIN → WHERE → GROUP BY → HAVING → ORDER BY