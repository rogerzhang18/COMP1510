package q1;

import java.util.Scanner;

/**
 * <p>
 * The program computes and prints out the mean and standard deviation of a list
 * of integers x1 through xn.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class Statistics {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // Assume no more than 50 inputs.
        final int size = 50;

        // Creates an array of integers with size 50.
        int[] input = new int[size];

        // initialize variables.
        int sum = 0;
        double sumSD = 0;
        double mean;
        double deviation;
        int count = 0;

        // Initialize scanner.
        Scanner scan = new Scanner(System.in);

        // If there's a number exist, it is stored into the array.
        while (scan.hasNext()) {
            input[count] = scan.nextInt();
            sum += input[count];
            count++;
        }

        // Computes the mean.
        mean = (double) sum / count;
        for (int i = 0; i < count; i++) {
            sumSD += Math.pow(input[i] - mean, 2);
        }

        // Computes the standard deviation.
        deviation = (double) Math.sqrt(sumSD / (count - 1));

        // Prints out the result.
        System.out.println("The mean is: " + mean 
                + " ouf of " + count + " numbers.");
        System.out.println("The standard deviation is " + deviation + ".");

        scan.close();

        System.out.println("Question one was called and ran sucessfully.");
    }

};
