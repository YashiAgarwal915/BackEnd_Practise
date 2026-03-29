package com.yashi.controller;

import java.util.Scanner;

import com.yashi.model.Member;
import com.yashi.model.Membership;
import com.yashi.model.Trainer;
import com.yashi.service.GymService;

public class GymMainApp {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        GymService service = new GymService();

        
        int choice;

        do {
            System.out.println("\n===== GYM MANAGEMENT SYSTEM =====");
            System.out.println("1: Add Member");
            System.out.println("2: Show Members");
            System.out.println("3: Delete Member");
            System.out.println("4: Add Membership");
            System.out.println("5: Show Full Details");
            System.out.println("6: Update Membership fee");
            System.out.println("7: Delete Membership");
            System.out.println("8: Add Trainer");
            System.out.println("9: Show Trainers");
            System.out.println("10: Update Trainer Speciality");
            System.out.println("11: Delete Trainer");
            System.out.println("12: Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                //  ADD MEMBER
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    service.addMember(new Member(0, name, age)); // ID = 0 (auto)
                    break;

                //  SHOW MEMBERS
                case 2:
                    service.showMembers();
                    break;

                //  DELETE MEMBER
                case 3:
                    service.showMembers();
                    System.out.print("Enter Member ID to delete: ");
                    int m_id = sc.nextInt();
                    service.deleteMember(m_id);
                    break;

                //  ADD MEMBERSHIP
                case 4:
                    service.showMembers();
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();

                    service.showTrainers();
                    System.out.print("Enter Trainer ID: ");
                    int trainerId = sc.nextInt();

                    System.out.print("Enter Fees: ");
                    int fees = sc.nextInt();

                    service.addMembership(new Membership(0, memberId, trainerId, fees));
                    break;

                //  FULL DETAILS
                case 5:
                    service.showFullDetails();
                    break;

                //  UPDATE FEE
                case 6:
                    System.out.print("Enter Membership ID: ");
                    int ms_id = sc.nextInt();

                    System.out.print("Enter new Fee: ");
                    int fee = sc.nextInt();

                    service.updateFee(ms_id, fee);
                    break;

                //  DELETE MEMBERSHIP
                case 7:
                    System.out.print("Enter Membership ID: ");
                    int ms_id1 = sc.nextInt();
                    service.deleteMembership(ms_id1); //  FIXED
                    break;

                //  ADD TRAINER
                case 8:
                    System.out.print("Enter Trainer Name: ");
                    String t_name = sc.nextLine();

                    System.out.print("Enter Speciality: ");
                    String speciality = sc.nextLine();

                    service.addTrainer(new Trainer(0, t_name, speciality));
                    break;

                //  SHOW TRAINERS
                case 9:
                    service.showTrainers();
                    break;

                //  UPDATE TRAINER
                case 10:
                    service.showTrainers();
                    System.out.print("Enter Trainer ID: ");
                    int t_id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new Speciality: ");
                    String t_speciality = sc.nextLine();

                    service.updateTrainerSpeciality(t_id, t_speciality);
                    break;

                //  DELETE TRAINER
                case 11:
                    service.showTrainers();
                    System.out.print("Enter Trainer ID: ");
                    int t_id2 = sc.nextInt();
                    service.deleteTrainer(t_id2);
                    break;

                case 12:
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}