package com.yashi.model;

public class Member {
    public int id;
    public String name;
    public int age;

    public Member(int id, String name, int age){
        if(id <= 0){
            throw new IllegalArgumentException("Invalid ID");
        }
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid Name");
        }
        if(age <= 0){
            throw new IllegalArgumentException("Invalid Age");
        }

        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}
