package p7;

import java.util.Scanner;

/**
 * Count.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Count {

    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        String phrase; // a string of characters
        int countBlank; // thenumberofblanks(spaces)inthephrase
        int length; // the length of the phrase
        char ch; // an individual character in the string

        // counts for A E S and T.
        int countA;
        int countE;
        int countS;
        int countT;

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();

        // Read in a string and find its length
        System.out.print("Enter a sentence or phrase " 
        + "(enter quit to exit): ");
        phrase = scan.nextLine();

        do {
            // Gets the lengths of the phrase.
            length = phrase.length();

            // Changes the phrase to all upper-case
            // letter for easy comparison.
            phrase = phrase.toUpperCase();

            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;

            // a for loop to go through the string character by character
            for (int i = 0; i < length; i++) {

                ch = phrase.charAt(i);

                switch (ch) {
                case 'A':
                    countA++;
                    break;
                case 'E':
                    countE++;
                    break;
                case 'S':
                    countS++;
                    break;
                case 'T':
                    countT++;
                    break;
                case ' ':
                    countBlank++;
                    break;
                }

            }
            // and count the blank spaces
            // Print the results
            System.out.println();
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of As: " + countA);
            System.out.println("Number of Es: " + countE);
            System.out.println("Number of Ss: " + countS);
            System.out.println("Number of Ts: " + countT);
            System.out.println();

            // Read in a string and find its length
            System.out.print("Enter a sentence or phrase " 
            + "(enter quit to exit): ");
            phrase = scan.nextLine();
        } while (!phrase.equalsIgnoreCase("quit"));

        scan.close();
    }
}
