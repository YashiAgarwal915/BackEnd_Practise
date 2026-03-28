package src.main.java.Level3;
import java.util.ArrayList;
import java.util.LinkedList;
public class CollectionBasics {

    public static int findMax(ArrayList<Integer> list1){
        int max=list1.get(0);
        for (Integer list11 : list1) {
            if(list11>max){
                max=list11;
            }
        }
        return max;
    }

    public static ArrayList<Integer> findEven(ArrayList<Integer> list1){
        ArrayList<Integer> l1=new ArrayList<>();
        for(Integer list11: list1){
            if(list11%2==0){
                l1.add(list11);
            }
        }
        return l1;
    }

    public static boolean findElement(ArrayList<Integer> list1, int key){
        boolean found=false;
        for(Integer list11:list1){
            if(list11==key){
                found=true;
                break;
            }
        }
        return found;
    }

    public static ArrayList<Integer> removeOdd(ArrayList<Integer> list1){
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)%2!=0){
                list1.remove(i);
                i--;
            }
        }
        return list1;
    }
    

    public static void main(String[] args){
         ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(51);
        System.out.println("List is: "+list1);
        System.out.println("Element at index 2 is: "+list1.get(2));
        list1.remove(3);
        System.out.println("After Removal: "+list1);
        System.out.println("New Size of list: "+list1.size());
        System.out.println(list1);

        LinkedList<String> list2=new LinkedList<>();
        list2.add("Yashi");
        list2.add("Rohit");
        list2.add("Umaang");
        list2.add("Rahul");
        list2.add("Yash");
        System.out.println(list2);
        list2.addFirst("Start");
        list2.addLast("End");
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        list2.removeFirst();
        System.out.println(list2);
        list2.removeLast();
        System.out.println(list2);
        //task 1
        System.out.println("Max Element of the List is: "+ findMax(list1));
        //task 2
        System.out.println("Even Elements of the List are: "+findEven(list1));
        //task 3
        if(findElement(list1,20)){
            System.out.println("Element Found at Index: "+ list1.indexOf(20));
        }
        else{
            System.out.println("Element Not Found!");
        }
        //challenge task
        System.out.println("List after removing odd elements: "+ removeOdd(list1));
    }
}