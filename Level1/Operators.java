package Level1;
public class Operators {
    public static void main(String[] agrs){
        //task1
        int a=10;
        int b=5;
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));

        //task2
        int number=17;

        if(number%2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        //task3
        int x=12;
        int y=8;

        if(x==y)
            System.out.println("Equal Numbers");
        else if(x>y)
            System.out.println("x is greater than y");
        else
            System.out.println("x is smaller than y");

        //challenge task
        double basicSalary=50000;
        double hra=20;
        double bonus=10;
        double totalSalary=basicSalary+(basicSalary*hra/100)+(basicSalary*bonus/100);
        System.out.println("Total Salary: "+totalSalary);
    }
}
