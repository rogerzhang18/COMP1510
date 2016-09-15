package q5;

//************************************************************
//VoteCounterPanel.java
//
//Demonstrates a graphical user interface and event listeners to
//tally votes for two candidates, Joe and Sam.
//************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * VoteCounterPanel.
 * 
 * @author ROGER
 * @version 1.0
 */
public class VoteCounterPanel extends JPanel {

    private static final long serialVersionUID = 12345L;

    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;

    /**
     * Constructor.
     */
    public VoteCounterPanel() {

        votesForJoe = 0;
        votesForSam = 0;

        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");

        joe.addActionListener(new JoeButtonListener());
        sam.addActionListener(new SamButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);

        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);

        setPreferredSize(new Dimension(300, 80));
        setBackground(Color.cyan);
    }

    // **************************************************
    // Represents a listener for button push (action) events
    // **************************************************
    /**
     * JoeButtonListener.
     * 
     * @author ROGER
     */
    private class JoeButtonListener implements ActionListener {
        // --------------------------------------------- // Updates the counter
        // and label when Vote for Joe // button is pushed
        // //---------------------------------------------
        /**
         * Responds to an ActionEvent.
         * 
         * @param event
         *            get action event from button press
         */
        public void actionPerformed(ActionEvent event) {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " + votesForJoe);
        }
    }

    /**
     * SamButtonListener.
     * 
     * @author ROGER
     */
    private class SamButtonListener implements ActionListener {
        // --------------------------------------------- // Updates the counter
        // and label when Vote for Sam // button is pushed
        // //---------------------------------------------
        /**
         * Responds to an ActionEvent.
         * 
         * @param event
         *            get action event from button press
         */
        public void actionPerformed(ActionEvent event) {
            votesForSam++;
            labelSam.setText("Votes for Sam: " + votesForSam);
        }
    }
}