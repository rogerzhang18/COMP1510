package p4;

//************************************************************
//Student.java //
//Defineastudentclassthatstoresname,scoreontest1,and
//score on test 2. Methods prompt for and read in grades,
//computetheaverage,andreturnastringcontainingstudent'sinfo.
//************************************************************
import java.util.Scanner;

public class Student {
    // declare instance data
    private String studentName;
    private int score1;
    private int score2;

    // ---------------------------------------------
    // constructor
    // ---------------------------------------------
    public Student() {
        studentName = "";
        score1 = 0;
        score2 = 0;
    }

    public Student(String studentName) {
        // add constructor
        this.studentName = studentName;

    }

    public String getName() {
        return this.studentName;
    }

    // ---------------------------------------------
    // inputGrades: prompt for and read in student's grades for test1 and test2.
    // Use name in prompts, e.g., "Enter's Joe's score for test1".
    // ---------------------------------------------
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter score for test 1: ");
        score1 = scan.nextInt();
        System.out.println("Please enter score for test 2: ");
        score2 = scan.nextInt();

    }
    // add body of inputGrades

    // ---------------------------------------------
    // getAverage: compute and return the student's test average //
    // ---------------------------------------------
    // add header for getAverage
    public double getAverage() {
        double average = (score1 + score2) / 2.0;
        return average;
        // add body of getAverage
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", score1=" + score1 + ", score2=" + score2 + "]";
    }

    // ---------------------------------------------
    // getName: print the student's name
    // ---------------------------------------------
    // add header for printName
    
}
// add body of printName
