package Level2;

class EHTask{
    private int a;
    private int b;
    private int[] arr;
    int c;
    private int n;
    private int age;

    public void setA(int a){
        this.a=a;
    }

    public void setB(int b){
        this.b=b;
    }

    public void setArr(int[] arr){
        this.arr=arr;
    }

    public void setN(int n){
        this.n=n;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int divide(){
        try{
         c=a/b;
         return c;
        }
        catch(ArithmeticException e){
            System.out.println("Please do not divide by zero");
            return 0;
        }  
        finally{
            System.out.println("Task 1 Done");
        }
    } 

    public void Printarray(){
        try{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]/b+" ");
            }
            System.out.println(arr[arr.length]);
        }
        catch(ArithmeticException e){
            System.out.println("\nPlease do not divide by zero");
        } 
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("\nOut of Bound");
        } 
        finally{
            System.out.println("Task 2 Done");
        }
    }

    public void voter(){
        if (age<18) throw new ArithmeticException("Not Eligible");
        else{
            System.out.println("Please vote");
        }
    }

    public void checkNumber(int n) throws Exception{
        if(n<0){
            throw new Exception("Negatives not allowed");
        }
        else{
            System.out.println("Valid Number");
        }
    }

}


public class ExceptionHandling {
    public static void main(String[] args) {
        EHTask e1=new EHTask();
        e1.setA(10);
        e1.setB(0);
        e1.setArr(new int[]{1,2,3,4,5});
        e1.setAge(17);
        int result = e1.divide();
        System.out.println("Result = " + result);
        e1.Printarray();
        try {
            e1.voter();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            e1.checkNumber(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
}