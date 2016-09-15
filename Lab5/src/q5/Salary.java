package q5;

//************************************************************
//Salary.java
//
//Computes the amount of a raise and the new
//salary for an employee.  The current salary
//and a performance rating (a String: "Excellent",
//"Good" or "Poor") are input.
//************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Salary.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Salary {
    /**
     * Computes the total salary with bonus.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {

        double currentSalary;
        double raise;
        double newSalary;
        String rating;
        double excellentBonus = 0.06;
        double goodBonus = 0.04;
        double poorBonus = 0.015;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating " 
        + "(Excellent, Good, or Poor): ");
        rating = scan.next();

        // computes the bonus according to the input status.
        if (rating.equalsIgnoreCase("Excellent")) {
            raise = excellentBonus * currentSalary;
        } else if (rating.equalsIgnoreCase("Good")) {
            raise = goodBonus * currentSalary;
        } else {
            raise = poorBonus * currentSalary;
        }

        // Calculates the new salary.
        newSalary = currentSalary + raise;

        // Print the results with proper money format.
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();

        scan.close();
    }
}