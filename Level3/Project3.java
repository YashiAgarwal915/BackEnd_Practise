package src.main.java.Level3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
class SPS{
    int id;
    String name;
    int marks;

    SPS(int id,String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}

class BankSimulation{
    int balance=1000;

    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " withdrawing...");
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Low Balance");
        }
    }
    synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName() + " depositing...");
        balance+=amount;
        System.out.println("New Balance: "+balance);
    }

    synchronized void checkBalance(){
        System.out.println(Thread.currentThread().getName() + " checkingBalance...");
        System.out.println("Balance is: "+balance);
    }
}
class Square implements Callable<Integer>{
        int num;
        Square(int num){
            this.num=num;
        }
        @Override
        public Integer call(){
            return num*num;
        }
    }

    class Summ implements Callable<Integer>{
        int num;
        int sum=0;
        Summ(int num){
            this.num=num;
        }
        @Override
        public Integer call(){
            for(int i=1;i<=num;i++){
                sum+=i;
            }
            return sum;
        }
    }

    class Msg implements Callable<String>{
        @Override
        public String call(){
            return "Tasks done";
        }
    }

public class Project3 {

    public static HashMap<Integer,Integer> freqCounter(ArrayList<Integer> list,HashMap<Integer,Integer> map){
        for(Integer num: list){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        return map;
    }


    public static int maxFreq(ArrayList<Integer> list,HashMap<Integer,Integer> map){
        int maxFreq=0;
        int maxElement=-1;
        for(Integer num:map.keySet()){
            if(map.get(num)>maxFreq){
                maxFreq=map.get(num);
                maxElement=num;
            }
        }
        return maxElement;
    }

    public static void main(String[] args){
        //Section 1-->
        ArrayList<SPS> list=new ArrayList<>();
        list.add(new SPS(1,"Yashi",90));
        list.add(new SPS(2,"Rohit",80));
        list.add(new SPS(3,"Aman",40));
        list.add(new SPS(4, "Umang", 60));
        list.add(new SPS(5, "Parth", 30));

        //TASK 1: marks>50
        System.out.println("Marks>50");
        list.stream()
            .filter(n->n.marks>50)
            .forEach(n->System.out.println(n.name+" "+n.marks));

        //TASK 2: UPPERCASE NAMES
        System.out.println("Upper case names");
        list.stream()
            .map(n->n.name.toUpperCase())
            .forEach(System.out::println);
        
        // TASK 3: Sort by marks(desc)
        System.out.println("Marks in descending order:-->");
        list.stream()
            .sorted((a,b)->b.marks-a.marks)
            .forEach(s->System.out.println(s.name+" "+s.marks));

        // TASK 4: COLLECT MARKS>70
        System.out.println("Marks>70:-->");
        List<SPS> l1=list.stream().filter(n->n.marks>70).collect(Collectors.toList());
        l1.forEach(s->System.out.println(s.name+" "+s.marks));

        //TASK 5: AVERAGE MARKS
        double average=list.stream().mapToInt(s->s.marks).average().getAsDouble();
        System.out.println("Average marks: "+average);

        //Section 2--->
        
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 10));
        HashMap<Integer,Integer> map=new HashMap<>();
        //task 1
        System.out.println("Frequency counter: "+freqCounter(list1,map));
        //task 2
        System.out.println("Most Frequent: "+ maxFreq(list1, map));
        //task 3
        System.out.println("Elements with Frequency >1");
        map.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));

        //Section 3---->

        BankSimulation bs1=new BankSimulation();
        Thread t1=new Thread(()->bs1.withdraw(200));
        Thread t2=new Thread(()->bs1.deposit(400));
        Thread t3=new Thread(()->bs1.checkBalance());
        t1.setName("User-1");
        t2.setName("User-2");
        t3.setName("User-3");
        t1.start();
        t2.start();
        t3.start();

        //Section 4
        ExecutorService ex=Executors.newFixedThreadPool(3);
        Future<Integer> f1=ex.submit(new Square(10));
        Future<Integer> f2=ex.submit(new Summ(100));
        Future<String> f3=ex.submit(new Msg());
        try {
            System.out.println("Square of 10 is: "+f1.get());
            System.out.println("Sum of 100 is: "+f2.get());
            System.out.println("Message: "+f3.get());
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        ex.shutdown();

        //Section 5
        String email = null;

        Optional<String> op = Optional.ofNullable(email);

        // Task 1
        op.ifPresent(e -> System.out.println("Email: " + e));

        // Task 2
        System.out.println(op.orElse("No Email Found"));

        // Task 3
        try {
            String value = op.orElseThrow(() -> new RuntimeException("Email Missing"));
            System.out.println(value);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
