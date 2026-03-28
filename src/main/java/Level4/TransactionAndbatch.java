package Level4;
import java.sql.*;
public class TransactionAndbatch {
    public static void main(String [] args) throws Exception{
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqlpractise","postgres","postgres123");

        try {
    con.setAutoCommit(false);

    // 🔹 Batch Insert
    PreparedStatement ps = con.prepareStatement(
        "insert into account values(?,?)"
    );

    for(int i=10;i<=15;i++){
        ps.setInt(1,i);
        ps.setInt(2,1000+i*50);
        ps.addBatch();
    }
    ps.executeBatch();

    // 🔹 Check balance
    PreparedStatement check = con.prepareStatement(
        "select balance from account where id=?"
    );
    check.setInt(1,1);
    ResultSet rs1 = check.executeQuery();

    if(rs1.next()){
        if(rs1.getInt("balance") < 500){
            throw new RuntimeException("Insufficient balance");
        }
    }

    // 🔹 Deduct
    PreparedStatement ps1 = con.prepareStatement(
        "update account set balance=balance-? where id=?"
    );
    ps1.setInt(1,500);
    ps1.setInt(2,1);
    ps1.executeUpdate();

    // 🔹 Add to another account
    PreparedStatement ps2 = con.prepareStatement(
        "update account set balance=balance+? where id=?"
    );
    ps2.setInt(1,500);
    ps2.setInt(2,2);
    ps2.executeUpdate();

    con.commit();
    System.out.println("Transaction Successful");

} catch (Exception e) {
    con.rollback();
    System.out.println("Transaction Failed");
}

    }
    
}
