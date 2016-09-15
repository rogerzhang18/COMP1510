package p10;

import javax.swing.*;

/**
 * ColorOptions.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ColorOptions {
    /**
     * Creates and presents the frame for the color change panel. //
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        JFrame colorFrame = new JFrame("Color Options");
        colorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorOptionsPanel panel = new ColorOptionsPanel();
        colorFrame.getContentPane().add(panel);
        colorFrame.pack();
        colorFrame.setVisible(true);
    }
}