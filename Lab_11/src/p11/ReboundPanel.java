package p11;

import static java.lang.Math.abs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ReboundPanel.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ReboundPanel extends JPanel {
    /**
     * Width and Height.
     */
    private final int WIDTH = 300, HEIGHT = 100;
    /**
     * Delay and image size.
     */
    private final int DELAY = 20, IMAGE_SIZE = 35;
    /**
     * Image icon object.
     */
    private ImageIcon image, image2;
    /**
     * Timer.
     */
    private Timer timer;
    /**
     * Position for the first icon.
     */
    private int x, y, moveX, moveY;
    /**
     * Position for the second icon.
     */
    private int x2, y2, moveX2, moveY2;

    /**
     * Sets up the panel, including the timer for the animation.
     */
    public ReboundPanel() {
        timer = new Timer(DELAY, new ReboundListener());

        // Need to use full path with mac system.
        image = new ImageIcon("/Users/ROGER/Documents/" 
        + "BCIT/COMP1510/Lab_11/src/p11/happyFace.gif");
        image2 = new ImageIcon("/Users/ROGER/Documents/" 
        + "BCIT/COMP1510/Lab_11/src/p11/happyFace.gif");

        x = 0;
        y = 40;
        moveX = moveY = 3;

        moveX2 = 5;
        moveY2 = 8;
        x2 = 50;
        y2 = 100;

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        timer.start();
    }

    /**
     * Draws the image in the current location.
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        image.paintIcon(this, page, x, y);
        image.paintIcon(this, page, x2, y2);

    }

    /**
     * Represents the action listener for the timer.
     * 
     * @author ROGER
     * @version 1.0
     */
    private class ReboundListener implements ActionListener {
        /**
         * Updates the position of the image and possibly the direction of
         * movement whenever the timer fires an action event.
         */
        public void actionPerformed(ActionEvent event) {

            // First image icon.
            x += moveX;
            y += moveY;

            // If x is off the panel, change velocity to bring it back
            if (x <= 0) {
                moveX = abs(moveX);
            } else if (x >= getWidth() - image.getIconWidth()) {
                moveX = -abs(moveX);
            }

            // If y is off the panel, change velocity to bring it back
            if (y <= 0) {
                moveY = abs(moveY);
            } else if (y >= getHeight() - image.getIconHeight()) {
                moveY = -abs(moveY);
            }

            // Second image icon.
            x2 += moveX2;
            y2 += moveY2;

            // If x is off the panel, change velocity to bring it back
            if (x2 <= 0) {
                moveX2 = abs(moveX2);
            } else if (x2 >= getWidth() - image2.getIconWidth()) {
                moveX2 = -abs(moveX2);
            }

            // If y is off the panel, change velocity to bring it back
            if (y2 <= 0) {
                moveY2 = abs(moveY2);
            } else if (y2 >= getHeight() - image2.getIconHeight()) {
                moveY2 = -abs(moveY2);
            }

            // Bounce off each other.
            double x1_center;
            double x2_center;
            double y1_center;
            double y2_center;

            x1_center = x + image.getIconWidth() / 2;
            x2_center = x2 + image.getIconWidth() / 2;
            y1_center = y + image.getIconHeight() / 2;
            y2_center = y2 + image.getIconHeight() / 2;

            double distance = Math.sqrt 
                    (Math.pow((x2_center - x1_center), 2) 
                            + Math.pow((y2_center - y1_center), 2));
            if (distance < image.getIconWidth()) {
                moveX = -1 * moveX;
                moveY = -1 * moveY;
                moveX2 = -1 * moveX2;
                moveY2 = -1 * moveY2;
            }

            repaint();
        }
    }
}