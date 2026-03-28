package com.yashi.controller;
import java.util.Scanner;

import com.yashi.model.Student;
import com.yashi.service.StudentService;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
        System.out.println("Choice your option: ");
        System.out.println("1: Add Student");
        System.out.println("2: View Student");
        System.out.println("3: Update Student");
        System.out.println("4: Delete Student by ID");
        System.out.println("5: Delete Student by Name");
        System.out.println("6: Exit");
        ch=sc.nextInt();
        StudentService service=new StudentService();
        int id;
        String name;
        
        switch(ch){
            case 1: 
                System.out.println("Enter Student id and Student name: ");
                id=sc.nextInt();
                name=sc.next();
                service.registerStudent(new Student(id,name));
                break;
            case 2:
                service.showStudents();
                break;
            case 3:
                System.out.println("Enter Student id and Student name: ");
                id=sc.nextInt();
                name=sc.next();
                service.updateStudents(new Student(id,name));
                break;
            case 4:
                System.out.println("Enter Student id: ");
                id=sc.nextInt();
                service.deleteStudentsById(new Student(id));
                break;
            case 5:
                System.out.println("Enter Student name: ");
                name=sc.next();
                service.deleteStudentsByName(new Student(name));
                break;
            case 6:
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
    while(ch!=6);
    }
}
