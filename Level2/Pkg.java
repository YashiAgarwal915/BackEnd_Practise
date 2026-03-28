package Level2;

class AccessTest{
    private int a;
    int b;
    protected int c;
    public int d;

    public void print(){
        System.out.println("a is: "+a+" b is: "+b+" c is: "+c+" d is: "+d);
    }
}
class Test extends AccessTest{ 
    @Override
    public void print(){
        // System.out.println("a is: "+a+" b is: "+b+" c is: "+c+" d is: "+d);
        System.out.println("b is: "+b+" c is: "+c+" d is: "+d);
    }
}

class Encap{
    private double balance;
    public Encap(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        System.out.println("Deposit Sucessfull!!, Balance is: "+(balance+=amount));
    }

    public void withdraw(double amount){
        if(amount<=balance){
            System.out.println("WithDraw Sucessfull!, Balance is: "+(balance-=amount));
        }
        else{
            System.out.println("Low Balance");
        }
    }
}

class PP{
    protected String name;
    PP(String name){
        this.name=name;
    }
}

class CC extends PP{

    public CC(String name) {
        super(name);
    }
    void print(){
            System.out.println("Name is: "+name);
    }
}

class DefTest{
    int z=10;
}
class T1 extends DefTest{
    public void print(){
        System.out.println("Default Variable Test: "+z);
    }
}

class PubTest{
    public int x=10;
}
class T2 extends PubTest{
    public void print(){
        System.out.println("Public Variable Test: "+x);
    }
}


public class Pkg {
    public static void main(String[] args) {
        AccessTest at=new AccessTest();
        at.print();
        Test t=new Test();
        t.print();
        Encap e1=new Encap(10000);
        //e1.setBalance(10000);
        e1.deposit(1999);
        e1.withdraw(100);
        e1.getBalance();
        CC c1=new CC("Yashi");
        c1.print();
        T1 t1 = new T1();
        t1.print();
        T2 t2 = new T2();
        t2.print();
    }
}
