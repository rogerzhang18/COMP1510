package q5;

import java.util.Scanner;

/**
 * TestNames.
 * 
 * @author ROGER
 * @version 1.0
 */
public class TestNames {
    /**
     * TestNames driver program.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {

        String firstName;
        String middleName;
        String lastName;

        Scanner scan = new Scanner(System.in);

        // prompt user to enter first middle and last name.
        System.out.println("Please enter first middle and last name: ");
        firstName = scan.nextLine();
        middleName = scan.nextLine();
        lastName = scan.nextLine();

        final Name name1 = new Name(firstName, middleName, lastName);

        System.out.println("first middle last version: " 
            + name1.firstMiddleLast() + "\nlastfirstmiddle version: "
            + name1.lastFirstMiddle() + "\ninitial: " 
            + name1.initials() + "\nlength: " + name1.length());

        System.out.println("Please enter another first middle and last name: ");
        firstName = scan.nextLine();
        middleName = scan.nextLine();
        lastName = scan.nextLine();

        final Name name2 = new Name(firstName, middleName, lastName);

        System.out.println("first middle last version: " 
            + name2.firstMiddleLast() + "\nlastfirstmiddle version: "
            + name2.lastFirstMiddle() + "\ninitial: " 
            + name2.initials() + "\nlength: " + name2.length());

        System.out.println("Are the names same?");

        System.out.println(name1.equals(name2));

        scan.close();
    }
}
