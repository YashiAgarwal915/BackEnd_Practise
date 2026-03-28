package src.main.java.Level3;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetC {

    public static HashSet<Integer> printUnique(ArrayList<Integer> list){
        HashSet<Integer> s=new HashSet<>(list);
        return s;
    }

    public static boolean checkDuplicates(ArrayList<Integer> list)
    {
        HashSet<Integer> set=new HashSet<>(list);
        return set.size() != list.size();
    }

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(7);
        System.out.println("Size of Set is: "+set.size());
        System.out.println(set);
        System.out.println("Contains 7? "+set.contains(7));
        // if(set.contains(3)){
        //     System.out.println(set.get(3));
        // } else {
        //     System.out.println("Not found");
        // }
        set.remove(2);
        System.out.println("Size of Set After removal is: "+set.size());
        System.out.println(set);

        //Remove dupliactes from List //task2
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);
        System.out.println("Before: "+list);
        HashSet<Integer> set1=new HashSet<>(list);
        System.out.println("After: "+set1);

        //task 1
        HashSet<String> set2=new HashSet<>();
        set2.add("Yashi");
        set2.add("Rohit");
        set2.add("Aman");
        set2.add("Rohit");
        System.out.println(set2);
        //task 3
        System.out.println(printUnique(list));
        //challenge task
        System.out.println("List contains duplicates: "+checkDuplicates(list));
        


    }
    
}
