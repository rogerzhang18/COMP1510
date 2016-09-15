package p10;

import javax.swing.JFrame;
/**
 * Circles.
 * @author ROGER
 * @version 1.0.
 */
public class Circles {
    /**
     * Creates and displays the application frame.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Circles");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new CirclePanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);
    }
}