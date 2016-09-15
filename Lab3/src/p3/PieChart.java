package p3;

import javax.swing.JApplet;
import java.awt.*;


public class PieChart extends JApplet {
    
    public void init(){
        setSize(600,600);
    }
    
    public void paint (Graphics page)
    {
        final int xStart=150;
        final int yStart=150;
        final int circleLength=200;
        final int circleWidth=200;
        
        
        page.setColor(Color.pink);
        page.fillArc(xStart,yStart,circleLength,circleWidth,0,126);
        
        page.setColor(Color.gray);
        page.fillArc(xStart,yStart,circleLength,circleWidth,126,360*15/100);
        
        page.setColor(Color.orange);
        page.fillArc(xStart,yStart,circleLength,circleWidth,180,360*15/100);
        
        page.setColor(Color.cyan);
        page.fillArc(xStart,yStart,circleLength,circleWidth,234,360*25/100);
        
        page.setColor(Color.yellow);
        page.fillArc(xStart,yStart,circleLength,circleWidth,324,360*10/100);
        
        page.setColor(Color.black);
        page.drawString("Rent and Utilities 35%",220,150);
        page.drawString("Miscellaneous 10%",350,280);
        page.drawString("Educational 25%",200,360);
        page.drawString("Food 15%",85,300);
        page.drawString("Transportation 15%",45,200);

        
    }
       
}
