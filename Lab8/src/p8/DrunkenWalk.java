package p8;

import java.util.Random;
import java.util.Scanner;

/**
 * DrunkenWalk.
 * 
 * @author ROGER
 * @version 1.0
 */
public class DrunkenWalk {
    /**
     * Main method for the DrunkenWalk.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        int maxSteps;
        int maxCoord;
        int drunk;
        int fallOff = 0;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        maxSteps = generator.nextInt(191) + 10;

        System.out.println("Please enter the boundary: ");
        maxCoord = scan.nextInt();
        System.out.println("Please enter the maximum steps: ");
        maxSteps = scan.nextInt();
        System.out.println("Please enter the number of drunks: ");
        drunk = scan.nextInt();

        for (int i = 1; i < drunk; i++) {
            RandomWalk drunkWalk = new RandomWalk(maxSteps, maxCoord);
            drunkWalk.walk();

            if (!drunkWalk.inBounds()) {
                fallOff++;
            }
        }
        System.out.println("The drunks have fall off " + fallOff + " times.");
        scan.close();
    }
}
