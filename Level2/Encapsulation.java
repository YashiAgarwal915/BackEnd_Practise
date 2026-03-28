package Level2;

class Student3{
    private String name;
    private int marks;

    public void setName(String name){
        this.name=name;
    }

    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100)
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void displayStu(){
        System.out.println("Name is: "+name);
        System.out.println("Marks are: "+marks);
    }
}

class Employee{
    private int id;
    private double salary;

    public void setId(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
    }

    public double getSalary(){
        return salary;
    }

    void displaySal(){
        System.out.println("Salary is: "+salary);
    }

}

class PM{
    private String password;

    public void setPassword(String password){
        if(password.length()>=8){
            this.password=password;
            System.out.println("Password set");
        }
    }

    public String getPassword(){
        return "Access Restricted";
    }
}

class Rectangle1{
    private int length;
    private int width;

    public void setDimensions(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getArea(){
        return (length*width);
    }
}


public class Encapsulation {
    public static void main(String[] args) {

        Student3 s1=new Student3();
        s1.setName("Yashi");
        s1.setMarks(299);
        s1.displayStu();

        Employee e1=new Employee();
        e1.displaySal();
        e1.setSalary(657465);
        e1.displaySal();

        PM p1=new PM();
        p1.setPassword("Yashi@1234");
        p1.getPassword();

        Rectangle1 r1=new Rectangle1();
        r1.setDimensions(10,30);
        System.out.println("Area is: "+r1.getArea());
    }
}
