package src.main.java.Level3;

class Task1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" -> Task1: "+i);
        }
    }
}

class Task2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" -> Task2: "+(char)(i+65));
        }
    }
}

class Task3 implements Runnable{
    @Override
    public void run(){
        System.out.println("Using Runnable Interface");
        System.out.println(Thread.currentThread().getName());
    }
}

//challenge task-->
class Download implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("Downloading..."+i);
        }
    }
}

class Music implements Runnable{
    @Override
    public void run(){
        System.out.println("Playing Music...");
    }
}

class Chat implements Runnable{
    @Override
    public void run(){
        System.out.println("Chatting...");
    }
}

public class MutithreadingBasics {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        Task3 t3=new Task3();
        Thread t4=new Thread(t3);
        t1.start();
        t2.start();
        t4.start();
        System.out.println(Thread.currentThread().getName());

        Download d1=new Download();
        Thread download=new Thread(d1);
        download.start();

        Music m1=new Music();
        Thread music=new Thread(m1);
        music.start();

        Chat c1=new Chat();
        Thread chat=new Thread(c1);
        chat.start();
    }   
}
