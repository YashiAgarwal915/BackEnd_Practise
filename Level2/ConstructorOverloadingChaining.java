package Level2;

class Student1{
    String name;
    int marks;

    Student1(){
        name="unknown";
        marks=0;
    }
    Student1(String name){
        this.name=name;
    }
    Student1(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Marks are: "+marks);
    }
}

class Area{
    int length;
    int width;

    Area(){
    }

    Area(int length){
        this.length=length;
    }

    Area(int length, int width){
        this.length=length;
        this.width=width;
    }

    int area(){
        if(length==0 && width==0){
            return 1*1;
        }
        else if(width==0){
            return length*length;
        }
        else{
            return length*width;
        }
    }
}

class Bank1{
    String accountHolder;
    double balance;

    Bank1(){
        accountHolder="unknown";
        balance=0;
    }
    Bank1(String accountHolder){
        this.accountHolder=accountHolder;
        balance=0;
    }
    Bank1(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void displayBank(){
        System.out.println("Account Holder is: "+accountHolder);
        System.out.println("Balance is: "+balance);
    }
}

class Laptop{
    String brand;
    String ram;
    double price;
//this() = Calls another constructor of SAME class
    Laptop(){
        this("unknown","unknown",0);
    }
    Laptop(String brand){
        this(brand,"unknown",0);
    }
    Laptop(String brand, String ram){
        this(brand, ram, 0);
    }
    Laptop(String brand, String ram, double price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    void displayLapi(){
        System.out.println("Brand is: "+brand);
        System.out.println("RAM is: "+ram);
        System.out.println("Price is: "+price);
    }
}

public class ConstructorOverloadingChaining {
    public static void main(String[] args){
        Student1 s1=new Student1();
        Student1 s2=new Student1("Yashi");
        Student1 s3=new Student1("Acchoo",345);
        s1.display();
        s2.display();
        s3.display();

        Area a1=new Area();
        Area a2=new Area(10);
        Area a3=new Area(10,20);
        System.out.println("Default area: " + a1.area());
        System.out.println("Square Area is: "+a2.area());
        System.out.println("Reactangle Area is: "+a3.area());

        Bank1 b1=new Bank1();
        b1.displayBank();
        Bank1 b2=new Bank1("Yashi");
        b2.displayBank();
        Bank1 b3=new Bank1("Yashi",1234123);
        b3.displayBank();

        Laptop l1=new Laptop();
        l1.displayLapi();;
        Laptop l2=new Laptop("Dell");
        l2.displayLapi();
        Laptop l3=new Laptop("Lenovo","16 GB");
        l3.displayLapi();
        Laptop l4=new Laptop("HP","8 GB",1234543);
        l4.displayLapi();
    }
}
