package src.main.java.Level3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int marks;
    String name;

    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
}

class Student121 implements Comparable<Student121>{
    int marks;
    String name;

    Student121(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student121 s){
        return this.marks-s.marks;
    }
}

public class CompareablevsComparator {
    public static void main(String [] args){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Aman",10));
        list.add(new Student("Yashi",90));
        list.add(new Student("Rohit",60));

        Collections.sort(list);
        System.out.println("Sorted By Marks:");
        for(Student s: list){
            System.out.println(s.name+" "+s.marks);
        }

        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("Sorted By Names:");
        for(Student s: list){
            System.out.println(s.name+" "+s.marks);
        }

        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(5);
        l1.add(3);
        l1.add(8);
        l1.add(7);
        l1.add(11);
        //task1
        Collections.sort(l1);
        System.out.println("Ascending Order: ");
        for(Integer i:l1){
            System.out.print(i+" ");
        }
        //task 2
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("\nDescending Order: ");
        for(Integer i:l1){
            System.out.print(i+" ");
        }
        //task 3
        ArrayList<Student121> l2=new ArrayList<>();
        l2.add(new Student121("Rohit",60));
        l2.add(new Student121("Yashi",90));
        l2.add(new Student121("Aman", 50));
        l2.add(new Student121("Umaang",60));

        Collections.sort(l2);
        for(Student121 s:l2){
            System.out.println(s.name+" "+s.marks);
        }

        //task 4
        Collections.sort(l2,new Comparator<Student121>(){
            @Override
            public int compare(Student121 a,Student121 b){
                return a.name.compareTo(b.name);
            }
        });

        for(Student121 s: l2){
            System.out.println(s.name+" "+s.marks);
        }

        //challenge task
        //part1:marks by descending
        Collections.sort(l2,new Comparator<Student121>(){
            @Override
            public int compare(Student121 a, Student121 b){
                if(a.marks==b.marks){
                    return a.name.compareTo(b.name);
                }
                else{
                    return b.marks-a.marks;
                }
            }
        });
        System.out.print("Descending Order of Marks: ");
        for(Student121 s: l2){
            System.out.println(s.marks+" "+s.name);
        }
    }
}