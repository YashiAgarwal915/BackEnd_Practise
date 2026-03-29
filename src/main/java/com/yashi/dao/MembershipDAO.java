package com.yashi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.yashi.model.Membership;
import com.yashi.util.DBConnection;

public class MembershipDAO {

    // ➕ ADD MEMBERSHIP
    public void addMembership(Membership m) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO membership (member_id, trainer_id, fee) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, m.getMemberId());   // ✅ getter
        ps.setInt(2, m.getTrainerId());
        ps.setInt(3, m.getFee());

        ps.executeUpdate();

        // ✅ get generated ID
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            System.out.println("Membership added with ID: " + id);
        }

        rs.close();
        ps.close();
        con.close();
    }

    // 📊 FULL DETAILS (JOIN)
    public void getFullDetails() throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "SELECT m.name AS member, t.name AS trainer, ms.fee " +
                       "FROM membership ms " +
                       "JOIN members m ON ms.member_id = m.id " +
                       "JOIN trainers t ON ms.trainer_id = t.id";

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        System.out.println("\n=== MEMBERSHIP DETAILS ===");
        System.out.println("Member | Trainer | Fee");
        System.out.println("--------------------------");

        while (rs.next()) {
            System.out.println(
                rs.getString("member") + " | " +
                rs.getString("trainer") + " | " +
                rs.getInt("fee")
            );
        }

        rs.close();
        ps.close();
        con.close();
    }

    // 💰 UPDATE FEE
    public void updateMembershipFee(int id, int newFee) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE membership SET fee = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, newFee);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Membership not found!");
        }

        ps.close();
        con.close();
    }

    // ❌ DELETE MEMBERSHIP
    public void deleteMembership(int id) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM membership WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Membership not found!");
        }

        ps.close();
        con.close();
    }

    // 🔥 DELETE BY TRAINER (for FK handling)
    public void deleteByTrainerId(int trainerId) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM membership WHERE trainer_id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, trainerId);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // 🔥 DELETE BY MEMBER
    public void deleteByMemberId(int memberId) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM membership WHERE member_id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, memberId);
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}