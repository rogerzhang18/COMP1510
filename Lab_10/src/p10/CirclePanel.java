package p10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Circle Panel.
 * 
 * @author ROGER
 * @version 1.0
 */
public class CirclePanel extends JPanel {
    /**
     * Width and height.
     */
    private final int WIDTH = 600, HEIGHT = 400;
    /**
     * Initialize object circle.
     */
    private Circle circle;

    /**
     * Sets up this panel to listen for mouse events.
     */
    public CirclePanel() {
        addMouseListener(new CirclesListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
     * Draws the current circle, if any.
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        if (circle != null)
            circle.draw(page);
    }

    /**
     * Represents the listener for mouse events.
     */
    private class CirclesListener implements MouseListener {
        /**
         * Creates a new circle at the current location whenever the mouse
         * button is pressed and repaints.
         */
        public void mousePressed(MouseEvent event) {
            if (circle == null) {
                circle = new Circle(event.getPoint());
            } else if (circle.isInside(event.getPoint())) {
                circle = null;
            } else {
                circle.move(getMousePosition());

            }
            repaint();
        }

        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        /**
         * Set background to white when mouse is in the panel.
         */
        public void mouseEntered(MouseEvent event) {
            setBackground(Color.white);
        }

        /**
         * Set background to blue when mouse exits the panel.
         */
        public void mouseExited(MouseEvent event) {
            setBackground(Color.blue);

        }
    }
}