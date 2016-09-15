package q2;

import java.util.Random;
import java.util.Scanner;

/**
 * <p>
 * This program plays rock paper scissors with user, user enters an input the
 * program generates an input and compares them, then calculates the winner.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class RockPaperScissors {

    /**
     * Amount of wins.
     */
    private static int win;
    /**
     * Amount of loses.
     */
    private static int lose;
    /**
     * Amount of ties.
     */
    private static int tie;
    /**
     * Make scan a private static variable.
     */
    private static Scanner scan;

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay = ""; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine
        String again = "y";
        final int three = 3;

        scan = new Scanner(System.in);
        
        System.out.println("Lets play Rock,Paper,Scissors!!!");
        System.out.println("Instructions: enter R/r for rock\n" 
        + "P/p for paper\nS/s for scissors");
        System.out.println(
                "In the end of the game, enter y " 
        + "to play again or n to stop playing and see your results.");

        do {

            Random generator = new Random();

            // Generate computer's play (0,1,2)
            computerInt = generator.nextInt(three);

            // Translate computer's randomly generated play to string
            switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            default:
                computerPlay = "S";
                break;
            }

            // Get player's play -- note that this is stored as a string
            System.out.println("\nEnter your play: ");
            personPlay = scan.nextLine();

            // Make player's play uppercase for ease of comparison
            personPlay = personPlay.toUpperCase();

            /*
             * Throws exception when user entered anything other than R, S or P
             */
            if (personPlay.equals("R") || personPlay.equals("S") 
                    || personPlay.equals("P")) {
                // compares user's input and computer's generated input.
                evaluation(personPlay, computerPlay);
            } else {
                throw new IllegalArgumentException("User " 
            + "entered an invalid input.");
            }

            System.out.println("Computer choose: " + computerPlay);

            System.out.println("Do you want to play again? (y)");
            again = scan.nextLine();

        } while (again.equalsIgnoreCase("y"));

        System.out.println("You won: " + win + " times.");
        System.out.println("You lost: " + lose + " times.");
        System.out.println("You tied: " + tie + " times.");
        
        System.out.println("Question two was called and ran sucessfully.");
    }

    /**
     * Evaluates the plays.
     * 
     * @param personPlay
     *            User's choice.
     * @param computerPlay
     *            Computer's choice.
     */
    public static void evaluation(String personPlay, String computerPlay) {

        if (personPlay.equals("R") && computerPlay.equals("S")) {
            System.out.println("You win!");
            win++;
        } else if (personPlay.equals("R") && computerPlay.equals("P")) {
            System.out.println("You lose!");
            lose++;
        } else if (personPlay.equals("P") && computerPlay.equals("R")) {
            System.out.println("You win!");
            win++;
        } else if (personPlay.equals("P") && computerPlay.equals("S")) {
            System.out.println("You lose!");
            lose++;
        } else if (personPlay.equals("S") && computerPlay.equals("P")) {
            System.out.println("You win!");
            win++;
        } else if (personPlay.equals("S") && computerPlay.equals("R")) {
            System.out.println("You lose!");
            lose++;
        } else {
            System.out.println("Its a tie!");
            tie++;
        }
    }
};