package src.main.java.Level3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Tasks extends Thread{
    @Override
    public void run(){
        System.out.println("Tasks running:");
    }
}
public class ExecutorAdvControl {
    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(2);
        //Task 1 — execute()
        for(int i=1;i<=3;i++){
            int id = i;
            ex.execute(() -> {
                System.out.println("Execute Task " + id + " -> " + Thread.currentThread().getName());
                try { Thread.sleep(500); } catch (Exception e) {}
            });
        }
        //Task 2- different sleep time
        for(int j=1;j<=5;j++){
            int id1 = j;

            ex.execute(() -> {
                try {
                    Thread.sleep(id1 * 1000);
                    System.out.println("Task " + id1 + " finished on " + Thread.currentThread().getName());
                } catch (Exception e) {}
            });
        }
        //Task 3 — submit()
        Future<?> f = ex.submit(() -> {
            System.out.println("Submit Task running on " + Thread.currentThread().getName());
            return "Task Completed";
        });

        try {
            System.out.println("Result from submit: " + f.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //  STATUS CHECK
        System.out.println("Before shutdown: " + ex.isShutdown());
        ex.shutdownNow();
        ex.shutdown();

        System.out.println("After shutdown: " + ex.isShutdown());

        // WAIT until all tasks complete
        while(!ex.isTerminated()){
        }

        System.out.println("All tasks completed");

        System.out.println("Final isTerminated: " + ex.isTerminated());
        System.out.println("Final isShutdown: " + ex.isShutdown());
    }
}
