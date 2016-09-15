package q2;
import java.util.Scanner;

/**
 * <p>This program will reads values represent in hours, minutes and seconds
 * and prints out the equivalent in seconds.</p>
 *
 * @author Zhang,Yongjian,SetA
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // creates an integer variable to store hours input.
        int hours;
        
        //creates an integer variable to store minutes input.
        int mins;
        
        //creates an integer variable to store seconds input.
        int seconds;
        
        //creates a variable to store the conversion constant 60s in 1min.
        final int timeConvert = 60;
        
        //generate scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user to input value for hours.
        System.out.print("Please enter the hours: ");
        hours = scan.nextInt();
        
        //prompt user to input value for minutes.
        System.out.print("Please enter the minutes: ");
        mins = scan.nextInt();
        
        //prompt user to input value for seconds.
        System.out.print("Please enter the seconds: ");
        seconds = scan.nextInt();
        
        /*
         * calculate total seconds by converting the minutes and hours
         * to seconds and add all together. Then stores in a variable
         * as the sum.
        */
        int totalSeconds = hours * timeConvert * timeConvert 
                + mins * timeConvert + seconds;
        
        //prints out the result
        System.out.println("The total number of seconds is: " + totalSeconds);
        System.out.println("Question two was called and ran sucessfully.");
        
        //close scanner
        scan.close();
    }

};