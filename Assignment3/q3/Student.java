package q3;

/**
 * Represents a college student.
 * 
 * @author Yongjian Zhang
 * @version 1.0
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student. Can be shared by other students */
    private Address schoolAddress;

    /**
     * Score for test 1.
     */
    private int testScore1;
    /**
     * Score for test 2.
     */
    private int testScore2;
    /**
     * Score for test 3.
     */
    private int testScore3;
    /**
     * Average score for the three tests.
     */
    private double average;
    /**
     * The number three.
     */
    private final double three = 3.0;
    /**
     * The number three for integer.
     */
    private final int threeInt = 3;

    /**
     * Constructor: Sets up this student with the specified values.
     * 
     * @param first
     *            The first name of the student
     * @param last
     *            The last name of the student
     * @param home
     *            The home address of the student
     * @param school
     *            The school address of the student
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }

    /**
     * Constructor: Sets up this student with the specified values.
     * 
     * @param first
     *            First name.
     * @param last
     *            Last name.
     * @param home
     *            Home address.
     * @param school
     *            School address.
     * @param num1
     *            Test score 1.
     * @param num2
     *            Test score 2.
     * @param num3
     *            Test score 3.
     */
    public Student(String first, String last, Address home, 
            Address school, int num1, int num2, int num3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = num1;
        testScore2 = num2;
        testScore3 = num3;
        this.average();
    }

    /**
     * Sets the test score for one of the three tests.
     * 
     * @param testnum
     *            The number of the test.
     * @param score
     *            The score for the test.
     */
    public void setTestScore(int testnum, int score) {

        // Throw exception for test number not 1-3.
        if (testnum > threeInt || testnum < 1) {
            throw new IllegalArgumentException("Invalid test number entered.");
        }
        
        // Throw exception for negative test scores.
        if (score < 0) {
            throw new IllegalArgumentException("Test score can not " 
        + "be negative.");
        }

        switch (testnum) {
        case 1:
            testScore1 = score;
            break;
        case 2:
            testScore2 = score;
            break;
        case threeInt:
            testScore3 = score;
            break;
        default:
            break;
        }
        this.average();
    }

    /**
     * Gets the test score.
     * 
     * @param testnum
     *            The number of the test.
     * @return The score for the test.
     */
    public int getTestScore(int testnum) {

        // Throw exception for test number not 1-3.
        if (testnum > threeInt || testnum < 1) {
            throw new IllegalArgumentException("Invalid test number entered.");
        }

        switch (testnum) {
        case 1:
            return this.testScore1;
        case 2:
            return this.testScore2;
        case threeInt:
            return this.testScore3;
        default:
            return 0;
        }
    }

    /**
     * Calculates the average for the tests.
     * 
     * @return The average for the tests.
     */
    public double average() {
        average = (testScore1 + testScore2 + testScore3) / three;
        return average;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" 
    + lastName + ", homeAddress=" + homeAddress
                + ", schoolAddress=" + schoolAddress 
                + ", testScore1=" + testScore1 + ", testScore2=" + testScore2
                + ", testScore3=" + testScore3 + ", average=" + average + "]";
    }
}
