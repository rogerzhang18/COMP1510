package q4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * TrafficLightFrame.
 * 
 * @author Yongjian Zhang
 * @version 1.0
 */
public class TrafficLightPanel extends JFrame {

    /** Unique version of this panel. */
    private static final long serialVersionUID = -1231323;

    /** Graph x position of the traffic light. */
    private static final int GRAPHX = 150;

    /** Graph y position of the traffic light. */
    private static final int GRAPHY = 340;

    /** Position of oval. */
    private static final int OVALX = 50;

    /** Position of oval. */
    private static final int OVALY = 70;

    /** Position of oval. */
    private static final int OVALY1 = 120;

    /** Position of oval. */
    private static final int OVALY2 = 170;

    /** Position of rectangle. */
    private static final int RECTY = 221;

    /** Rectangle length. */
    private static final int RECTL = 10;

    /** Rectangle width. */
    private static final int RECTW = 120;

    /** X position of string. */
    private static final int STRINGX = 20;

    /** Y position of string. */
    private static final int STRINGY = 40;

    /** Frame size X. */
    private static final int SIZEX = 200;

    /** Frame size Y. */
    private static final int SIZEY = 420;

    /** Define color code for red. */
    private Color redLight;

    /** Define color code for green. */
    private Color greenLight;

    /** Define color code for amber. */
    private Color amberLight;

    /** Color code for amber. */
    private final Color amberColor = new Color(255, 194, 0);

    /** Color for pole. */
    private final Color poleColor = new Color(0, 0, 0);

    /** Color for general background. */
    private final Color bgColor = new Color(236, 118, 0);

    /** Number count used in increment. */
    private int count;

    /** Color code for traffic light background. */
    private final Color trafficBG = new Color(193, 97, 0);

    /** Button declaration. */
    private JButton button;

    /**
     * <p>
     * The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).
     * </p>
     */
    public TrafficLightPanel() {
        super("Yongjian Zhang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize count to 0
        count = 0;

        // Initialize traffic light color
        redLight = Color.red;
        greenLight = Color.green;
        amberLight = amberColor;

        // Creates a button and an event
        button = new JButton("TrafficLightButton");
        button.addActionListener(new TrafficLightButton());

        // Creates a new panel to put the button and drawing in
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(new DrawingPanel());

        // Sets the background color
        panel.setBackground(bgColor);

        // Gets content panel
        getContentPane().add(panel);

        // Sets the size of panel
        setSize(SIZEX, SIZEY);
        setVisible(true);
    }

    /**
     * TrafficButton.
     * 
     * @author Yongjian Zhang
     * @version 1.0
     */
    private class TrafficLightButton implements ActionListener {
        /**
         * Changes the light by repainting.
         * 
         * @param event
         *            changes the light.
         */
        public void actionPerformed(ActionEvent event) {

            // defines the ratio
            final int ratio = 3;

            // defines the remainder
            int remainder = 0;

            // computes the value of remainder
            remainder = count % ratio;

            /*
             * remainder is 0 will give green light remainder is 1 will give
             * amber light remainder is 2 will give red light
             */
            if (remainder == 0) {
                getGreen();
            } else if (remainder == 1) {
                getAmber();
            } else if (remainder == 2) {
                getRed();
            }

            // repaint
            repaint();

            // increments count
            count++;
        }

        /**
         * Sets the color of the light to be green.
         */
        public void getGreen() {
            amberLight = Color.GRAY;
            redLight = Color.GRAY;
            greenLight = Color.GREEN;
        }

        /**
         * Sets the color of the light to be amber.
         */
        public void getAmber() {
            redLight = Color.GRAY;
            greenLight = Color.GRAY;
            amberLight = amberColor;
        }

        /**
         * Sets the color of the light to be red.
         */
        public void getRed() {
            amberLight = Color.GRAY;
            greenLight = Color.GRAY;
            redLight = Color.RED;
        }
    }

    /**
     * Draws the traffic light.
     * 
     * @author ROGER
     *
     */
    class DrawingPanel extends JPanel {

        /** Unique version of this panel. */
        private static final long serialVersionUID = -7488542957668577967L;

        /**
         * Sets the dimension of the applet.
         */
        DrawingPanel() {

            // sets the dimension
            setPreferredSize(new Dimension(GRAPHX, GRAPHY));

            // sets the background color
            setBackground(trafficBG);
        }

        /**
         * Paints the graph.
         * 
         * @param g
         *            reference to paint the graph.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            /*
             * Paint panel that draws the traffic light.
             */
            g.drawString("Traffic light!", STRINGX, STRINGY);
            g.setColor(redLight);
            g.fillOval(OVALX, OVALY, OVALX, OVALX);
            g.setColor(amberLight);
            g.fillOval(OVALX, OVALY1, OVALX, OVALX);
            g.setColor(greenLight);
            g.fillOval(OVALX, OVALY2, OVALX, OVALX);
            g.setColor(poleColor);
            g.fillRect(OVALY, RECTY, RECTL, RECTW);
            g.drawRect(OVALX, OVALY, OVALX, OVALX * OVALX * OVALX);

        }
    }
}