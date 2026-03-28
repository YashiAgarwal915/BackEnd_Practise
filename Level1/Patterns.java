package Level1;
public class Patterns {
    public static void main(String[] args) {
        //task 1
        int rows=5, cols=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //task 2
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //task 3
        for(int i=0;i<rows;i++){
            for(int j=cols;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //challenge task
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}