package q4;

import java.util.Scanner;

/**
 * <p>
 * This program generates all the prime numbers within a boundary given by the
 * user.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class Primes {

    /**
     * Array of booleans to check for prime numbers.
     */
    private static boolean[] primes;
    /**
     * Initialize the boundary.
     */
    private static int boundary;
    /**
     * Number 2.
     */
    private static final int TWO = 2;

    /**
     * Constructor.
     * 
     * @param num
     *            Upper bound of the prime numbers.
     */
    public Primes(int num) {

        // Throw exception for negative boundary.
        if (num < 0) {
            throw new IllegalArgumentException("boundary " 
        + "cannot be negative numbers.");
        }

        boundary = num;
        primes = new boolean[boundary + 1];
        this.calculatePrimes();
        this.printPrimes();
    }

    /**
     * Calculates prime numbers. Sets true if the number is a prime number. Sets
     * false if the number is not.
     */
    private void calculatePrimes() {

        /*
         * Assume all outputs are prime numbers then eliminate any that is not.
         */
        for (int i = 2; i <= boundary; i++) {
            primes[i] = true;
        }

        /*
         * Checks for prime numbers, since we are rejecting all numbers that is
         * a multiple of another, the boundary only need to go to half.
         */
        for (int i = 2; i <= boundary / TWO; i++) {

            // Mark everything that is a multiple of i false.
            if (primes[i]) {
                for (int j = i * i; j <= boundary; j += i) {
                    primes[j] = false;
                }

            }
        }
    }

    /**
     * Prints the prime numbers.
     */
    public void printPrimes() {
        
        System.out.println("The prime numbers between 0 and " 
        + boundary + " are: ");
        
        for (int i = 0; i <= boundary; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Counts the number of prime numbers.
     * 
     * @return the number of prime numbers
     */
    public int countPrimes() {
        int num = 0;
        for (int i = 0; i <= boundary; i++) {
            if (primes[i]) {
                num++;
            }
        }
        return num;
    }

    /**
     * Checks if the number is a prime number.
     * 
     * @param num
     *            Number provided by the user.
     * @return True if it is a prime number. False if it is not.
     */
    public boolean isPrime(int num) {
        return primes[num];
    }

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // Upper bound for prime number.
        int n;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program uses the sieve of "
                + "Eratosthenese to determine which numbers are prime.\n");
        System.out.println("Please enter an upper bound: ");
        n = scan.nextInt();

        Primes prime = new Primes(n);
        int num = prime.countPrimes();

        System.out.println("\nThere are " + num + " prime numbers.");

        scan.close();
        System.out.println("Question four was called and ran sucessfully.");
    }
};
