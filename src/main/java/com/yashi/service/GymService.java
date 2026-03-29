package com.yashi.service;
import java.util.List;

import com.yashi.dao.MemberDAO;
import com.yashi.dao.MembershipDAO;
import com.yashi.dao.TrainerDAO;
import com.yashi.model.Member;
import com.yashi.model.Membership;
import com.yashi.model.Trainer;

public class GymService {

    MemberDAO memberDAO = new MemberDAO();
    TrainerDAO trainerDAO = new TrainerDAO();
    MembershipDAO membershipDAO = new MembershipDAO();

    // ---------------- MEMBER ----------------
    public void addMember(Member m) throws Exception {
        try {
        memberDAO.addMember(m);
        System.out.println("Member added successfully");
        } catch (Exception e) {
        System.out.println("Error adding member: " + e.getMessage());
    }
    }

    public void showMembers() throws Exception {
        List<Member> list = memberDAO.getAllMembers();

        if (list.isEmpty()) {
            System.out.println("No members found!");
            return;
        }

        System.out.println("\n=== MEMBERS ===");
        for (Member m : list) {
            System.out.println(
                m.getId() + " | " + m.getName() + " | " + m.getAge()
            );
        }
    }

    // public void deleteMember(int id) throws Exception {
    //     memberDAO.deleteMember(id);
    //     System.out.println("🗑 Member Deleted!");
    // }
    public void deleteMember(int id) throws Exception {
        membershipDAO.deleteByMemberId(id); //  fix
        memberDAO.deleteMember(id);
        System.out.println("Member Deleted!");
    }

    // ---------------- TRAINER ----------------
    public void addTrainer(Trainer t) throws Exception {
        trainerDAO.addTrainer(t);
        System.out.println("Trainer Added!");
    }

    public void showTrainers() throws Exception {
        List<Trainer> list = trainerDAO.getAllTrainer();

        if (list.isEmpty()) {
            System.out.println("No trainers found!");
            return;
        }

        System.out.println("\n=== TRAINERS ===");
        for (Trainer t : list) {
            System.out.println(
                t.getId() + " | " + t.getName() + " | " + t.getSpeciality()
            );
        }
    }

    

    // public void deleteTrainer(int id) throws Exception {
    //     trainerDAO.deleteTrainer(id);
    //     System.out.println("🗑 Trainer Deleted!");
    // }
    // public void deleteTrainer(int id) throws Exception {
    // membershipDAO.deleteMembership(id); // first delete dependencies
    // trainerDAO.deleteTrainer(id);
    // System.out.println("Trainer Deleted!");
    //}

    public void deleteTrainer(int id) throws Exception {
        membershipDAO.deleteByTrainerId(id); //  fix
        trainerDAO.deleteTrainer(id);
        System.out.println("Trainer Deleted!");
    }

    public void updateTrainerSpeciality(int id, String speciality) throws Exception {
        trainerDAO.updateTrainerSpeciality(id, speciality);
        System.out.println("Speciality Updated!");
    }

    // ---------------- MEMBERSHIP ----------------
    public void addMembership(Membership ms) throws Exception {
        membershipDAO.addMembership(ms);
        System.out.println("Membership Added!");
    }

    public void showFullDetails() throws Exception {
        membershipDAO.getFullDetails(); // assuming it prints internally
    }

    public void updateFee(int id, int fee) throws Exception {
        membershipDAO.updateMembershipFee(id, fee);
        System.out.println("Fee Updated!");
    }

    public void deleteMembership(int id) throws Exception {
        membershipDAO.deleteMembership(id);
        System.out.println("Membership Deleted!");
    }
}
