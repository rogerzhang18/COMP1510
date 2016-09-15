package p11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Rebound.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Rebound {
    /**
     * Displays the main frame of the program.
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rebound");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ReboundPanel());
        frame.pack();
        frame.setVisible(true);
    }
}