package Lab14_2;

import javax.swing.JFrame;

public class Concentric extends JFrame {

	public static void main(String[] args) {
		Concentric jframe = new Concentric();
		CirclesJPanel jpanel = new CirclesJPanel();		
		
		jframe.setTitle("Concentric Circles");
		jframe.setSize(250,250);
		jframe.add(jpanel);		
		jframe.setVisible(true);

	}

}
