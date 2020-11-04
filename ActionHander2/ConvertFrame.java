package Lab15_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConvertFrame extends JFrame {
   
   private JTextField textfield;
   private JLabel label1;
   private JLabel label2;
   
   public ConvertFrame()
      {
         super("Temperature converter");
         
         this.setLayout(new BorderLayout());
         
         label1 = new JLabel("Enter Fahrenheit temperature:");
         this.add(label1,BorderLayout.NORTH);
         
         textfield = new JTextField(10);
         this.add(textfield,BorderLayout.CENTER);      
         
         
         label2 = new JLabel("Temperature in Celsius is:");
         this.add(label2,BorderLayout.SOUTH);
                  
         TextFieldHandler handler = new TextFieldHandler();
         textfield.addActionListener(handler);                 
      }    
      
   private class TextFieldHandler implements ActionListener
   {     
      public void actionPerformed(ActionEvent e)
      {         
         if(e.getSource() == textfield)
         {        	 
        	 String string = e.getActionCommand();
        	 double fahrenheit = Double.parseDouble(string);
             double celsius = (fahrenheit-32)*5/9;
             JOptionPane.showMessageDialog(null, celsius);             
         }        
      }      
   }     
}