package Level4;
import java.sql.*;

public class Jdbc {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");


            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqlpractise","postgres","postgres123");

            PreparedStatement ps=con.prepareStatement(
                //"INSERT INTO STUDENTS VALUES(?,?)"
                //"select * from students where id=?"
                //"update students set name=? where id=?"
                "Delete from students where id=?"

            );
            ps.setInt(1,7);
            //ps.setString(1,"Tara");
            //ps.setInt(2,8);
            //ps.setInt(1,6);
             //ps.setString(2,"Umaang");
            int rows=ps.executeUpdate();
            System.out.println("Deleted: "+rows);
            // System.out.println("Rows Inserted: "+rows);

            Statement s= con.createStatement();
            ResultSet rs=s.executeQuery("select * from students");
            //ResultSet rs=ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
}
