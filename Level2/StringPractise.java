package Level2;

public class StringPractise {
    public static void main(String[] args) {
        //task 1
        String str="Hello Madam";
        System.out.println("Length of String is: "+str.length());

        //task 2
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        //task 3
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);

        //challenge task

        if(revStr.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        //super task
        int countVowel=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
            str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                countVowel++;
            }
        }
        System.out.println("Count of vowels: "+countVowel);
    }
}
