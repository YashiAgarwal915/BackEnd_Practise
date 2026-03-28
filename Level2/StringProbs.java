package Level2;
import java.util.Arrays;
public class StringProbs {
    public static void main(String[] args) {
        //task 1--> Count of words
        String str="Hello World";
        int spaces=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        //task 2--> Convert to uppercase
        System.out.println("Count of words is: "+(spaces+1));
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                newStr+=(char)(str.charAt(i)-32);
            }
            else{
                newStr+=(char)(str.charAt(i));
            }
        }
        System.out.println(newStr);

        //task 3--> Remove Spaces
        String newStr2="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                newStr2+=(char)(str.charAt(i));
            }
        }
        System.out.println(newStr2);

        //challenge task-->Non-reapeating characters
        System.out.println("Not Repeating characters: ");

        for(int i=0;i<str.length();i++){
            boolean repeating=false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    repeating =true;
                    break;
                }
            }
            if(!repeating){
                System.out.print(str.charAt(i)+" ");
            }
        }
        System.out.println();

        //super task
        String str1="listen";
        String str2="sileht";
        boolean Anagram=true;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                boolean found=false;
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        found=true;
                        break;
                    }
                }
                if(!found){
                    Anagram=false;
                    break;
                }
            }
        }
        else{
            Anagram=false;
        }
        if(Anagram){
            System.out.println("Anagram Strings");
        }
        else{
            System.out.println("Not Anagram Strings");
        }
    
        //new way of anagram strings
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)){
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
    }
}

