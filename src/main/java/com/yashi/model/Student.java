package com.yashi.model;

public class Student {
    public int id;
    public String name;

    public Student(int id, String name){
        if(id<=0){
            throw new IllegalArgumentException("Invalid ID");
        }
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.id = id;
        this.name = name;
    }

    public Student(int id){
        if(id<0){
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id=id;
    }

    public Student(String name){
        if(name==null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid Name");
        }
        this.name=name;
    }
}