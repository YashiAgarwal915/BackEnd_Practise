package Level2;
class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Roll Number is: "+rollNumber);
        System.out.println("Marks are: "+marks);
    }
}

class Book{
    String title;
    String author;
    double price;

    Book(String title,String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void displayBook(){
        System.out.println("Title is: "+title);
        System.out.println("Author is: "+author);
        System.out.println("Price is: "+price);
    }

}

class Mobile{
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("Brand is: "+brand);
        System.out.println("Model is: "+model);
        System.out.println("Price is: "+price);
    }
}

class Bank{
    String accountHolder;
    double balance;

    Bank(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
        displayDetails();
    }

    void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            displayDetails();
        }
        else{
            System.out.println("Low Balance");
        }
    }
    void displayDetails(){
        System.out.println("Account Holder name is: "+accountHolder);
        System.out.println("Balance is: "+balance);
    }

}

public class ConstructorsPractise {
    public static void main(String[] args) {
        Student s1=new Student("Yashi",34,9876);
        s1.display();

        Book b1=new Book("Silicon dreams","Yashi Agarwal",499.60);
        b1.displayBook();

        Mobile m1=new Mobile("Nokia","wm123",234554);
        Mobile m2=new Mobile("Redmi","wm143",276454);
        m1.display();
        m2.display();

        Bank a1=new Bank("Yashi",3456789);
        a1.displayDetails();
        a1.deposit(7654567);
        a1.withdraw(78987);
    }
}
