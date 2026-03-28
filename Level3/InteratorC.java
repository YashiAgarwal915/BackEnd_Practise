package src.main.java.Level3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class InteratorC {

    public static ArrayList<Integer> removeEven(ArrayList<Integer> list){
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num%2==0){
                it.remove();
            }
        }
        return list;
    }

    public static ArrayList<Integer> removeOdd(ArrayList<Integer> list){
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(num%2!=0){
                it.remove();
            }
        }
        return list;
    }

    public static void printGreater(ArrayList<Integer> list){
        Iterator<Integer>it=list.iterator();
        System.out.print("Greater than 50: ");
        while(it.hasNext()){
            int num=it.next();
            if(num>50){
                System.out.print(num+" ");
            }
        }
    }

    public static int counter(ArrayList<Integer> list){
        Iterator<Integer> it=list.iterator();
        int count=0;
        while(it.hasNext()){
            int num=it.next();
            if(num>20){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        HashSet<Integer> set=new HashSet<>();
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int num=it.next();
            if(set.contains(num)){
                it.remove();
            }
            else{
                set.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(6);
        //task 1
        System.out.println("Removed Evens: "+ removeEven(list));
        //task 2
        System.out.println("Removed Odds: "+removeOdd(list));

        list.add(50);
        list.add(60);
        list.add(90);
        list.add(90);
        list.add(60);
        //task 3
        printGreater(list);
        //task 4
        System.out.println("\nCount of elements greater than 20: "+counter(list));

        //challenge task
        System.out.println("Removed Duplicates: "+removeDup(list));
    }
}