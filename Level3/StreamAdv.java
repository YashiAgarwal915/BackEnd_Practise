package src.main.java.Level3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAdv {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,8,9,5,6,8,0,6,3,7,8));  
        
        //task 1: Sorting:
        System.out.println("Ascending Order: ");
        list.stream().sorted().forEach(n->System.out.print(n+" "));
        System.out.println("\nDescending Order: ");
        list.stream().sorted((a, b) -> Integer.compare(b, a)).forEach(n->System.out.print(n+" "));

        //task2: Collect
        System.out.println("\nEven Numbers");
        List<Integer> result=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("Squares");
        List<Integer> squares=list.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squares);

        //task3: reduce
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of List is: "+sum);
        int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println("Max element of List is: "+max);
        int product=list.stream().reduce(1,(a,b)->a*b);
        System.out.println("Product of list: "+product);

        //Challenge Task
        ArrayList<String> names=new ArrayList<>(Arrays.asList("yashi", "rohit", "aman", "umang"));
        List<String> name=names.stream().map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(name);
    }   
}