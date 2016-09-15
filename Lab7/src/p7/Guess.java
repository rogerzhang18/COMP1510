package p7;

import java.util.Random;
import java.util.Scanner;

/**
 * Guess.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Guess {

    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        int realNum;
        int guess;
        boolean firstGuess = true;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Generates a number for guessing.
        realNum = generator.nextInt(10) + 1;

        do {
            if (firstGuess == true) {
                System.out.println("Enter a number between 1 and 10: ");
                firstGuess = false;
            }
            guess = scan.nextInt();
            //System.out.println(realNum);
            if (realNum != guess) {
                System.out.println("Please try again.");
                if(realNum < guess) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }
            } else {
                System.out.println("You are correct!");
            }
        } while (guess != realNum);

        scan.close();
    }
}
