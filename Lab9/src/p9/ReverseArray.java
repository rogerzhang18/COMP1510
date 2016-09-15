package p9;

import java.util.Scanner;

/**
 * ReverseArray.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ReverseArray {
    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        int size;
        int num;
        int temp;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an array size: ");
        size = scan.nextInt();

        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter a number for array " + i + ":");
            num = scan.nextInt();
            input[i] = num;
        }

        for (int i = 0; i < size / 2; i++) {
            temp = input[i];
            input[i] = input[size - 1 - i];
            input[size - 1 - i] = temp;
        }

        System.out.println("Your reversed array is: ");

        for (int j = 0; j < size; j++) {
            System.out.println(input[j]);
        }

        scan.close();
    }
}
