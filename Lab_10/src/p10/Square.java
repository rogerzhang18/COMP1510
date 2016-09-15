package p10;

import java.util.Scanner;

/**
 * Square.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Square {

    /**
     * Two dimention array for square.
     */
    private int[][] square;

    /**
     * create new square of given size.
     * 
     * @param size
     *            Size of the nxn grid.
     */
    public Square(int size) {
        square = new int[size][size];
    }

    /**
     * return the sum of the values in the given row.
     * 
     * @param row
     *            row of the grid.
     * @return sum of row.
     */
    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square[row].length; i++) {
            sum += square[row][i];
        }
        return sum;
    }

    /**
     * return the sum of the values in the given column.
     * 
     * @param col
     *            column of the grid.
     * @return sum of column.
     */
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square[col].length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    /**
     * return the sum of the values in the main diagonal.
     * 
     * @return sum of diagonal.
     */
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    /**
     * return the sum of the values in the other ("reverse") diagonal.
     * 
     * @return sum of other diagonal.
     */
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[square.length - i - 1][square.length - i - 1];
        }
        return sum;

    }

    /**
     * return true if the square is magic (all rows, cols, and diags have same
     * sum), false otherwise.
     * 
     * @return True for magic square, otherwise, return false.
     */
    public boolean magic() {

        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) == sumCol(i) && sumOtherDiag() 
                    == sumMainDiag() && sumRow(i) == sumMainDiag()) {
                return true;
            }
        }
        return false;
    }

    /**
     * read info into the square from the input stream associated with the
     * Scanner parameter.
     * 
     * @param scan
     *            scan for square inputs.
     */
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    /**
     * print the contents of the square, neatly formatted.
     */
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.println(square[row][col] + "\t");
            }
        }
    }
}
