package Level2;

interface Payment{
    void pay();
}

class CCPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Credit card Payment Done");
    }
}

class UPIPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("UPI Payment Done");
    }
}

class NBPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("NetBanking Payment Done");
    }
}

interface Flyable{
    void fly();
}

interface Swimable{
    void swim();
}

class Duck implements Flyable,Swimable{
    @Override
    public void fly(){
        System.out.println("Duck can fly");
    }
    @Override
    public void swim(){
        System.out.println("Duck can swim");
    }
}

interface Remote{
    void powerOn();
    void powerOff();
}

class TV implements Remote{
    @Override
    public void powerOn(){
        System.out.println("TV On");
    }
    @Override
    public void powerOff(){
        System.out.println("TV Off");
    }
}

class AC implements Remote{
    @Override
    public void powerOn(){
        System.out.println("AC On");
    }
    @Override
    public void powerOff(){
        System.out.println("AC Off");
    }
}

interface Connectable{
    void connectWifi();
}

interface Chargeable{
    void charge();
}

class SmartPhone implements Connectable, Chargeable{
    @Override 
    public void connectWifi(){
        System.out.println("Wifi Connected");
    }
    @Override
    public void charge(){
        System.out.println("Charging ON");
    }
}

public class InterfacesProbs {
    public static void main(String[] args){

        //task 1
        Payment p1=new CCPayment();
        Payment p2=new UPIPayment();
        Payment p3=new NBPayment();
        p1.pay();
        p2.pay();
        p3.pay();

        //task 2
        Flyable f1=new Duck();
        f1.fly();
        Swimable s1=new Duck();
        s1.swim();
        Duck d1=new Duck();
        d1.fly();
        d1.swim();

        //task 3
        Remote r1=new TV();
        r1.powerOn();
        r1.powerOff();
        Remote r2=new AC();
        r2.powerOn();
        r2.powerOff();

        //task 4
        Connectable c1=new SmartPhone();
        c1.connectWifi();
        Chargeable c2=new SmartPhone();
        c2.charge();
        SmartPhone c3=new SmartPhone();
        c3.connectWifi();
        c3.charge();
    }
}