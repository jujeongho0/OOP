package Lab14_3;

import javax.swing.JFrame;

public class DrawRectangles {

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		RectanglesPanel jpanel = new RectanglesPanel();
		
		jframe.setTitle("Nested Rectangles");
		jframe.setSize(400,400);
		jframe.add(jpanel);
		jframe.setVisible(true);

	}

}
