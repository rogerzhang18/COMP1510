package q1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>
 * Triangle application that reads in the length of the sides from the user and
 * calculate the perimeter and area.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM. It
     * drives the program
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // defines the three side of a triangle
        int side1;
        int side2;
        int side3;

        // defines the number
        int two = 2;

        // defines the perimeter, half perimeter and area
        int sum;
        int halfSum;
        double triArea;

        // generate scanner
        Scanner scan = new Scanner(System.in);

        // defines the format to three decimal place
        DecimalFormat fmt = new DecimalFormat("0.###");

        // gets input from user for three sides
        System.out.println("Please enter the first side of triangle: ");
        side1 = scan.nextInt();
        System.out.println("Please enter the second side of triangle: ");
        side2 = scan.nextInt();
        System.out.println("Please enter the third side of triangle: ");
        side3 = scan.nextInt();

        /*
         * Computes the perimeter of the triangle.
         */
        sum = side1 + side2 + side3;

        /* Computes the half perimeter */
        halfSum = sum / two;

        /*
         * Computes the area of the triangle
         */
        triArea = Math.sqrt(halfSum * (halfSum - side1) 
                * (halfSum - side2) * (halfSum - side3));

        // prints out the result
        System.out.println(
                "The perimeter of your triangle is " + fmt.format(sum) 
                + "\nThe Area is: " + fmt.format(triArea));

        System.out.println("Question one was called and ran sucessfully.");

        // close scanner
        scan.close();
    }

};
