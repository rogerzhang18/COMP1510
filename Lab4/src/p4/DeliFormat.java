package p4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
// ************************************************************ 
// DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item. //
// ************************************************************
import java.util.Scanner;

public class DeliFormat {
    // ---------------------------------------------------
    // main reads in the price per pound of a deli item
    // and number of ounces of a deli item then computes
    // the total price and prints a "label" for the item
    // ---------------------------------------------------
    public static void main(String[] args) {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the CS Deli! ! \n ");
        System.out.print("Enter the unit price: ");
        pricePerPound = scan.nextDouble();
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("0.##");

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        System.out.println("\n*****CSDeli*****");
        System.out.println("\nUnit price is: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight bought: " + fmt.format(weight) + " pounds");
        System.out.println("Subtotal: " + money.format(totalPrice));
        // Print the label using the formatting objects
        // fmt for the weight in pounds and money for the prices

        scan.close();
    }
}