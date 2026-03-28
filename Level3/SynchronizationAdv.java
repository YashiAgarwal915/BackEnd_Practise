package src.main.java.Level3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Bnk{
    int bal=1000;
    void withdraw(int amount){
        synchronized(this){
            if(bal>=amount){
                bal-=amount;
                System.out.println(Thread.currentThread().getName()+" Balance is: "+bal);
            }
            else {
                System.out.println(Thread.currentThread().getName()+" Low Balance!");
            }
        }
    }
}

class Counterr{
    static int count=0;

    static synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName()+count);
    }
}

class Printer{
    void print(){
    synchronized(this){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" -> "+i);
            try { Thread.sleep(200); } catch(Exception e){}
        }
    }
}
}

public class SynchronizationAdv {
    public static void main(String[] args) {
        Bnk b1=new Bnk();
        //Counterr c1=new Counterr();
        //b1.withdraw(200);
        ExecutorService ex=Executors.newFixedThreadPool(3);
        for(int i=1;i<=3;i++){
            int id=i;
            ex.submit(() -> {
                b1.withdraw(200);
                Counterr.increment();
            });
        }

        Printer p1=new Printer();
        for(int i=1;i<3;i++){
            int id=i;
            ex.execute(()->{
                p1.print();
            });
        }
        ex.shutdown();
    }
}