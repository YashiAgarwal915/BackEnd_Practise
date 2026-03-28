package Level2;

abstract class Vehicle1{
    abstract void start();
    abstract void stop();
}
class Car1 extends Vehicle1{
    @Override
    void start(){
        System.out.println("Car Starts");
    }
    @Override
    void stop(){
        System.out.println("Car Stops");
    }
}
class Bike extends Vehicle1{
    @Override
    void start(){
        System.out.println("Bike starts");
    }
    @Override
    void stop(){
        System.out.println("Bike Stops");
    }
}

abstract class ShapeIt{
    abstract int area();
}

class Rect extends ShapeIt{
    private int length;
    private int width;

    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int area(){
        return length*width;
    }
}

class circleClass extends ShapeIt{
    private int radius;
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int area(){
        return (int)(3.14*radius*radius);
    }
}

abstract class BankAcc1{
    abstract void deposit();
    abstract void withdraw();
}

class SavingsAcc extends BankAcc1{
    @Override
    public void deposit(){
        System.out.println("Amount deposited");
    }
    @Override
    public void withdraw(){
        System.out.println("Withdraw Sucessfull");
    }
}

class CurrentAcc extends BankAcc1{
@Override
    public void deposit(){
        System.out.println("Amount deposited");
    }
    @Override
    public void withdraw(){
        System.out.println("Withdraw Sucessfull");
    }
}

abstract class Device{
    abstract void powerOn();
}

class Phone extends Device{
    @Override
    public void powerOn(){
        System.out.println("Phone On");
    }
}

class Lapii extends Device{
    @Override
    public void powerOn(){
        System.out.println("Lappiii On");
    }
}

public class AbstractionProbs {
    public static void main(String[] args) {
        Vehicle1 v1=new Car1();
        Vehicle1 v2=new Bike();
        v1.start();
        v2.start();
        v2.stop();
        v1.stop();

        Rect si1= new Rect();
        si1.setLength(10);
        si1.setWidth(20);
        System.out.println("Area is: "+si1.area());

        circleClass cc1=new circleClass();
        cc1.setRadius(10);
        System.out.println("Area is: "+cc1.area());

        BankAcc1 ca1=new CurrentAcc();
        ca1.deposit();
        ca1.withdraw();

        BankAcc1 ca2=new SavingsAcc();
        ca2.deposit();
        ca2.withdraw();

        Device d1=new Phone();
        d1.powerOn();
        Device d2=new Lapii();
        d2.powerOn(); 
    }
}