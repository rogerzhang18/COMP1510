package q2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * <p>
 * This application reads in the radius and height from the user and calculates
 * the surface area and volume of the cylinder.
 * </p>
 *
 * @author Zhang Yongjian
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM. Drives
     * the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // defines the radius and height
        double radius;
        double height;

        // defines the number
        double two = 2.0;

        // defines the area and volume
        double cylinderArea;
        double cylinderVol;

        // generates scanner
        Scanner scan = new Scanner(System.in);

        // defines the format to be in four decimal places
        DecimalFormat fmt = new DecimalFormat("0.####");

        // gets input from user for radius and height
        System.out.println("Please enter radius of the cylinder: ");
        radius = scan.nextInt();
        System.out.println("Please enter height of the cylinder: ");
        height = scan.nextInt();

        /*
         * Computes the area and volume of the cylinder.
         */
        cylinderArea = two * Math.PI * radius * (radius + height);
        cylinderVol = Math.PI * Math.pow(radius, two) * height;

        // prints out the result in four decimal places format
        System.out.println(
                "The Surface area is: " + fmt.format(cylinderArea) 
                + "\nThe Volume is: " + fmt.format(cylinderVol));

        System.out.println("Question two was called and ran sucessfully.");

        // close scanner
        scan.close();
    }

};
