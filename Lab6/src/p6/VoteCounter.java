package p6;

//************************************************************
//VoteCounter.java
//
//Demonstrates a graphical user interface and event
//listeners to tally votes for two candidates, Joe and Sam.
//************************************************************
import javax.swing.JFrame;

/**
 * VoteCounter.
 * 
 * @author ROGER
 * @version 1.0
 */
public class VoteCounter {
    // -----------------------------------------
    // Creates the main program frame.
    // -----------------------------------------
    /**
     * Vote counter main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
