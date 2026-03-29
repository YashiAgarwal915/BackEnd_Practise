package com.yashi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yashi.model.Member;
import com.yashi.util.DBConnection;

public class MemberDAO {

    // ➕ ADD MEMBER
    public void addMember(Member m) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO members (name, age) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, m.getName());  // ✅ getter
        ps.setInt(2, m.getAge());

        ps.executeUpdate();

        // ✅ get generated ID
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            System.out.println("Member added with ID: " + id);
        }

        rs.close();
        ps.close();
        con.close();
    }

    // 📋 GET ALL MEMBERS
    public List<Member> getAllMembers() throws Exception {
        Connection con = DBConnection.getConnection();

        List<Member> list = new ArrayList<>();

        String query = "SELECT * FROM members";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new Member(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age")
            ));
        }

        rs.close();
        ps.close();
        con.close();

        return list;
    }

    // ❌ DELETE MEMBER
    public void deleteMember(int id) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM members WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Member not found!");
        }

        ps.close();
        con.close();
    }
}