package Level1;
public class Variable_DT {
    public static void main(String [] args){
        //task 1
        String name="Yashi";
        int age=25;
        String city="Delhi";
        String college="IIT Jodhpur";
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
        System.out.println("College: "+college);

        //task 2
        int laptop_price=50000;
        double percentage_discount=10.5;
        double final_price=laptop_price-(laptop_price*percentage_discount/100);
        System.out.println("Price of laptop: "+laptop_price);
        System.out.println("Discount Percentage: "+percentage_discount);
        System.out.println("Final Price after Discount: "+final_price);

        //challenge task
        String Myname="Yashi";
        int roll_number=101;
        int maths_marks=85;
        int science_marks=90;
        int arts_marks=100;
        int total_marks=maths_marks+science_marks+arts_marks;
        System.out.println("Name: "+Myname);
        System.out.println("Roll Number: "+roll_number);
        System.out.println("Total Marks: "+total_marks);
    }
}