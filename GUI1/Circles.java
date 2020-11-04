package Lab14_1;

import javax.swing.*;
import java.awt.*;

public class Circles extends JFrame {

	public static void main(String[] args) {
		
		Circles jframe = new Circles();
		CirclesJPanel jpanel = new CirclesJPanel();		
		
		jframe.setTitle("Concentric Circles");
		jframe.setSize(200,250);
		jframe.add(jpanel);		
		jframe.setVisible(true);

	}

}
