package Level2;
class StudentDemo{
    String name;
    int rollNumber;
    int marks;
    void displayDetails(){
    System.out.println("Name: " + name);
    System.out.println("Roll: " + rollNumber);
    System.out.println("Marks: " + marks);
    }
    boolean isPass(){
        return marks >= 50;
    }
}

class BankAccount{
    String accountHolder;
    int balance;
    void deposit(int amount){
        balance+=amount;
    }
    void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Low Balance");
        }
    }
    void displayBalance(){
        System.out.println("Account Holder: "+ accountHolder +"\n"+ "Balance: "+ balance);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args){
        StudentDemo s1=new StudentDemo();
        s1.name="Yashi";
        s1.rollNumber=1;
        s1.marks=90;
        s1.displayDetails();
        if(s1.isPass()){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        StudentDemo s2=new StudentDemo();
        s2.name="Rohit";
        s2.rollNumber=2;
        s2.marks=45;
        s2.displayDetails();
        if(s2.isPass()){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }

        BankAccount account1=new BankAccount();
        account1.accountHolder="Yashi";
        account1.balance=1000000000;
        account1.deposit(12345678);
        account1.withdraw(345898765);
        account1.displayBalance();
    }
}
