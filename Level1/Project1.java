package Level1;
public class Project1 {
    public static void main(String[] args) {
        String name="Yashi";
        int rollNo=12;
        int scienceMarks=85;
        int mathMarks=90;
        int englishMarks=99;
        printReport(name, rollNo, scienceMarks, mathMarks, englishMarks);
    }

    public static int calculateTotal(int science, int maths, int english){
        //code to calculate total marks
        return science+maths+english;
    }

    public static int calculateAverage(int science,int maths, int english){
        return (science+maths+english)/3;
    }

    public static void calculateGrade(int average){
        if(average>=90){
            System.out.println("Grade: A");
        } else if(average>=80){
            System.out.println("Grade: B");
        } else if(average>=70){
            System.out.println("Grade: C");
        } else if(average>=60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    public static void printReport(String name, int rollNo, int scienceMarks, int mathMarks, int englishMarks){
        System.out.println("Report Card");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Total Marks: "+ calculateTotal(scienceMarks, mathMarks, englishMarks));
        int average=calculateAverage(scienceMarks, mathMarks, englishMarks);
        System.out.println("Average Marks: "+ average); 
        calculateGrade(average);
        System.out.println("Status: "+ (average>=50 ? "Pass" : "Fail"));
    }
}