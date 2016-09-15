package p3;

import javax.swing.JApplet;
import java.awt.*;


public class Face extends JApplet {
    
    public void paint (Graphics page)
    {        
        page.setColor(Color.yellow);
        page.fillOval(10,10,100,100);
        
        page.setColor(Color.black);
        page.drawArc(30,35,30,20,40,100);
        page.drawArc(60,35,30,20,40,100);
        page.drawArc(55,50,20,20,130,100);
        page.drawArc(5,50,25,20,120,120);
        page.drawArc(90,50,25,20,300,120);
        
        page.setColor(Color.cyan);
        page.fillOval(40,40,10,10);
        page.fillOval(70,40,10,10);
        
        page.setColor(Color.red);
        page.fillArc(50,70,20,20,180,180);
        
    }
    
    
    
}