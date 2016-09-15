package p8;

import java.util.Scanner;
import java.util.Random;

/**
 * TestWalk.
 * 
 * @author ROGER
 * @version 1.0
 */
public class TestWalk {

    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        int maxSteps;
        int x, y;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        maxSteps = generator.nextInt(191) + 10;

        System.out.println("\nRandom Walk Test Program");
        System.out.println();

        System.out.print("Enter the starting x and y coordinates with " 
        + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();

        RandomWalk walk1 = new RandomWalk(maxSteps, 10);
        RandomWalk walk2 = new RandomWalk(maxSteps, 10, x, y);

        //Takes 5 steps
        /*
         * for (int i = 0; i <= 4; i++) { walk1.takeStep(); walk2.takeStep(); }
         */

        walk1.walk();
        walk2.walk();

        System.out.println(walk1);
        System.out.println(walk2);

        scan.close();
    }
}
