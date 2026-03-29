package com.yashi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yashi.model.Trainer;
import com.yashi.util.DBConnection;

public class TrainerDAO {

    // ➕ ADD TRAINER (FIXED)
    public void addTrainer(Trainer t) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO trainers (name, speciality) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, t.getName());        // ✅ use getter
        ps.setString(2, t.getSpeciality());  // ✅ use getter

        ps.executeUpdate();

        // ✅ get generated ID
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            int generatedId = rs.getInt(1);
            System.out.println("Trainer added with ID: " + generatedId);
        }

        // ✅ close resources
        rs.close();
        ps.close();
        con.close();
    }

    // 📋 GET ALL TRAINERS
    public List<Trainer> getAllTrainer() throws Exception {
        Connection con = DBConnection.getConnection();

        List<Trainer> list = new ArrayList<>();

        String query = "SELECT * FROM trainers";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            list.add(new Trainer(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("speciality")
            ));
        }

        rs.close();
        ps.close();
        con.close();

        return list;
    }

    // ✏️ UPDATE SPECIALITY
    public void updateTrainerSpeciality(int id, String speciality) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE trainers SET speciality = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, speciality);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Trainer not found!");
        }

        ps.close();
        con.close();
    }

    // ❌ DELETE TRAINER
    public void deleteTrainer(int id) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM trainers WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if (rows == 0) {
            System.out.println("Trainer not found!");
        }

        ps.close();
        con.close();
    }
}