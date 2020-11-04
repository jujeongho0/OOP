package Lab14_4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle {

	public static void main(String[] args) {
				
		JOptionPane joption = new JOptionPane();
		
		String msg = joption.showInputDialog("Enter radious");
		double inputRadious = Double.parseDouble(msg);
		
		msg = joption.showInputDialog("Enter x-coordinate");
		int inputX = Integer.parseInt(msg);
		
		msg = joption.showInputDialog("Enter y-coordinate");
		int inputY = Integer.parseInt(msg);
		
		JFrame jframe = new JFrame();
		CirclesJPanel jpanel = new CirclesJPanel(inputRadious,inputX,inputY);
		
		jframe.setTitle("Circle");
		jframe.add(jpanel);
		jframe.setSize(250,300);
		jframe.setVisible(true);		

	}

}
