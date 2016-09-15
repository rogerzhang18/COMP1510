package q5;

import javax.swing.JFrame;

/**
 * Vote Counter.
 * 
 * @author ROGER
 * @version 1.0
 */
public class VoteCounter {
    /**
     * VoteCounter main method.
     * 
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vote Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VoteCounterPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
