package p9;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Sales.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Sales {
    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int average;
        int max = 0;
        int min = 99999;
        int maxPerson = 0;
        int minPerson = 0;
        int amount;
        int exceed = 0;

        int people;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the amount of salespeople.(1-5)");
        people = scan.nextInt();
        sales = new int [people];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > max) {
                max = sales[i];
                maxPerson = (i + 1);
            }
            if (sales[i] < min) {
                min = sales[i];
                minPerson = (i + 1);
            }
        }
        System.out.println("\nSalesperson  Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) + "         " 
        + fmt.format(sales[i]));
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + fmt.format(sum));

        average = sum / SALESPEOPLE;
        System.out.println("The average is: " + fmt.format(average));

        System.out.println("Salesperson " + maxPerson 
                + " has the highest sales with " + fmt.format(max));
        System.out.println("Salesperson " + minPerson 
                + " has the lowest sales with " + fmt.format(min));

        System.out.print("Please enter a standard amount: ");
        amount = scan.nextInt();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amount) {
                System.out.println("Salesperson " + (i + 1) 
                        + " exceeded with an amount of " 
                        + fmt.format(sales[i]));
                exceed++;
            }
        }
        System.out.println("A total of " + exceed + ((exceed > 1) 
                ? " people" : " person") + " have exceeded the amount.");

        scan.close();
    }
}
