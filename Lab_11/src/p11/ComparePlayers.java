package p11;

import java.util.Scanner;

/**
 * ComparePlayers.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ComparePlayers {
    /**
     * Main method.
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {

        // Creates player 1 and 2.
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner scan = new Scanner(System.in);

        // Prompt for and read in information for player 1
        player1.readPlayer();

        // Prompt for and read in information for player 2
        player2.readPlayer();

        // Compare player1 to player 2 and print a message saying
        // whether they are equal
        if (player1.equals(player2)) {
            System.out.println("Same player.");
        } else {
            System.out.println("Not same player.");
        }
        scan.close();
    }
}