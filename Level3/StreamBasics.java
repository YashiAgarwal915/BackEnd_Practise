package src.main.java.Level3;
import java.util.ArrayList;
import java.util.Arrays;
public class StreamBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,22,32,43,53,61,17,18,91,120));
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("yashi","rohit","aman","umanng"));

        //task1-->Print Even from the list
        System.out.println("All Even numbers: ");
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        //task2-->Print Square of all numbers
        System.out.println("Squares of all elements of the list: ");
        list.stream().map(n->n*n).forEach(System.out::println);

        //task3-->Print num>20 and sqquares of them
        System.out.println("Elements greater than 20 with squares: ");
        list.stream().filter(n->n>20).map(n->n*n).forEach(System.out::println);

        //task4-->list of names to upercase
        System.out.println("Names to upper case: ");
        list1.stream().map(n->n.toUpperCase()).forEach(System.out::println);

        //challenge task:
        //Names to uppercase-->filter with starting A-->print them
        System.out.println("A starting Names to upper case: ");
        list1.stream().filter(n->n.startsWith("a")).map(n->n.toUpperCase()).forEach(System.out::println);
    }
}