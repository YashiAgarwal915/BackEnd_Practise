package Level2;
//Starting at 0 makes address calculation faster and Java (like C/C++) uses memory offset indexing
public class Array {
    public static void main(String[] args) {
        //task 1
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=8;
        arr[4]=90;
        System.out.println("Printed Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //task 2
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is: "+sum);

        //task 3
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max is: "+max);

        //challenge task"Reverse Array")
        System.out.println("Reversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Super Challenge
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Total Even numbers: "+count);
    }
}
