package p9;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * TelephonePanel.
 * 
 * @author ROGER
 * @version 1.0
 */
public class TelephonePanel extends JPanel {

    /**
     * Default serial number.
     */
    private static final long serialVersionUID = 12133L;

    /**
     * Telephone Panel.
     */
    public TelephonePanel() {

        // set BorderLayout for this panel
        setLayout(new BorderLayout());

        // create a JLabel with "Your Telephone" title
        JLabel title = new JLabel("Roger's Telephone");

        // add title label to north of this panel
        add(title, BorderLayout.NORTH);

        // create panel to hold keypad and give it a 4x3 GridLayout
        GridLayout layout = new GridLayout(4, 3);

        // add buttons representing keys to key panel
        JPanel keypanel = new JPanel(layout);

        // create buttons
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttona = new JButton("*");
        JButton button0 = new JButton("0");
        JButton buttonp = new JButton("#");

        // add buttons
        keypanel.add(button1);
        keypanel.add(button2);
        keypanel.add(button3);
        keypanel.add(button4);
        keypanel.add(button5);
        keypanel.add(button6);
        keypanel.add(button7);
        keypanel.add(button8);
        keypanel.add(button9);
        keypanel.add(buttona);
        keypanel.add(button0);
        keypanel.add(buttonp);

        // add key panel to center of this panel
        add(keypanel, BorderLayout.CENTER);

        // create a new panel for the title
        JPanel titlePanel = new JPanel();

        // add to title panel
        titlePanel.add(title);

        // add the titlePanel to the north of the panel
        add(titlePanel, BorderLayout.NORTH);

    }
}