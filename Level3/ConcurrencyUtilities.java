package src.main.java.Level3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
class BankLock{
    int balance=1000;
    ReentrantLock lock=new ReentrantLock();

    void withdraw(int amount){
        lock.lock();
        try{ 
            if(balance>=amount){
                balance-=amount;
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+" Balance is:"+balance);
            }
            else{
                System.out.println(Thread.currentThread().getName()+" Low Balance!");
            }
        }
        catch (InterruptedException ex) {
            System.getLogger(BankLock.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }        finally{
            lock.unlock();
        }
    }
}

class DownloadL{
    void download(){
        System.out.println("Downloading");
    }
}
class ProcessL{
    void process(){
        System.out.println("Processing");
    }
}
class UploadL{
    void upload(){
        System.out.println("Uploading");
    }
}

public class ConcurrencyUtilities {
    public static void main(String[] args){
        BankLock b1=new BankLock();
        DownloadL d1=new DownloadL();
        ProcessL p1=new ProcessL();
        UploadL u1=new UploadL();
        ExecutorService ex=Executors.newFixedThreadPool(2);
        for(int i=1;i<=3;i++){
            int id=i;
            ex.execute(()->{
                b1.withdraw(200);
                System.out.println("Task by "+id+" Run by "+Thread.currentThread().getName());
            });
        }
        ex.shutdown();
        while(!ex.isTerminated()){}

        CountDownLatch latch=new CountDownLatch(3);
        for(int i=0;i<3;i++){
            new Thread(() -> {
                d1.download();
                latch.countDown();
            }).start();

            new Thread(() -> {
                p1.process();
                latch.countDown();
            }).start();

            new Thread(() -> {
                u1.upload();
                latch.countDown();
            }).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("Error Occurred!!");
        }
        System.out.println("All tasks done...");

        Semaphore sem=new Semaphore(2);
        for(int i=1;i<=5;i++){
            new Thread(()->{
                try {
                    sem.acquire();
                    System.out.println(Thread.currentThread().getName()+"inside");
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error Occured!");
                }
                finally{
                    sem.release();
                }
            }).start();
        }
    }
}
