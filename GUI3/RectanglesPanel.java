package Lab14_3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class RectanglesPanel extends JPanel {

	public void paintComponent(Graphics g)
	{
	 super.paintComponent(g);
	 Graphics2D g2 = (Graphics2D)g;
	 int x=150, y=150; // coordinates of upper-left vertex of central rectangle
	 int length=50; int width=30;// width and height of central rectangle
	   for(int i=1;i<=10;i++)
	  {
			
		Rectangle2D r = new Rectangle2D.Double(x-(10*i),y-(10*i),length+(20*i),width+(20*i));
		g2.draw(r);
		
	  }
	
  }
}
