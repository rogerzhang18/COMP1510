package q4;

import java.util.Scanner;

/**
 * <p>
 * an application that prompts for and reads the radius (r) and height (h) of a
 * cylinder, then prints the cylinder's volume.
 * </p>
 *
 * @author Zhang,Yongjian,SetA
 * @version 1.0
 */

public class Cylinder {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // initialize scanner
        Scanner scan = new Scanner(System.in);

        // creates an double variable to store radius input.
        double radius;

        // creates an integer variable to store height input.
        double height;

        // creates a variable to store the result
        double volume;

        // prompt the user input for radius and height
        System.out.print("Please enter the radius: ");
        radius = scan.nextDouble();
        System.out.print("Please enter the height: ");
        height = scan.nextDouble();

        // calculates the volume of a cylinder
        volume = Math.PI * radius * radius * height;

        // prints the result
        System.out
                .println("The volume of a cylinder with radius " + radius 
                        + " and height " + height + " is " + volume);
        System.out.println("Question four was called and ran sucessfully.");

        // close scanner
        scan.close();
    }

};
