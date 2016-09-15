package q5;

import java.util.Scanner;

/**
 * This program will calculate the factorial of the number from user's input.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Factorial {

    /**
     * Drives the program.
     * 
     * @param args
     *            command line argument
     */
    public static void main(String[] args) {

        long userInput = -1;
        long count = 1;
        long sum = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        userInput = scan.nextInt();

        while (userInput < 0) {
            System.out.println("Please enter a non negative number: ");
            userInput = scan.nextInt();
        }

        if (userInput == 0) {
            sum = 1;
        }

        while (count <= userInput && userInput != 0) {
            sum *= count;
            count++;
        }

        System.out.println("The factorial of " + userInput + " is " + sum);

        scan.close();
    }
}
