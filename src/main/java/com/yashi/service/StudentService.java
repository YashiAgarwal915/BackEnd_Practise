package com.yashi.service;

import com.yashi.dao.StudentDAO;
import com.yashi.model.Student;

public class StudentService {
    StudentDAO dao;
    

    public StudentService() throws Exception {
        dao=new StudentDAO();
    }
    
    public void registerStudent(Student s) throws Exception{
        if(s.name==null || s.name.isEmpty()){
            System.out.println("Invalid Name");
            return;
        }

        dao.addStudent(s);
        System.out.println("Student Added");
    }

    public void showStudents() throws Exception{
        System.out.println("Checking...");
        for(Student s: dao.getAllStudents()){
            System.out.println(s.id+" "+s.name);
        }
    }

    public void updateStudents(Student s) throws Exception{
        System.out.println("Updating name using id of student");
        dao.updateStudents(s);
        System.out.println("Student Updated");
    }

    public void deleteStudentsById(Student s) throws Exception{
        dao.deleteStudentsById(s);
        System.out.println("Student Deleted by ID");
    }

    public void deleteStudentsByName(Student s) throws Exception{
        dao.deleteStudentsByName(s);
        System.out.println("Student Deleted by Name");
    }


}
