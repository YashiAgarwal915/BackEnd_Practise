package src.main.java.Level3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) {
        System.out.println("Writting a File...");
        try{
            FileWriter fw=new FileWriter("Text.txt");
            fw.write("Hello World");
            fw.write("\nLearning Java");
            fw.write("\nBackend Engineer");
            fw.close();
            System.out.println("File writtern done Sucessfully!");
        }
        catch(IOException e){
            System.out.println("Error Occured");
        }

        System.out.println("Writing new file...");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("text1.txt"));
            bw.write("Hello World!");
            bw.close();
            System.out.println("File writtern through buffered writer");
        } catch (IOException ex) {
            System.out.println("Error Occured while writing..");
        }
        
        System.out.println("Reading from a file...");
        try{
            File f=new File("Text.txt");
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error while reading file");
        }

        System.out.println("Reading new file...");
        try {
            BufferedReader br=new BufferedReader(new FileReader("text1.txt"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } 
        catch (IOException ex) {
            System.out.println("IO Exception");
        }

        //task 1--->
        System.out.println("Writing Student.txt");
        try{
            FileWriter fw=new FileWriter("student.txt");
            fw.write("Student Marks");
            fw.write("\nYashi 90");
            fw.write("\nRohit 80");
            fw.write("\nAman 70");
            fw.close();
            System.out.println("File Writtern successfull");
        } 
        catch(IOException e){
            System.out.println("Error while writing in file: student.txt");
        }
        //task 2--->
        System.out.println("Reading file...");
        try{ 
            BufferedReader br=new BufferedReader(new FileReader("student.txt"));
            Scanner sc=new Scanner(br);
            int count=0;
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
                count++;
            }
            sc.close();
            //task 3
            System.out.println("File Reading Done...total line are: "+count);
        }
        catch(FileNotFoundException e){
            System.out.println("Error occured While reading student.txt");
        }

        //Highest Marks:
        try{ 
            FileReader fr=new FileReader("student.txt");
            Scanner sc=new Scanner(fr);
            String topper="";
            int max=0;
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                if(line.startsWith("Student"))
                    continue;
                String[] parts=line.split(" ");
                String name=parts[0];
                int marks=Integer.parseInt(parts[1]);
                if(marks>max){
                    max=marks;
                    topper=name;
                }
            }
            sc.close();
            System.out.println(topper+" "+max);
        }
        catch(FileNotFoundException e){
            System.out.println("Error occured");
        }
        catch(NumberFormatException e1){
            System.out.println("Number Exception");
        }
    }
}