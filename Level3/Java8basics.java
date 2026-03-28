package src.main.java.Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Add{
    int sum(int a ,int b);
}


class Student8 implements Comparable<Student8> {
    int marks;
    String name;

    Student8(int marks, String name){
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Student8 s){
        return this.marks - s.marks; // sort by marks
    }
}

public class Java8basics {
    public static void main(String[] args){

        // THREAD (OLD + LAMBDA)
        for(int i=0;i<3;i++){

            // Old way
            new Thread(new Runnable(){
                @Override
                public void run(){
                    System.out.println("Running thread");
                }
            }).start();

            // Lambda
            new Thread(() -> {
                System.out.println("Thread Running");
            }).start();
        }

        //  LIST + SORT
        ArrayList<Student8> list = new ArrayList<>();
        list.add(new Student8(90,"Yashi"));
        list.add(new Student8(60,"Rohit"));
        list.add(new Student8(80,"Aman"));

        // Sort by marks (Comparable)
        Collections.sort(list);
        System.out.println("Sorted by Marks:");
        for(Student8 s : list){
            System.out.println(s.name + " " + s.marks);
        }

        //  OLD Comparator
        Collections.sort(list, new Comparator<Student8>(){
            @Override
            public int compare(Student8 a, Student8 b){
                return a.name.compareTo(b.name);
            }
        });

        // LAMBDA Comparator 
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("Sorted by Name:");
        for(Student8 s : list){
            System.out.println(s.name + " " + s.marks);
        }

        list.forEach(n->System.out.println(n));

        Add obj=(a,b)->a+b;
        System.out.println(obj.sum(2,3));
    }
}
