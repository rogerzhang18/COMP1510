package p6;

//***********************************************************
//VoteCounterPanel.java
//
//Panel for the GUI that tallies votes for two candidates,
//Joe and Sam.
//***********************************************************
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
    
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;

    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;

    //label to show who wins the voting.
    private JLabel competition;

    // -------------------------------------------------
    // Constructor: Sets up the GUI.
    // -------------------------------------------------
    /**
     * Constructor.
     */
    public VoteCounterPanel() {
        votesForJoe = 0;
        votesForSam = 0;

        joe = new JButton("Vote for Joe");
        sam = new JButton("Vote for Sam");

        VoteButtonListener listener = new VoteButtonListener();
        joe.addActionListener(listener);
        sam.addActionListener(listener);

        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        competition = new JLabel("");

        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);
        add(competition);
        setPreferredSize(new Dimension(300, 100));
        setBackground(Color.cyan);
    }

    // **************************************************
    // Represents a listener for button push (action) events
    // **************************************************
    /**
     * VoteButtonListener.
     * 
     * @author ROGER
     *
     */
    private class VoteButtonListener implements ActionListener {
        // ----------------------------------------------
        // Updates the appropriate vote counter when a
        // button is pushed for one of the candidates.
        // ----------------------------------------------
        /**
         * Response to action event.
         * 
         * @param event
         *            get action event from button press.
         */
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            } else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }

            if (votesForJoe > votesForSam) {
                competition.setText("\nJoe wins!");
            } else if (votesForSam == votesForJoe) {
                competition.setText("Its a tie!!!");
            } else {
                competition.setText("Sam wins!");
            }
        }
    }
}
