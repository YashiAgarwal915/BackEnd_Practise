package Level2;

public class ArrayProblems {
    public static void main(String[] args) {
        //task 1
        int least=Integer.MAX_VALUE;
        int []arr={2,4,3,8,9};
        for(int i =0;i<arr.length;i++){
            if(arr[i]<least){
                least=arr[i];
            }
        }
        System.out.println("Least array Element is: "+least);

        //task 2
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("Count of odds: "+count);

        //task 3
        int key = 3;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Not Found!");
        }       


        //Challenge task
        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=firstMax){
                secondMax=arr[i];
            }
        }
        System.out.println("Second Max is: "+secondMax);

        //super task
        boolean sorted=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted!");
        }
        else{
            System.out.println("Not sorted!");
        }
    } 
}