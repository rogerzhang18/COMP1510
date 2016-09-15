package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

/**
 * <p>
 * A graphics application that draws a business card of Yongjian Zhang.
 * </p>
 *
 * @author Zhang,Yongjian,SetA
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    
    /**
     * add the serialversionUID.
     */
    public static final long serialVersionUID = 1L;
    
    /**
     * sets the background color.
     */
    public static final Color BGCOLOR = new Color(208, 190, 212);

    /**
     * sets the header color.
     */
    public static final Color HDCOLOR = new Color(0, 80, 250);

    /**
     * sets the font color.
     */
    public static final Color FONTCOLOR = new Color(0, 0, 0);

    /**
     * sets the name color.
     */
    public static final Color NAMECOLOR = new Color(80, 1, 160);

    /**
     * sets the arc color.
     */
    public static final Color ARCCOLOR = new Color(233, 87, 93);

    /**
     * <p>
     * The x position of the text.
     * </p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>
     * The y position of the text.
     * </p>
     */
    private static final int Y_POSITION = 20;

    /**
     * initialize the frame width.
     */
    private static final int X_FRAME = 350;

    /**
     * initialize the frame height.
     */
    private static final int Y_FRAME = 220;

    /**
     * <p>
     * The x position of the image.
     * </p>
     */
    private static final int IMG_X = 200;

    /**
     * <p>
     * The y position of the image.
     * </p>
     */
    private static final int IMG_Y = 0;

    /**
     * <p>
     * The address font size.
     * </p>
     */
    private static final int ADD_SIZE = 12;

    /**
     * <p>
     * The name font size.
     * </p>
     */
    private static final int NAME_SIZE = 13;

    /**
     * <p>
     * The information font size.
     * </p>
     */
    private static final int INFO_SIZE = 11;

    /**
     * <p>
     * The x position of the address string.
     * </p>
     */
    private static final int ADD_X = 20;

    /**
     * <p>
     * The y position of the address string.
     * </p>
     */
    private static final int ADD_Y = 40;

    /**
     * <p>
     * The x position of the name string.
     * </p>
     */
    private static final int NM_X = 5;

    /**
     * <p>
     * The y position of the name string.
     * </p>
     */
    private static final int NM_Y = 70;

    /**
     * <p>
     * The y position of the second name string.
     * </p>
     */
    private static final int NM_Y2 = 90;

    /**
     * <p>
     * The y position of the third name string.
     * </p>
     */
    private static final int NM_Y3 = 100;

    /**
     * <p>
     * The default x position.
     * </p>
     */
    private static final int DEFAULT_X = 0;

    /**
     * <p>
     * The default y position.
     * </p>
     */
    private static final int DEFAULT_Y = 0;

    /**
     * <p>
     * The hollow rectangle width.
     * </p>
     */
    private static final int REC_X = 199;

    /**
     * <p>
     * The hollow rectangle height.
     * </p>
     */
    private static final int REC_Y = 30;

    /**
     * <p>
     * The first rectangle shape x position.
     * </p>
     */
    private static final int REC1_XP = 60;

    /**
     * <p>
     * The first rectangle shape y position.
     * </p>
     */
    private static final int REC1_YP = 80;

    /**
     * <p>
     * The first rectangle shape width.
     * </p>
     */
    private static final int REC1_W = 139;

    /**
     * <p>
     * The first rectangle shape height.
     * </p>
     */
    private static final int REC1_H = 25;

    /**
     * <p>
     * The second rectangle y position.
     * </p>
     */
    private static final int REC2_YP = 153;

    /**
     * <p>
     * The second rectangle shape height.
     * </p>
     */
    private static final int REC2_H = 45;

    /**
     * <p>
     * The information string position x.
     * </p>
     */
    private static final int INFO_X = 60;

    /**
     * <p>
     * The information string position y.
     * </p>
     */
    private static final int INFO_Y = 115;

    /**
     * <p>
     * The string width.
     * </p>
     */
    private static final int STR_W = 10;

    /**
     * <p>
     * The y position of the arc.
     * </p>
     */
    private static final int ARC_YP = 173;

    /**
     * <p>
     * The arc width and height.
     * </p>
     */
    private static final int ARC_WH = 50;

    /**
     * <p>
     * The rotation degree of arc.
     * </p>
     */
    private static final int ARC_ROTATION = 180;

    /**
     * <p>
     * The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).
     * </p>
     */
    public BusinessCard() {

        super("Yongjian Zhang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        
        //sets the size of the frame
        setSize(X_FRAME, Y_FRAME);
        setVisible(true);
    }

    /**
     * <p>
     * A panel that acts as the Frame's content pane.
     * </p>
     */
    class BusinessCardPanel extends JPanel {
        
        /**
         * add the serialversionUID.
         */
        public static final long serialVersionUID = 1L;
        
        /**
         * <p>
         * An image object that can be used to paint to the panel.
         * </p>
         */
        private Image img;

        /**
         * <p>
         * The default contructor that retreives an image to draw.
         * </p>
         */
        BusinessCardPanel() {
            
            //added EA image
            img = new ImageIcon(BusinessCardPanel
                    .class.getResource("/q5/namecard.png")).getImage();
        }

        /**
         * <p>
         * Called by the environment when the frame needs to be updated.
         * </p>
         *
         * @param g
         *            the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // set background color
            setBackground(BGCOLOR);

            // set header (company name)
            g.setColor(HDCOLOR);
            g.drawString("         Electronic Arts", X_POSITION, Y_POSITION);
            
            //draws the rectangle for the header
            g.drawRect(DEFAULT_X, DEFAULT_Y, REC_X, REC_Y);

            // sets font size of address
            g.setFont(new Font("TimesRoman", Font.ITALIC, ADD_SIZE));

            // prints the address
            g.setColor(FONTCOLOR);
            g.drawString("       1223 Professional Street", ADD_X, ADD_Y);
            g.drawString("       Burnaby, B.C, V1M2M3", ADD_X, ADD_Y + STR_W);

            // sets font size of Name
            g.setFont(new Font("TimesRoman", Font.PLAIN, NAME_SIZE));

            // prints the name on the name card
            g.setColor(NAMECOLOR);
            g.drawString("Game Developer", NM_X, NM_Y);
            g.drawString("Yongjian", NM_X, NM_Y2);
            g.drawString("Zhang", NM_X, NM_Y3);

            // draws the rectangle shape with the same color as font
            g.setColor(FONTCOLOR);
            g.fillRect(REC1_XP, REC1_YP, REC1_W, REC1_H);
            g.fillRect(REC1_XP, REC2_YP, REC1_W, REC2_H);

            // sets the font for the information section
            g.setFont(new Font("TimesRoman", Font.PLAIN, INFO_SIZE));

            // prints the information
            g.drawString("Phone:(778) 316 9025", INFO_X, INFO_Y);
            g.drawString("Fax:(604)1234567", INFO_X, INFO_Y + STR_W);
            g.drawString("Email:rogeryj@gmail.com", INFO_X, INFO_Y 
                    + STR_W + STR_W);
            g.drawString("Website:www.easports.com", INFO_X, INFO_Y 
                    + STR_W + STR_W + STR_W);

            // sets the color for the arc and draws the shape
            g.setColor(ARCCOLOR);
            g.fillArc(DEFAULT_X, ARC_YP, ARC_WH, ARC_WH, 
                    DEFAULT_X, ARC_ROTATION);

            // puts in the image
            g.drawImage(img, IMG_X, IMG_Y, this);

        }
    }

    /**
     * <p>
     * The main method.
     * </p>
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // calls the constructor to draws the name card
        new BusinessCard();
    }

};
