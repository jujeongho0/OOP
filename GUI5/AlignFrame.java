package Lab15_1;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignFrame extends JFrame {
	
	      private JPanel panel1;
	      private JPanel panel2;
	      private JPanel panel3;
	      private JPanel panel4; 
	      private JPanel panel5;
	
	public AlignFrame()
	   {
	      super("Align");	      
	     
	      panel1 = new JPanel();
	      panel1.setLayout(new GridLayout(2,1));	      
	      JCheckBox check1 = new JCheckBox("Snap to Grid");
	      JCheckBox check2 = new JCheckBox("Show Grid");	      
	      panel1.add(check1);
	      panel1.add(check2);
	      
	      panel2 = new JPanel();
	      panel2.setLayout(new FlowLayout());
	      JLabel label1 = new JLabel("X:");
	      JTextField textfield1 = new JTextField("8");
	      panel2.add(label1);
	      panel2.add(textfield1);
	      
	      panel3 = new JPanel();
	      panel3.setLayout(new FlowLayout());
	      JLabel label2 = new JLabel("Y:");
	      JTextField textfield2 = new JTextField("8");
	      panel3.add(label2);
	      panel3.add(textfield2);
	      
                  panel4 = new JPanel(); 
	      panel4.setLayout(new BorderLayout());
	      panel4.add(panel2,BorderLayout.NORTH);
	      panel4.add(panel3,BorderLayout.SOUTH);

 	      panel5 = new JPanel();	      
	      panel5.setLayout(new GridLayout(3,1,10,5));
	      JButton button1 = new JButton("OK");
	      JButton button2 = new JButton("Cancel");
	      JButton button3 = new JButton("Help");
	      panel5.add(button1);
	      panel5.add(button2);
	      panel5.add(button3);
	      
	      this.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
	      this.add(panel1);
	      this.add(panel4);
	      this.add(panel5);      
	   }
}
