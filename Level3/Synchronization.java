package src.main.java.Level3;

class BankSync{
    int balance=1000;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" trying....");

        if(balance>=amount){
            System.out.println("Processing....");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            balance-=amount;
            System.out.println("Remaining...."+balance);
        }
        else{
            System.out.println("Low Balance");
        }
    }

    synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" depositing...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        balance+=amount;
        System.out.println("Balance is: "+balance);
    }

    synchronized void checkBalance(){
        System.out.println(Thread.currentThread().getName()+" Checking...");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Balance in your account is: "+balance);
    }
}

class CounterSync{
    int counter=0;
    synchronized void increment(){
        System.out.println(Thread.currentThread().getName()+" Counter Started");
        for(int i=0;i<1000;i++){
        counter++;
        }
        System.out.println("Final Result: "+counter);
    }
}

public class Synchronization {
    public static void main(String[] args){
        BankSync b1=new BankSync();
        Thread t1=new Thread(()->b1.withdraw(200));
        //t1=b1.deposit(100);
        Thread t2=new Thread(()->b1.deposit(100));
        Thread t7=new Thread(()->b1.checkBalance());
        Thread t5=new Thread(()->b1.withdraw(300));
        Thread t6=new Thread(()->b1.deposit(200));
        Thread t8=new Thread(()->b1.checkBalance());
        t1.setName("User 1");
        t2.setName("User 2");
        t7.setName("User 3");
        t8.setName("User 4");
        t5.setName("User 5");
        t6.setName("User 6");
        t1.start();
        t2.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        CounterSync c1=new CounterSync();
        Thread t3=new Thread(()->c1.increment());
        Thread t4=new Thread(()->c1.increment());
        t3.setName("Rohit");
        t4.setName("Aman");
        t3.start();
        t4.start();

        Thread t9 = new Thread(() -> {
        for(int i=0;i<5;i++){
            b1.deposit(100);
        }
        });
        t9.start();


    }
    
}
