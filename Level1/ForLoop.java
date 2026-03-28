package Level1;
public class ForLoop {
    public static void main(String[] args){
        //task 1-->print 1 to 20
        System.out.println("Numbers from 1 to 20");
        for(int i=1;i<=20;i++){
            System.out.println(i);
        }

        //task 2-->print even from 1 to 50
        System.out.println("Even numbers between 1 to 50");
        for(int i=2;i<=50;i+=2){
            System.out.println(i);
        }

        //task 3--> Sum of n numbers
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of N numbers: "+sum);

        //task 4-->multiplication table
        int num=7;
        System.out.println("Multiplication of: "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num + " * "+i +" = " + (num*i));
        }

        //challenge task-->Reverse Counting
        System.out.println("Reverse Counting from 20 to 1");
        for(int i=20;i>=1;i--){
            System.out.println(i);
        }
    }
}