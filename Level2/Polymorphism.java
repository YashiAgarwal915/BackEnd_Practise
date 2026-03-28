package Level2;

class Calci{

    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

}

class Utility{
    void print(int a){
        System.out.println("Id is: "+a);
    }
    void print(String str){
        System.out.println("Name is: "+str);
    }
    void print(double d){
        System.out.println("Marks is: "+d);
    }
}

class AnimalNew{
    void sound(){
        System.out.println("Animal Speaks");
    }
}
class DogNew extends AnimalNew{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class CatNew extends AnimalNew{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}

class ShapeNew{
    void draw(){
        System.out.println("FreeHand Shape");
    }
}

class RectangleNew extends ShapeNew{
    @Override
    void draw(){
        System.out.println("Rectangle Shape");
    }
}

class CircleNew extends ShapeNew{
    @Override
    void draw(){
        System.out.println("Circle Shape");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Calci c1=new Calci();
        System.out.println("Sum of two integer values: "+c1.add(1,2));
        System.out.println("Sum of two double values: "+c1.add(1,4.3));
        System.out.println("Sum of three integer values: "+c1.add(10,34,2));

        Utility u1=new Utility();
        u1.print(1);
        u1.print("Yashi");
        u1.print(98.76);
        AnimalNew an1=new DogNew();
        an1.sound();
        AnimalNew dn1=new CatNew();
        dn1.sound();
        ShapeNew sn1=new CircleNew();
        sn1.draw();
        ShapeNew sn2=new RectangleNew();
        sn2.draw();
        ShapeNew[] shapes = {new CircleNew(),new RectangleNew()};
        for(ShapeNew s : shapes){
            s.draw();
        }
    } 
}