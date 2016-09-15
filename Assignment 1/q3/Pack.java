package q3;

/**
 * <p>
 * This program contains five values chosen from A-I and encodes them all into
 * integer value then decode the value back to five characters.
 * </p>
 *
 * @author Zhang,Yongjian,SetA
 * @version 1.0
 */

public class Pack {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // hard codes the five character value
        final char c1 = 'I';
        final char c2 = 'F';
        final char c3 = 'E';
        final char c4 = 'B';
        final char c5 = 'A';

        // defines the base 56 as a variable
        final int base = 56;

        // defines 64 as a constant used in decode
        final int tableValue = 64;

        /*
         * Encodes the value to integers corresponded in the MIX computer table.
         */
        int digit1 = (int) c1 - 'A' + 1;
        int digit2 = (int) c2 - 'A' + 1;
        int digit3 = (int) c3 - 'A' + 1;
        int digit4 = (int) c4 - 'A' + 1;
        int digit5 = (int) c5 - 'A' + 1;

        // converts the digits into base 56 number and store the sum
        int value = digit1 * base * base * base * base 
                + digit2 * base * base * base + digit3 * base * base
                + digit4 * base + digit5;

        /*
         * decodes the value back to the characters in the mix computer table
         */
        char char1 = (char) (value % base + tableValue);
        char char2 = (char) (value / base % base + tableValue);
        char char3 = (char) (value / base / base % base + tableValue);
        char char4 = (char) (value / base / base / base % base + tableValue);
        char char5 = (char) (value / base / base / base / base % base 
                + tableValue);

        // prints the original, encoded and decoded result
        System.out.println("Original: " + c1 + c2 + c3 + c4 + c5);
        System.out.println("Encoded: " + value);
        System.out.println("Decoded: " + char5 + char4 + char3 + char2 + char1);
        System.out.println("Question three was called and ran sucessfully.");
    }

};
