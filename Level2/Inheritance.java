package Level2;

class Person{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    void displayPerson(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}

class StudentClass extends Person{
    private int rollNumber;

    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }

    void displayStudent(){
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Shape{
    private String color;

    public void setColor(String color){
        this.color=color;
    }

    void displayShape(){
        System.out.println("Color is: "+color);
    }
}

class RectangleShape extends Shape{
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

class Vehicle{
    private String brand;
    private double speed;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    void displayVehicle(){
        System.out.println("Brand is: "+brand+" And Speed is: "+speed);
    }
}

class Car extends Vehicle{
    private String fuelType;

    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }

    void displayCar(){
        System.out.println("Fuel Type is: "+fuelType);
    }

}

class Animal1{
    public void eyes(){
        System.out.println("Two Eyes");
    }
}

class Mammal extends Animal1{
    public void tail(){
        System.out.println("One Tail");
    }
}

class Dog1 extends Mammal{
    public void barks(){
        System.out.println("I m a Dogii");
    }
}

public class Inheritance {
    public static void main(String[] args){
        StudentClass sc1=new StudentClass();
        sc1.setRollNumber(1);
        sc1.setName("Yashi");
        sc1.setAge(25);
        sc1.displayPerson();
        sc1.displayStudent();

        RectangleShape rs1=new RectangleShape();
        rs1.setColor("Blue");
        rs1.setLength(10);
        rs1.setWidth(20);
        rs1.displayShape();
        System.out.println("Area is: " + rs1.area());

        Car c1=new Car();
        c1.setBrand("Honda");
        c1.setSpeed(120);
        c1.setFuelType("CNG");
        c1.displayVehicle();
        c1.displayCar();

        Dog1 d1=new Dog1();
        d1.eyes();
        d1.tail();
        d1.barks();
    }
}