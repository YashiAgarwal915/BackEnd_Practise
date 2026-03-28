package Level2;

class StudentConstructor{
    int id;
    String name;

    StudentConstructor(){
        System.out.println("Default Constructor");
    }

    StudentConstructor(int id, String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }
}

class Box{
    int length;
    int width;

    Box(int length){
        this.length=length;
        this.width=length;
    }

    Box(int length, int width){
        this.length=length;
        this.width=width;
    }

    int area(){
       return length*width;
    }
}

class Emp{
    String name;
    double salary;
    Emp(){
        this("yashi",5000000);
    }

    Emp(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name is: "+name);
        System.out.println("Salary is: "+salary);
    }

}

class Person1{
    String name;
    Person1(String name){
        this.name=name;
        System.out.println("Name is: "+name);
    }
}

class StudentPerson extends Person1{
    int rollNumber;
    StudentPerson(int rollNumber){
        super("Yashi");
        this.rollNumber=rollNumber;
        System.out.println("Roll Number is: "+rollNumber);
    }
}

class Animal2{
    Animal2(){
        System.out.println("Animal Constructor");
    }
}

class Mammal2 extends Animal2{
    Mammal2(){
        System.out.println("Mammal Constructor");
    }
}

class Dog2 extends Mammal2{
    Dog2(){
        System.out.println("Dog Constructor");
    }
}

public class ConstructorAdv {
    public static void main(String[]args){
        StudentConstructor s1=new StudentConstructor();
        StudentConstructor s2=new StudentConstructor(20, "Yashi");
        s1.display();
        s2.display();

        Box b1=new Box(10);
        Box b2=new Box(10,20);
        System.out.println("Area of Square is: "+b1.area());
        System.out.println("Area of Rectangle is: "+b2.area());

        Emp e1=new Emp();
        e1.display();

        Person1 p1=new StudentPerson(10);
        Dog2 d2=new Dog2();
    }
}