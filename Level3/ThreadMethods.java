package src.main.java.Level3;

class Task extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println(getName()+" -> "+i);
            try {
             Thread.sleep(500);   
            }
            catch(Exception e){
                System.out.println("Error occured while running...");
            }
        }
    }
}

class Task11 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("----->"+i);
            try{ 
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Error in thread");
            }
        }
    }
}
//challenge task-->

class Download1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=3;i++){
            try {
                Thread.sleep(1500);
                System.out.println("Downloadable...."+i);
            } catch (Exception e) {
            }  
        }
    }
}

class Music1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=3;i++){
            try {
                Thread.sleep(1500);
                System.out.println("Playing Music...."+i);
            } catch (Exception e) {
            }  
        }
    }
}

class Chat1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=3;i++){
           try {
                Thread.sleep(1500);
                System.out.println("Chatting...."+i);
            } catch (Exception e) {
            }  
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Task t1=new Task();
        Task t2=new Task();
        Task11 task1=new Task11();
        Task11 task2=new Task11();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        task1.setName("Rohit");
        task2.setName("Yashi");
        task1.start();
        t1.start();
        try 
        {
            t1.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

        try {
            task1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task2.start();

        Download1 d1=new Download1();
        Music1 m1=new Music1();
        Chat1 c1=new Chat1();
        d1.start();
        m1.start();
        try {
            d1.join();
            m1.join();
        } catch (Exception e) {
        }
        c1.start();
    }
}