package com.yashi.model;

public class Membership {
    public int id;
    public int memberId;
    public int trainerId;
    public int fee;

    public Membership(int id,int memberId, int trainerId, int fee){
        this.id=id;
        this.memberId=memberId;
        this.trainerId=trainerId;
        this.fee=fee;
    }
    public int getId() { return id; }
    public int getMemberId() { return memberId; }
    public int getTrainerId() { return trainerId; }
    public int getFee() { return fee; }
}
