package Level1;
public class Conditions {
    public static void  main(String[] args){
        //task1
        int number=15;
        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }

        //task2
        int a=10,b=20,c=15;
        if (a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }

        //task3
        int marks=56;
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks<=89 && marks>=75){
            System.out.println("B");
        }
        else if(marks<=74 && marks>=50){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }

        //challenge task
        String userName="admin";
        String password="admin123";
        if(userName.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }
}