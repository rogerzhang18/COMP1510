package p6;

//************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

/**
 * Rock,Paper,Scissors.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Rock {
    /**
     * Main class.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay = ""; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine
        String uppercasePlayer; // Changes the user's input into uppercase
                                // letter.

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Get player's play -- note that this is stored as a string
        System.out.println("$ Java Rock");
        System.out.println("Enter your play: R P or S");
        personPlay = scan.nextLine();

        // Make player's play uppercase for ease of comparison
        uppercasePlayer = personPlay.toUpperCase();

        // Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);

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
        
        System.out.println("Computer choose: " + computerPlay);
        
        // Print computer's play
        // See who won. Use nested ifs instead of &&.
        if (uppercasePlayer.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (uppercasePlayer.equals("R")) {

            if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock. You lose!");
            } else {
                System.out.println("Rock beats scissors. You win!");
            }

        } else if (uppercasePlayer.equals("S")) {
            if (computerPlay.equals("R")) {
                System.out.println("Rock crushes scissors. You lose!");
            } else {
                System.out.println("Scissors beat paper. You win!");
            }

        } else if (uppercasePlayer.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock. You win!");
            } else {
                System.out.println("Scissors cut paper. You lose!");
            }
        }
        
        scan.close();
    }
}