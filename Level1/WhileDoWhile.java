package Level1;
public class WhileDoWhile {
    public static void main(String[] args){
        //task 1-->print 1 to 10
        System.out.println("Print 1 to 10");
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //task 2-->Sum of numbers
        int n=5;
        int sum=0;
        while(n>0){
            sum+=n;
            n--;
        }
        System.out.println("Sum of numbers: "+sum);

        //task 3-->Print table of a number
        int num=7;
        int j=1;
        while(j<=10){
            System.out.println(num+" * "+j+" = "+(num*j));
            j++;
        }

        //Challenge task:-->password retry system
        
        int correctPassword = 1234;
        int enteredPassword = 1111; // simulate wrong entry
        int attempts = 3;

        while (attempts > 0) {
            if (enteredPassword == correctPassword) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong Password. Attempts left: " + (attempts - 1));
            }
            attempts--;
        }
    }       
}