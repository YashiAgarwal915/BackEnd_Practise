package Level2;

class Ranker{
    final int rollNumber;
    String name;
    Ranker(int rollNumber,String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("RollNumber is: "+rollNumber);
    }
}

class Parent{
    final void calculate(){
         System.out.println("Calculate Method");
    }
}

class Child extends Parent{
    //@Override
    // public void calculate(){
    //     System.out.println("Calculate Inside Child")
    // }
}

final class BankSecurity{
    void authenticate(){
        System.out.println("Authorised");
    }
}
// class Hacker extends BankSecurity{

// }

class Constants{
    static final double PI=3.14;
    static final int MAX_USERS=5;
    private int radius;

    public void setRadius(int radius){
        this.radius=radius;
    }
    int area(){
        return (int)(PI*radius*radius);
    }

    void display(){
        System.out.println("Limit of users: "+MAX_USERS);
    }
}

public class FinalKeyword {
    public static void main(String[] args){
        Ranker r1=new Ranker(34,"Yashi");
        r1.display();

        Parent p1=new Child();
        p1.calculate();

        Constants cc1=new Constants();
        cc1.setRadius(10);
        System.out.println("Area is: "+cc1.area());
        cc1.display();

        final StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.append(" Yashi"));   // allowed
        //sb = new StringBuilder("Hello"); // not allowed

    }
}
