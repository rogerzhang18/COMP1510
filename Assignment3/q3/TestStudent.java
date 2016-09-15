package q3;

/**
 * <p>
 * This program allows user to set test scores for any of the three tests
 * on a student with specific name and address. Then the programs calculates
 * the average of the tests.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        final int hundred = 100;
        final int one = 1;

        Address school = new Address("3700 Willingdon Ave.", 
                "Burnaby", "BC", "V5G 3H2");

        // First student.
        Address jHome = new Address("21 Jump Street", 
                "Langley", "BC", "V3A 6K6");
        Student john = new Student("John", "Smith", jHome, 
                school, hundred, hundred - one, hundred - one - one);

        // Second student.
        Address mHome = new Address("123 Main Street", "North Pole", 
                "H0", "H0H 0H0");
        Student peter = new Student("Peter", "Griffin", mHome, school);

        int num = hundred;
        
        // Use getTestScore method to get test score for the second test.
        num = john.getTestScore(2);
        
        // Use setTestscore method to set 1st test to 99 for Peter.
        peter.setTestScore(1, hundred - one);

        System.out.println(john);
        System.out.println(num + "\n");
        System.out.println(peter);

        System.out.println();
        System.out.println("Question three was called and ran sucessfully.");
    }

};
