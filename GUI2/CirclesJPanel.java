package Lab14_2;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CirclesJPanel extends JPanel {
	 public void paintComponent(Graphics g)
	   {
	      super.paintComponent(g);
	      Graphics2D g2 = (Graphics2D) g;
	      
	      for (int i = 0; i < 80; i += 10) 
	      {	        
	     	  int x= i+30; 
	          int y= i+30;	         
	          int w= 160-(i*2);
	          int h= 160-(i*2);        
	        
	          Ellipse2D e = new Ellipse2D.Double(x,y,w,h);
	          g2.draw(e);	        
	      } 	      
	   }
}
