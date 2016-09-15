package q1;

import java.util.Scanner;

/**
 * <p>
 * This program takes in users input and checks if the input is a palindrome. It
 * will only check for letters or numbers, the program ignores any other
 * characters entered.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class PalindromeTester {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        String sentence;
        String again = "y";
        int left = 0;
        int right;

        Scanner scan = new Scanner(System.in);

        while (again.equalsIgnoreCase("Y")) {

            System.out.println("Please enter a sentence: ");
            sentence = scan.nextLine();

            // Changes the input to all lower case for easy comparison.
            sentence = sentence.toLowerCase();

            // Replace all non-letter or non-numbers with nothing.
            sentence = sentence.replaceAll("[^a-z0-9]", "");

            right = sentence.length() - 1;

            // Compares the left and right characters.
            for (int i = 0; i < right && sentence.charAt(left) 
                    == sentence.charAt(right); i++) {
                left++;
                right--;
            }

            System.out.println();

            // Provide output accordingly.
            if (left < right) {
                System.out.println("The sentence is NOT a palindrome.");
            } else {
                System.out.println("The sentence IS a palindrome.");
            }

            System.out.println();
            System.out.print("Try another palindrome (y/n)? ");
            again = scan.nextLine();

        }

        scan.close();

        System.out.println("Question one was called and ran sucessfully.");
    }

};
