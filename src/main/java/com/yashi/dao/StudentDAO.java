package com.yashi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yashi.model.Student;

public class StudentDAO {
    Connection con;

public StudentDAO() throws Exception{
    con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqlpractise","postgres","postgres123");
}

public void addStudent(Student s) throws Exception{
    PreparedStatement ps=con.prepareStatement(
        "INSERT INTO STUDENTS VALUES(?,?)"
    );
    ps.setInt(1,s.id);
    ps.setString(2,s.name);
    ps.executeUpdate();
}

public void updateStudents(Student s) throws Exception{
    PreparedStatement ps=con.prepareStatement(
        "update students set name where id=?"
    );
    ps.setString(1,s.name);
    ps.setInt(2,s.id);
    ps.executeUpdate();
}

public List<Student> getAllStudents() throws Exception{
    List<Student> list=new ArrayList<>();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("Select * from Students");
    while(rs.next()){
        list.add(new Student(rs.getInt("id"),rs.getString("name")));
    }
    return list;
}

public void deleteStudentsById(Student s) throws SQLException{
    PreparedStatement ps=con.prepareStatement(
        "delete from students where id=?"
    );
    ps.setInt(1,s.id);
    ps.executeUpdate();
}

public void deleteStudentsByName(Student s) throws SQLException{
    PreparedStatement ps=con.prepareStatement(
        "delete from students where name=?"
    );
    ps.setString(1,s.name);
    ps.executeUpdate();
}
}