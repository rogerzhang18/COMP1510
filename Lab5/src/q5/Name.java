package q5;

/**
 * Name.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Name {

    /**
     * Instance data for first name.
     */
    private String firstName;
    /**
     * Instance data for middle name.
     */
    private String middleName;
    /**
     * Instance data for last name.
     */
    private String lastName;

    /**
     * Constructor for objects of type Name.
     */
    public Name() {

    }

    /**
     * Constructor for objects of type Name.
     * 
     * @param first
     *            reference for first name.
     * @param middle
     *            reference for middle name.
     * @param last
     *            reference for last name.
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    /**
     * Returns the first name.
     * 
     * @return firstName as a string.
     */
    public String getFirst() {
        return this.firstName;
    }

    /**
     * Sets the first name.
     * 
     * @param first
     *            name reference.
     */
    public void setFirst(String first) {
        this.firstName = first;
    }

    /**
     * Returns the middle name.
     * 
     * @return middle name as a string.
     */
    public String getMiddle() {
        return this.middleName;
    }

    /**
     * Sets the middle name.
     * 
     * @param middle
     *            name reference.
     */
    public void setMiddle(String middle) {
        this.middleName = middle;
    }

    /**
     * Gets the last name.
     * 
     * @return last name as string.
     */
    public String getLast() {
        return this.lastName;
    }

    /**
     * Sets the last name.
     * 
     * @param last
     *            name as reference
     */
    public void setLast(String last) {
        this.lastName = last;
    }

    /**
     * Get first middle and last name.
     * 
     * @return fullName as one string
     */
    public String firstMiddleLast() {
        String fullName = firstName + middleName + lastName;
        return fullName;
    }

    /**
     * Get last first middle name.
     * 
     * @return fullNameRev as one string.
     */
    public String lastFirstMiddle() {
        String fullNameRev = lastName + "," + firstName + middleName;
        return fullNameRev;
    }

    /**
     * Compare two names.
     * 
     * @param otherName
     *            The name object called.
     * @return equal as a boolean true or false value for the comparison
     */
    public boolean equals(Name otherName) {
        String nameFirst = this.firstMiddleLast();
        String nameSecond = otherName.firstMiddleLast();
        boolean equal = nameFirst.equalsIgnoreCase(nameSecond);
        return equal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Name [firstName=" + firstName + ", middleName=" 
    + middleName + ", lastName=" + lastName + "]";
    }

    /**
     * Gets the initial for the name.
     * 
     * @return initial of the name all in upper case.
     */
    public String initials() {
        String initials = firstName.substring(0, 1) 
                + middleName.substring(0, 1) + lastName.substring(0, 1);
        String iniUpper = initials.toUpperCase();
        return iniUpper;
    }

    /**
     * Gets the length of the name excluding the space.
     * 
     * @return the length of the name without space.
     */
    public int length() {
        String nospace = firstName.replace(" ", "") 
                + middleName.replace(" ", "") + lastName.replace(" ", "");
        int length = nospace.length();
        return length;
    }
}
