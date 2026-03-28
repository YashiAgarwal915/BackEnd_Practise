package Level2;

class AnimalParent{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class DogChild extends AnimalParent{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

class ShapeParent{
    void area(){
        System.out.println("Shape Area");
    }
}

class RectangleChild extends ShapeParent{
    private int length;
    private int width;

    public void setLength(int length){
        this.length=length;
    }

    public void setWidth(int width){
        this.width=width;
    }
    @Override
    public void area(){
        if(length > 0 && width > 0)
            System.out.println("Area is: " + length * width);
        else
            System.out.println("Invalid dimensions");
    }
}

class EmployeeParent{
    protected double salary;

    public void setSalary(double salary){
        this.salary=salary;
    }
    void displaySalary(){
        System.out.println("Base Salary is: "+ salary);
    }
}

class ManagerChild extends EmployeeParent{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    @Override
    void displaySalary(){
        System.out.println("Salary is: "+ (salary+bonus));
    }

}

class AnimalGP{
    void move(){
        System.out.println("Slow");
    }
}
class MammalP extends AnimalGP{
    @Override
    void move(){
        System.out.println("Average");
    }
}
class DogC extends MammalP{
    @Override
    void move(){
        System.out.println("Fast");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        AnimalParent dc1=new AnimalParent();
        dc1.sound();
        DogChild dc2=new DogChild();
        dc2.sound();
        ShapeParent sp2=new ShapeParent();
        sp2.area();
        RectangleChild sp1=new RectangleChild();
        sp1.setLength(10);
        sp1.setWidth(20);
        sp1.area();
        EmployeeParent ep1=new EmployeeParent();
        ep1.setSalary(10000);
        ep1.displaySalary();
        ManagerChild mc1=new ManagerChild();
        mc1.setSalary(10000);
        mc1.setBonus(3200);
        mc1.displaySalary();
        AnimalGP agp=new AnimalGP();
        agp.move();
        MammalP mp=new MammalP();
        mp.move();
        DogC dg=new DogC();
        dg.move();

    }
}
