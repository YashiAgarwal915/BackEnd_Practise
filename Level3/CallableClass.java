package src.main.java.Level3;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Square11 implements Callable<Integer>{
    int num;
    Square11(int num){
        this.num=num;
    }
    @Override
    public Integer call(){
        return num*num;
    }
}

class Sum implements Callable<Integer>{
    int num,sum=0;
    Sum(int num){
        this.num=num;
    }
    
    @Override
    public Integer call(){
        for(int i=1;i<=num;i++){
            try { Thread.sleep(500); } catch(Exception e){}
            sum+=i;
        }
        return sum;
    }
}

class FinBalance implements Callable<Integer>{
    int balance,interest;
    FinBalance(int balance, int interest){
        this.balance=balance;
        this.interest=interest;
    }
    public Integer call(){
        try { Thread.sleep(500); } catch(Exception e){}
        return balance+(balance*interest/100);
    }
}

class Downloading implements Callable<String>{
    @Override
    public String call(){
        return "downloading";
    }
}

class Processing implements Callable<String>{
    @Override
    public String call(){
        return "processing";
    }
}

class Uploading implements Callable<String>{
    @Override
    public String call(){
        return "uploading";
    }
}

public class CallableClass {
    public static void main(String[] args) {

        ExecutorService ex=Executors.newFixedThreadPool(2);

        //task 1
        Future<Integer> f1=ex.submit(new Square11(5));
        Future<Integer> f2=ex.submit(new Square11(10));
        Future<Integer> f3=ex.submit(new Square11(20));
        try {
            System.out.println("Square of 5 is: "+f1.get());
            System.out.println("Square of 10 is: "+f2.get());
            System.out.println("Square of 20 is: "+f3.get());
        } catch (InterruptedException ex1) {
            System.out.println("Error occured!");
        } catch (ExecutionException ex1) {
            System.out.println("Error occured!");
        }
        //task 2
        Future<Integer> f4=ex.submit(new Sum(5));
        Future<Integer> f5=ex.submit(new Sum(10));
        try {
            System.out.println("Sum till 5 is: "+f4.get());
            System.out.println("Sum till 10 is: "+f5.get());
        } catch (InterruptedException ex1) {
            System.out.println("Error occured!");
        } catch (ExecutionException ex1) {
            System.out.println("Error occured!");
        }
        //task 3
        Future<Integer> f6=ex.submit(new FinBalance(10000,10));
        try {
            System.out.println("Final Balance is: "+f6.get());
        } catch (Exception e) {
            System.out.println("Error occured");
        }
        //challenge task
        Future<String> f7=ex.submit(new Downloading());
        Future<String> f8=ex.submit(new Processing());
        Future<String> f9=ex.submit(new Uploading());
        try {
            System.out.println(f7.get());
            System.out.println(f8.get());
            System.out.println(f9.get());
        } catch (Exception e) {
            System.out.println("Error occured");
        }
        ex.shutdown();

        
    }
    
}
