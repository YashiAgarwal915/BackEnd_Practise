package Level2;
import java.util.ArrayList;
public class WrapperClassCollection {
    public static void main(String[] args){
        //task 1
        int x = 10;
        System.out.println("x is: "+x);
        Integer obj = x;   // Autoboxing
        System.out.println("obj is: "+obj);
        int y = obj;       // Unboxing
        System.out.println("y is: "+y);
        //task 2
        String str1="123";
        int str2=Integer.parseInt(str1);
        System.out.println("String addition: "+ (str2+4));

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(87);
        System.out.println("Size of List: "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.remove(3);
        System.out.println("Size of List: "+list.size());

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Yashi");
        list1.add("Rohit");
        list1.add("Umang");

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        System.out.println("Size of List1: "+list1.size());
    }
}