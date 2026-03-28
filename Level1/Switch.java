package Level1;
public class Switch {
    public static void main(String[] args){
        //task 1--->days of a week
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Choice!");
        }

            //task 2--> calculator
            int a=10;
            int b=5;
            int choice=2;
            switch(choice){
                case 1:
                    System.out.println("Addition: "+(a+b));
                    break;
                case 2:
                    System.out.println("Substraction: "+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication: "+(a*b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Division: " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            //task 3==> month of a year
            int month=8;
            switch(month){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
            
            //challenge task--> Mini ATM
            int menu=2;
            switch(menu){
                case 1:
                    System.out.println("Check Balance");
                    break;
                case 2:
                    System.out.println("Deposit");
                    break;
                case 3:
                    System.out.println("Withdraw");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
    }
}
