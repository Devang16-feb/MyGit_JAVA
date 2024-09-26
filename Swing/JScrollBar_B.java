import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollBar_B extends Frame implements AdjustmentListener
{
	JFrame f;
	JLabel label;
	JScrollBar s;
	
	public JScrollBar_B() 
	{
		f = new JFrame("ScrollBar Example");
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		
		s = new JScrollBar();
		s.setBounds(100,100,50,100);
		s.addAdjustmentListener(this); // Adjecement EVENT 
		
		f.add(s);
		f.add(label);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
		
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
	     label.setText("Vertical Scrollbar value is:"+ s.getValue());  
	}
	
	public static void main(String[] args) 
	{
		new JScrollBar_B();
	}




}
