package src.main.java.Level3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args){
        //task 1
        Predicate<Integer> p=n->n%2==0;
        System.out.println(p.test(4));

        Predicate<Integer> p1=n->n>40;
        System.out.println(p1.test(45));

        //task 2
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(2));

        Function<String,String> f1=str->str.toUpperCase();
        System.out.println(f1.apply("yashi"));

        //task 3
        Consumer<String> c=name->System.out.println("Hello "+name);
        c.accept("Yashi");

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
        Consumer<Integer> c1=n->System.out.println(n);
        for(Integer list11:list){
            c1.accept(list11);
        }

        //task 4

        Supplier<String> s=()->"Hello World";
        System.out.println(s.get());

        Supplier<Integer> s1=()->100;
        System.out.println(s1.get());

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 55, 23, 80));
        Predicate<Integer> p2=n->n>50;
        Function<Integer,Integer> f2=n->n*n;
        Consumer<Integer> c2=n->System.out.println(n);

        for(Integer num:list1){
            if(p2.test(num)){
                int result=f2.apply(num);
                c2.accept(result);
            }
        }
    }
    
}
