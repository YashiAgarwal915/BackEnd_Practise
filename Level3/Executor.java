package src.main.java.Level3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class BankExecutor{
    int balance=1000;
    synchronized void deposit(int amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" Balance "+ balance);
    }
}

class DownloadEx{
    synchronized void download(){
        for(int i=0;i<=3;i++){
            System.out.println("Downloading...");
        }
    }
}

class MusicEx{
    synchronized void music(){
        for(int i=0;i<=3;i++){
            System.out.println("Playing Music...");
        }
    }
}

class ChatEx{
    synchronized void chat(){
        for(int i=0;i<=3;i++){
            System.out.println("Chatting...");
        }
    }
}

class Challenge{
    public void login(){
        System.out.println("Login Sucessfull");
    }
    public void payment(){
        System.out.println("Payment Sucessfull");
    }
    public void notification(){
        System.out.println("Notification Sucessfull");
    }
    public void email(){
        System.out.println("Email Sucessfull");
    }
    public void logout(){
        System.out.println("Logout Sucessfull");
    }
}

public class Executor {
    public static void main(String[] args) {
        //task 1
        ExecutorService ex=Executors.newFixedThreadPool(3);
        for(int i=0;i<=10;i++){
            int taskid=i;
            ex.execute(()->{
                System.out.println("Task "+taskid+" by "+ Thread.currentThread().getName());
            });
        }
        ex.shutdown();

        //task 2
        ExecutorService ex1=Executors.newFixedThreadPool(4);
        BankExecutor b1=new BankExecutor();
        for(int i=0;i<5;i++){
            ex1.execute(() -> b1.deposit(100));
        }
        ex1.shutdown();

        //task 3
        ExecutorService ex2=Executors.newFixedThreadPool(3);
        DownloadEx d1=new DownloadEx();
        MusicEx m1=new MusicEx();
        ChatEx c1=new ChatEx();
        ex2.execute(() -> d1.download());
        ex2.execute(() -> m1.music());
        ex2.execute(() -> c1.chat());
        ex2.shutdown();

        //task 4
        ExecutorService ex3=Executors.newSingleThreadExecutor();
        ex3.execute(()->{
            d1.download();
            m1.music();
        });
        ex3.shutdown();

        //mini challenge
        ExecutorService ex4=Executors.newFixedThreadPool(2);
        Challenge ch1=new Challenge();
        ex4.execute(() -> ch1.login());
        ex4.execute(() -> ch1.payment());
        ex4.execute(() -> ch1.notification());
        ex4.execute(() -> ch1.email());
        ex4.execute(() -> ch1.logout());
        ex4.shutdown();
    } 
}
