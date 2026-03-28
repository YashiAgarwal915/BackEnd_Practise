package Level2;

class StudentSchool{
    String name;
    static String schoolName="IIT";

    StudentSchool(String name){
        this.name=name;
    }

    void display(){
        System.out.println(name+" studies at "+schoolName);
    }
}

class ObjectCounter {

    static int count = 0;

    ObjectCounter(){
        count++;
    }

    static void showCount(){
        System.out.println("Objects created: " + count);
    }
}

class BankAcc{
    String accountHolder;
    double balance;
    static double interestRate=5;

    BankAcc(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    void displayAcc(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Balance: "+balance);
        System.out.println("Interest Rate: "+interestRate);
    }
}

class MathHelper{
    static int add(int x, int y){
        return x+y;
    }
    static int multiply(int x, int y){
        return x*y;
    }
    static int power(int x, int y){
        int result=1;
        for(int i=0;i<y;i++){
            result=result*x;
        }
        return result;
    }
}

public class staticKeyword {
    public static void main(String[] args){
        StudentSchool s1=new StudentSchool("Yashi");
        StudentSchool s2=new StudentSchool("Achoo");
        s1.display();
        s2.display();
        StudentSchool.schoolName = "IIT Jodhpur";
        s1.display();
        s2.display();

        ObjectCounter o1 = new ObjectCounter();
        ObjectCounter o2 = new ObjectCounter();
        ObjectCounter o3 = new ObjectCounter();
        ObjectCounter.showCount();

        BankAcc ba1=new BankAcc("Yashi",12345);
        ba1.displayAcc();

        System.out.println(MathHelper.add(10,20));
        System.out.println(MathHelper.multiply(10,20));
        System.out.println(MathHelper.power(3,4));
    }
}
