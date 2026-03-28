package src.main.java.Level3;
import java.util.ArrayList;
import java.util.HashMap;
public class HashMapC {

    public static HashMap<Integer,Integer> countFreq(ArrayList<Integer> list){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        return map;
    }
    public static void main(String [] args){
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Yashi",90);
        marks.put("Rohit",80);
        marks.put("Aman",21);

        System.out.println("Marks map: "+marks);
        System.out.println("Yashi's Marks: "+marks.get("Yashi"));
        System.out.println("Contains Rohit? "+marks.containsKey("Rohit"));
        marks.remove("Aman");
        System.out.println("After Removal: "+marks);
        System.out.println("Size Now: "+marks.size());

        HashMap<String,Integer> studentMarks=new HashMap<>();
        studentMarks.put("English",80);
        studentMarks.put("Maths",70);
        studentMarks.put("History",40);
        System.out.println("Marks Map: "+studentMarks);
        //System.out.println("Science Marks: "+studentMarks.get("Science"));
        if(studentMarks.containsKey("Science")){
            System.out.println(studentMarks.get("Science"));
        } else {
            System.out.println("Subject not found");
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        System.out.println(list);
        System.out.println("Count the frequencies: "+countFreq(list));

        for(String key: studentMarks.keySet()){
            System.out.println(key+"->"+studentMarks.get(key));
        }
    }
}