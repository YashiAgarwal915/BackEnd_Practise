package com.yashi.model;

public class Trainer {
    public int id;
    public String name;
    public String speciality;

    public Trainer(int id,String name,String speciality){
        this.id=id;
        this.name=name;
        this.speciality=speciality;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpeciality() { return speciality; }
}
