package q3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * StopWatch Panel.
 * 
 * @author Yongjian Zhang
 * @version 1.0
 *
 */
public class StopWatchPanel extends JPanel {

    /**
     * Unique serial ID.
     */
    private static final long serialVersionUID = -5831859029538589486L;

    /**
     * Delay time for action.
     */
    private static final int DELAY = 10;

    /**
     * Initialize minute.
     */
    private int minute;

    /**
     * Initialize second.
     */
    private int second;

    /**
     * Initialize 1/10 of a second.
     */
    private int milisecond;

    /**
     * Number 9.
     */
    private final int nine = 9;

    /**
     * Start button.
     */
    private JButton start;

    /**
     * Stop button.
     */
    private JButton stop;

    /**
     * Reset button.
     */
    private JButton reset;

    /**
     * Watch label.
     */
    private JLabel watch;

    /**
     * Stop-watch panel.
     */
    private JPanel watchPanel;

    /**
     * Button panel.
     */
    private JPanel buttonPanel;

    /**
     * Timer object.
     */
    private Timer timer;

    /**
     * Initialize button listener.
     */
    private ActionListener time = new ButtonListener();

    /**
     * StopWatch panel.
     */
    public StopWatchPanel() {

        setLayout(new BorderLayout());
        setBackground(Color.yellow);
        watchPanel = new JPanel();
        watch = new JLabel("00:00:00", JLabel.CENTER);
        watchPanel.add(watch);
        add(watchPanel, BorderLayout.NORTH);
        buttonPanel = new JPanel();

        start = new JButton("Start");
        start.addActionListener(time);
        buttonPanel.add(start);
        start.setForeground(Color.blue);

        stop = new JButton("Stop");
        stop.addActionListener(time);
        buttonPanel.add(stop);
        stop.setForeground(Color.red);

        reset = new JButton("Reset");
        reset.addActionListener(time);
        buttonPanel.add(reset);
        reset.setForeground(Color.blue);

        add(buttonPanel, BorderLayout.CENTER);
        timer = new Timer(DELAY, time);
    }

    /**
     * Action performed when button pressed.
     * 
     * @author ROGER
     * @version 1.0
     */
    private class ButtonListener implements ActionListener {
        /**
         * Updates the time based on the button pressed.
         * 
         * @param event
         *            Timer action or button action.
         */
        public void actionPerformed(ActionEvent event) {

            // Initialize variables.
            final int milisecMax = 99;
            final int secMax = 60;

            /*
             * Increment second when milisecond hit 99.
             */
            if (milisecond == milisecMax) {
                second++;
                milisecond = 0;
            }

            /*
             * Increment minute when seconds hits 60.
             */
            if (second == secMax) {
                minute++;
                second = 0;
            }

            /*
             * Starts timer when start button is pressed, Stops timer when stop
             * button is pressed, Resets timer when the timer is stopped and
             * reset button is pressed.
             */
            if (event.getSource() == timer) {

                watch.setText(((minute <= nine) ? "0" : "") + minute + ":" 
                + ((second <= nine) ? "0" : "") + second
                        + ":" + ((milisecond <= nine) ? "0" : "") + milisecond);
                milisecond++;

            } else if (event.getSource() == start) {

                timer.start();

            } else if (event.getSource() == stop) {

                timer.stop();

            } else {

                if (!timer.isRunning()) {
                    timer.stop();
                    watch.setText("00:00:00");

                    // Reset variables to 0.
                    milisecond = 0;
                    second = 0;
                    minute = 0;
                }
            }
        }

    }
}
