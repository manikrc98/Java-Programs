// To design a logo using graphics class
// Any Six functions from graphics class
// Passing Parameters to applets
// Extra -- Clock with thread
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.text.*;  

public class appletLogo extends Applet implements Runnable
{
        Thread t = null;  
        int hours=0, minutes=0, seconds=0;  
        String timeString = ""; 
        public void start() 
        {  
                t = new Thread( this );  
                t.start();  
        }  
        public void run() {  
                try {  
                   while (true) {  
            
                        Calendar cal = Calendar.getInstance(); 
                        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                        Date date = cal.getTime();  
                        timeString = formatter.format( date );  

                      repaint();  
                      t.sleep( 1000 );  // interval  
                   }  
                }  
                catch (Exception e) { }  
         }  

	public void paint(Graphics g) 
	{
        Font bigFont;
        Color twitterBlue = new Color(40, 169, 224);
        g.setColor(twitterBlue);
        g.fillOval(200, 150, 50, 50);
        // g.drawArc(225,150,40, 10, 270, 95);
        g.fillArc(215,150,50, 20, 220, 160);
        g.fillArc(220,158,50, 25, 230, 130);
        g.fillArc(110, 140, 210, 60, 140, 140);
        g.fillArc(120, 165, 190, 60, 140, 130);
        g.fillArc(120, 190, 120, 60, 170, 110);
        g.fillArc(40, 140,210, 135, 270, 110);
        g.fillArc(70, 215, 140, 60, 240, 110);
        
        bigFont = new Font("Arial",Font.BOLD,22);
        g.setFont(bigFont);
        g.setColor(twitterBlue);
        g.fillRect(140, 70, 100,40);
        g.setColor(Color.white);
        g.drawString("Twitter",145, 100);
        g.setColor(twitterBlue);  
        g.drawString( timeString, 130, 320 );  
	}
}
/* 
<applet code="appletLogo.class" width="400" height="400"> 
</applet> 
*/  