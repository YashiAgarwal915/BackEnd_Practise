package Level2;

class Student2{
    private String name;
    private int marks;

    Student2(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public String setName(String name){
        this.name= name;
    }

    public int setMarks(int marks){
        this .marks=marks;
    }

    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Marks are: "+marks);
    }
}

class Bank2{
    private double balance;

    Bank2(double balance){
        this.balance=balance;
    }

    public double setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Low balance!");
        }
    }
    public void displayBalance(){
        System.out.println("Balance is: "+balance);
    }
}

class Rectangle{
    int length;
    int width;

    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    void displayRectangle(){
        System.out.println("Area of rectangle: "+ (length*width));
    }
}

class Animal{
    protected void sound(){
        System.out.println("Animal class");
    }
}

class Dog extends Animal{
    void bark(){
            System.out.println("Dog class");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student2 s1=new Student2("Yashi",274);
        s1.display();

        Bank2 b1=new Bank2(343555222.34);
        b1.displayBalance();

        Rectangle r1=new Rectangle(10,29);
        r1.displayRectangle();

        Dog d1=new Dog();
        d1.sound();
        d1.bark();
    }
}
