package Level2;
import java.util.ArrayList;
class OOPDesign{
    private int id;
    private String name;
    private int marks;

    OOPDesign(int id,String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void display(){
        System.out.println("ID is: "+id);
        System.out.println("Name is: "+name);
        System.out.println("Marks are: "+marks);
    }

    public void result(){
        if(marks>90){
            System.out.println("Topper");
        }
        else{
            System.out.println("Average");
        }
    }
}

class AnimalCC{
    AnimalCC(){
        System.out.println("Animal Called");
    }
}

class MammalCC extends AnimalCC{
    MammalCC(){
        System.out.println("Mammal Called");
    }
}

class DogCC extends MammalCC{
    DogCC(){
        System.out.println("Dog Called");
    }
}

class CalciCal{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
}

class BA{
    private double balance;

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        System.out.println("Amount Deposited: "+ (balance+=amount));
    }

    public void withdraw(double amount) throws Exception{
        if(amount>balance) throw new Exception("Low Balance");
        else{
            System.out.println("Amount Withdrawn Successfully");
        }
    }
}

class Constt{
    final double PI=3.14;
    static int counter;
    private double radius;

    // public void setPI(double PI){
    //     this.PI=PI;
    // }
    public void setRadius(double radius){
        this.radius=radius;
    }

    Constt(){
        counter++;
        System.out.println("Total Object Created: "+counter);
    }

    public double area(){
        return (PI*radius*radius);
    }


}

public class Project2 {
    public static void main(String[] args) {
            //task 1
           OOPDesign s1=new OOPDesign(10, "Yashi",275);
           s1.display();
           s1.result();  
            //task 2
           DogCC d1=new DogCC();
            //task 3
           CalciCal cc1=new CalciCal();
           System.out.println("Sum of two integers: "+cc1.add(1,2));
           System.out.println("Sum of two doubles: "+cc1.add(1.5,7));
           System.out.println("Sum of three integers: "+cc1.add(4,87,65));
           //task 4
           BA b1=new BA();
           b1.setBalance(10000);
           try {
               b1.deposit(19876);
               b1.withdraw(19876);
           } 
           catch (Exception e) {
            System.out.println(e.getMessage());
           }
           //task 5
           ArrayList<String> list=new ArrayList<>();
           list.add("Yashi");
           list.add("Rohit");
           list.add("Umaang");
           list.add("Yash");
           list.add("Parth");
           list.remove(3);

           for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
           }
           System.out.println("\nTotal Count of Names: "+ list.size());
           //task 6
           Constt c1=new Constt();
           //c1.setPI(1.23);
           c1.setRadius(5);
           System.out.println("Area of circle: "+ c1.area());
    }
}