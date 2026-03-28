package src.main.java.Level3;

import java.util.function.Predicate;

interface Add{
    int sum(int a, int b);
}

interface findMax{
    int max(int a, int b);
}

// @FunctionalInterface
// interface IsEven{
//     boolean test(int n);
// }

// class AddI implements Add{
//     @Override
//     public int sum(int a,int b){
//         return a+b;
//     }
// }

public class Java8FeaturesPractise {
    public static void main(String[] args){
        // Add a=new AddI();
        // System.out.println(a.sum(2,3));

        Add add=(a,b)->a+b;
        System.out.println(add.sum(2,3));

        findMax fm=(a,b)->(a>b)?a:b;
        System.out.println(fm.max(2,3));

        Predicate<Integer> IsEven=n->n%2==0;
        System.out.println(IsEven.test(4));

    }
    
}
