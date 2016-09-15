package p7;

/**
 * Runs.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Runs {

    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        final int flips = 100; // number of coin flips
        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0; // length of the maximum run so far

        // Create a coin object
        Coin myCoin = new Coin();

        // Flip the coin FLIPS times
        for (int i = 0; i < flips; i++) {
            // Flip the coin & print the result
            myCoin.flip();
            System.out.println(myCoin);
            // Update the run information
            if (myCoin.getFace() == 0) {
                currentRun++;
            } else {
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
                currentRun = 0;
            }

        }
        // Print the results
        System.out.println("Longest streak for heads is: " + maxRun);
    }

}
