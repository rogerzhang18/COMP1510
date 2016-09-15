package p3;

//*************************************************************
//*************************************************************
//   Colors.java
//
//Draw rectangles to illustrate colors and their codes in Java
import javax.swing.JApplet;
import java.awt.*;
public class Colors extends JApplet
{
    public void init(){
        setSize(600,400);
    }
    public void paint (Graphics page)
    {
        //Declare size constants
        final int PAGE_WIDTH = 600;
        final int PAGE_HEIGHT = 400;
        //Declare variables
        int x, y;    // x and y coordinates of upper left-corner of each shape
        int width, height; // width and height of each shape
        Color myColor = new Color (2486921);
        //Set the background color and paint the screen with a white rectangle
        setBackground (Color.white);
        page.setColor(Color.white);
        page.fillRect(0, 0, PAGE_WIDTH, PAGE_HEIGHT);
        //Set the color for the rectangle
        page.setColor (myColor);
        //Assign the corner point and width and height then draw
        x = 200;
        y = 125;
        width = 200;
        height = 150;
        page.fillRect(x, y, width, height);
        
        page.setColor (Color.black);
        int redCode=myColor.getRed();
        int greenCode=myColor.getGreen();
        int blueCode=myColor.getBlue();
        page.drawString("Red: " + redCode + " Green: " + greenCode + " Blue: " + blueCode , 200,150);
    }
}