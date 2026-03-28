package Level4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//Modal layer-->
class StudentL{
    int id;
    String name;

    StudentL(int id, String name){
        this.id=id;
        this.name=name;
    }
}
//DAO-->database layer
class StudentDAO{
Connection con;

StudentDAO() throws Exception{
    con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqlpractise","postgres","postgres123");
}

void addStudent(StudentL s) throws Exception{
    PreparedStatement ps=con.prepareStatement(
        "INSERT INTO STUDENTS VALUES(?,?)"
    );
    ps.setInt(1,s.id);
    ps.setString(2,s.name);
    ps.executeUpdate();
}

List<StudentL> getAllStudents() throws Exception{
    List<StudentL> list=new ArrayList<>();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("Select * from Students");
    while(rs.next()){
        list.add(new StudentL(rs.getInt("id"),rs.getString("name")));
    }
    return list;
}
}

//Service layer-->Business logic

class StudentService{
    StudentDAO dao;

    StudentService() throws Exception {
        dao=new StudentDAO();
    }

    void registerStudent(StudentL s) throws Exception{
        if(s.name==null || s.name.isEmpty()){
            System.out.println("Invalid Name");
            return;
        }

        dao.addStudent(s);
        System.out.println("Student Added");
    }

    void showStudents() throws Exception{
        for(StudentL s: dao.getAllStudents()){
            System.out.println(s.id+" "+s.name);
        }
    }
}

//Main--Controller layer
public class Layering {
    public static void main(String[] args) throws Exception {
        StudentService service=new StudentService();
        service.registerStudent(new StudentL(20,"Yashi"));
        service.registerStudent(new StudentL(21,""));

        service.showStudents();
    }
    
}
