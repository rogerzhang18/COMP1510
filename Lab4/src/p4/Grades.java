package p4;

//************************************************************
//Grades.java //
//Use Student class to get test grades for two students
//and compute averages //
//************************************************************
public class Grades {
    public static void main(String[] args) {
        
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        
        //System.out.println("Student 1: " + student1);
        
        student1.inputGrades();
        student1.getAverage();        
        // create student2, "Mike"
        // input grades for Mary
        // print average for Mary
        System.out.println("The average for " + student1 + " is " + student1.getAverage());        
        System.out.println();
        
        student2.inputGrades();
        student2.getAverage();     
        System.out.println("The average for " + student2 + " is " + student2.getAverage());

        // input grades for Mike
        // print average for Mike
    }
}