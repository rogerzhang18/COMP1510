package q2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * DrawRectangle using rubber band technique.
 * 
 * @author Yongjian Zhang
 * @version 1.0
 */
public class DrawRectangle extends JFrame {

    /**
     * Unique serial ID.
     */
    private static final long serialVersionUID = 1213L;
    /**
     * Frame size.
     */
    private static final int SIZE = 400;

    /**
     * Constructor, creates the application frame.
     */
    public DrawRectangle() {
        super("Roger's Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawRectanglePanel());
        setSize(SIZE, SIZE);
        setVisible(true);
    }

    /**
     * Drawing panel.
     */
    private class DrawRectanglePanel extends JPanel 
    implements MouseListener, MouseMotionListener {

        /**
         * Unique serial ID.
         */
        private static final long serialVersionUID = 18000;

        /**
         * First point.
         */
        private Point p1;
        /**
         * Second point.
         */
        private Point p2;

        /**
         * Sets up the panel for mouse events.
         */
        DrawRectanglePanel() {
            addMouseListener(this);
            addMouseMotionListener(this);
        }

        /**
         * Graphics page.
         * 
         * @param g
         *            graphics panel
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.blue);

            /*
             * Prevents the drag point go out of range.
             * Gets the second corner point coordinates.
             */
            if (p1 != null && p2 != null) {
                if (p2.x >= getWidth()) {
                    p2.x = getWidth() - 1;
                }
                if (p2.x <= 0) {
                    p2.x = 1;
                }
                if (p2.y >= getHeight()) {
                    p2.y = getHeight() - 1;
                }
                if (p2.y <= 0) {
                    p2.y = 1;
                }
                int width = Math.abs(p2.x - p1.x);
                int height = Math.abs(p2.y - p1.y);

                // Draw the rectangle
                g.drawRect((p1.x < p2.x) ? p1.x : p2.x,
                        (p1.y < p2.y) ? p1.y : p2.y, width, height);
            }

            System.out.println("Paint called");
        }

        /**
         * mousePress action.
         * 
         * @param e
         *            position of mouse.
         */
        public void mousePressed(MouseEvent e) {
            p1 = e.getPoint();
            System.out.println("Mouse pressed called");
        }

        /**
         * mouseReleased action.
         * 
         * @param e
         *            position of mouse.
         */
        public void mouseReleased(MouseEvent e) {
            p2 = e.getPoint();
            repaint();
            System.out.println("Mouse released called");
        }

        /**
         * mouseDragged action.
         * 
         * @param e
         *            position of mouse.
         */
        public void mouseDragged(MouseEvent e) {
            p2 = e.getPoint();
            repaint();
            System.out.println("Mouse dragged called");
        }

        /**
         * Mouse enter event.
         * 
         * @param e
         *            Unused.
         */
        public void mouseEntered(MouseEvent e) {
        }

        /**
         * Mouse exit event.
         * 
         * @param e
         *            Unused.
         */
        public void mouseExited(MouseEvent e) {
        }

        /**
         * Mouse click event.
         * 
         * @param e
         *            Unused.
         */
        public void mouseClicked(MouseEvent e) {
        }

        /**
         * Mouse move event.
         * 
         * @param e
         *            Unused.
         */
        public void mouseMoved(MouseEvent e) {
        }

    }

    /**
     * Main method.
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        new DrawRectangle();
    }

};
