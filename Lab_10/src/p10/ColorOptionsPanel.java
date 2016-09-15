package p10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ColorOptionsPanel.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ColorOptionsPanel extends JPanel {

    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private Color[] color = new Color[NUM_COLORS];
    private JLabel heading;
    private JRadioButton[] ColorButton = new JRadioButton[NUM_COLORS];

    /**
     * Sets up a panel with a label at the top and a set of radio buttons that
     * control the background color of the panel.
     */
    public ColorOptionsPanel() {
        // Set up heading and colors
        heading = new JLabel("Choose the background color!");
        heading.setFont(new Font("Helvetica", Font.BOLD, FONT_SIZE));
        color[0] = Color.yellow;
        color[1] = Color.cyan;
        color[2] = Color.red;
        color[3] = Color.green;
        color[4] = Color.magenta;

        /*
         * Instantiate a ButtonGroup object and a ColorListener object
         */
        ColorButton[0] = new JRadioButton("Yellow", true);
        ColorButton[1] = new JRadioButton("Cyan");
        ColorButton[2] = new JRadioButton("Red");
        ColorButton[3] = new JRadioButton("Green");
        ColorButton[4] = new JRadioButton("Magenta");

        // Set up the panel
        add(heading);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // Group the radio buttons, add a ColorListener to each,
        // set the background color of each and add each to the panel.
        ButtonGroup group = new ButtonGroup();
        ColorListener listener = new ColorListener();
        for (int i = 0; i < NUM_COLORS; i++) {
            group.add(ColorButton[i]);
            add(ColorButton[i]);
            ColorButton[i].setBackground(Color.white);
            ColorButton[i].addActionListener(listener);
        }
    }

    /**
     * Represents the listener for the radio buttons.
     */
    private class ColorListener implements ActionListener {
        /**
         * Updates the background color of the panel based on which radio button
         * is selected.
         */
        public void actionPerformed(ActionEvent event) {
            for (int i = 0; i < NUM_COLORS; i++) {
                if (ColorButton[i].isSelected()) {
                    setBackground(color[i]);
                    return;
                }
            }
        }
    }
}
