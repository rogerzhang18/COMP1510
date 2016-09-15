package p10;

import java.util.Scanner;

import java.io.File;
import java.io.IOException;

/**
 * SquareTest.
 * 
 * @author ROGER
 * @version 1.0
 */
public class SquareTest {
    /**
     * Main method.
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("magicData"));

        int count = 1; // count which square we're on
        int size = scan.nextInt(); // size of next square
        // Expecting -1 at bottom of input file
        while (size != -1) {
            // create a new Square of the given size
            Square square = new Square(size);

            // call its read method to read the values of the square
            square.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");

            // print the sums of its rows
            for (int i = 0; i < size; i++) {
                System.out.println("The sum of row is " + square.sumRow(i));
            }

            // print the sums of its columns
            for (int i = 0; i < size; i++) {
                System.out.println("The sum of col is " + square.sumCol(i));
            }

            // print the sum of the main diagonal
            System.out.println("The sum of diagonal is " + square.sumMainDiag());

            // print the sum of the other diagonal
            System.out.println("The sum of diagonal is " + square.sumOtherDiag());

            // determine and print whether it is a magic square
            System.out.println("The square " + ((square.magic()) ? "is " : "is not ") 
                    + "a magic square.");

            // get size of next square
            size = scan.nextInt();
            count++;
        }
    }
}
