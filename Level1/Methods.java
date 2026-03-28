package Level1;
public class Methods {
    public static void main(String[] args) {
        //task 1
        print();

        //task 2
        System.out.println("Sum is: "+sum(5,10));

        //task 3
        evenOrOdd(5);

        //Challenge task
        add(5, 10);
        subtract(10,6);
        multiply(12,6);
        divide(9,3);
    }
    public static void print(){
        System.out.println("Hello");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void evenOrOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
    public static void add(int a, int b){
        System.out.println("Sum is: "+(a+b));
    }

    public static void subtract(int a, int b){
        System.out.println("Subtract is: "+(a-b));
    }

    public static void multiply(int a, int b){
        System.out.println("Multiply is: "+(a*b));
    }

    public static void divide(int a, int b){
        if(b!=0){
            System.out.println("Divide is: "+(a/b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}