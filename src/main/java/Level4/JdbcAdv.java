package Level4;
import java.sql.*;
import java.util.*;
class Students{
    int id;
    String name;

    Students(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class StudentsDAO{
    Connection con;

    StudentsDAO() throws Exception{
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqlpractise","postgres","postgres123");
    }

//create-->
void addStudent(Students s) throws Exception{
    PreparedStatement ps= con.prepareStatement(
        "INSERT INTO STUDENTS VALUES (?,?)"
    );
    ps.setInt(1,s.id);
    ps.setString(2,s.name);
    ps.executeUpdate();
}

//Read All
List<Students> getStudents() throws Exception{
    List<Students> list=new ArrayList<>();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from students");

    while(rs.next()){
        list.add(new Students(
            rs.getInt("id"),
            rs.getString("name")
        ));
    }
    return list;
}
//read by id
Students getStudentById(int id) throws Exception{
    PreparedStatement ps = con.prepareStatement(
        "select * from students where id=?"
    );
    ps.setInt(1,id);

    ResultSet rs = ps.executeQuery();

    if(rs.next()){
        return new Students(
            rs.getInt("id"),
            rs.getString("name")
        );
    }
    return null;
}

Students getStudentByName(String name) throws Exception{
    PreparedStatement ps = con.prepareStatement(
        "select * from students where name=?"
    );
    ps.setString(1,name);

    ResultSet rs = ps.executeQuery();

    if(rs.next()){
        return new Students(
            rs.getInt("id"),
            rs.getString("name")
        );
    }
    return null;
}

//update
void updateStudents(int id, String name) throws Exception{
    PreparedStatement ps=con.prepareStatement(
        "update Students set name=? where id=?"
    );

    ps.setString(1,name);
    ps.setInt(2,id);
    ps.executeUpdate();
}
//delete
void deleteStudents(int id) throws Exception{
    PreparedStatement ps=con.prepareStatement(
        "delete from students where id=?"
    );
    ps.setInt(1,id);
    ps.executeUpdate();
}
void close() throws Exception {
    con.close();
}
}


public class JdbcAdv {
    public static void main(String[] args) throws Exception {
        StudentsDAO dao=new StudentsDAO();
        dao.addStudent(new Students(7,"Anshul"));
        dao.addStudent(new Students(9,"Aswin"));
        dao.addStudent(new Students(8,"Aastha"));

        System.out.println("All Students: ");
        for(Students s: dao.getStudents()){
            System.out.println(s.id+" "+s.name);
        }

        Students s=dao.getStudentById(1);
        if(s != null){
            System.out.println("Student 1: " + s.name);
        } else {
            System.out.println("Student not found");
        }

        Students s1=dao.getStudentByName("Yashi");
        if(s1 != null){
            System.out.println("Student 1: " + s1.name);
        } else {
            System.out.println("Student not found");
        }


        dao.updateStudents(5, "Rashi");

        dao.deleteStudents(6);
        System.out.println("All Students: ");
        for(Students s2: dao.getStudents()){
            System.out.println(s2.id+" "+s2.name);
        }

        dao.close();
    }
    

}
