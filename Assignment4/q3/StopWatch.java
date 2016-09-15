package q3;

import javax.swing.JFrame;

/**
 * <p>
 * Stop Watch program that works as a stop-watch where you can start the timer,
 * stop the timer or reset the timer. Including a display that shows minute,
 * second and 1/10 of a second.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class StopWatch {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        JFrame circlesFrame = new JFrame("Roger's StopWatch");
        circlesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        circlesFrame.getContentPane().add(new StopWatchPanel());
        circlesFrame.pack();
        circlesFrame.setVisible(true);

        System.out.println("Question three was called and ran sucessfully.");
    }

};
