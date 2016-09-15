package p6;

//************************************************************
//Dates.java
//
//Determine whether a 2nd-millenium date entered by the user
//is valid
//************************************************************
import java.util.Scanner;

/**
 * Dates.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Dates {
    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {

        int month, day, year; // date read in from user
        int daysInMonth; // number of days in month read in
        boolean monthValid, yearValid, dayValid; // true if input from user is
                                                 // valid
        boolean leapYear; // true if user's year is a leap year

        Scanner scan = new Scanner(System.in);

        // Get integer month, day, and year from user
        System.out.println("Please enter a valid month day and year");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();

        // Check to see if month is valid
        if (month <= 12 && month >= 1) {
            monthValid = true;
        } else {
            monthValid = false;
        }

        // Check to see if year is valid
        if (year <= 1999 && year >= 1000) {
            yearValid = true;
        } else {
            yearValid = false;
        }

        // Determine whether it's a leap year
        if (year % 4 != 0) {
            leapYear = false;
        } else if (year % 100 != 0) {
            leapYear = true;
        } else if (year % 400 != 0) {
            leapYear = false;
        } else {
            leapYear = true;
        }

        // Determine number of days in month
        if (monthValid == true && yearValid == true) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                daysInMonth = 31;
            } else if (month == 2 && leapYear == false) {
                daysInMonth = 28;
            } else if (month == 2 && leapYear == true) {
                daysInMonth = 29;
            } else {
                daysInMonth = 30;
            }
        } else {
            daysInMonth = 0;
        }

        // User number of days in month to check to see if day is valid
        if (day <= daysInMonth) {
            dayValid = true;
        } else {
            dayValid = false;
        }

        // Determine whether date is valid and print appropriate message
        if (dayValid == true && leapYear == true) {
            System.out.println("Date is valid");
            System.out.println("It is a leap year!");
        } else if (dayValid == true && leapYear == false) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is not Valid");
        }

        scan.close();
    }
}