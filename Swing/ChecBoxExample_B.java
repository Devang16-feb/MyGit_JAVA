
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChecBoxExample_B implements ItemListener
{
	JFrame f;
	JLabel label;
	JCheckBox Ch1,Ch2;
	
	public ChecBoxExample_B() 
	{
		f = new JFrame("CheckBox Exapmle");
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		
		Ch1 = new JCheckBox("C++");
		Ch1.setBounds(150,100,50,50);
		Ch1.addItemListener(this);
		
		Ch2 = new JCheckBox("Java");
		Ch2.setBounds(150,150,50,50);
		Ch1.addItemListener(this);
		
		f.add(Ch1);f.add(Ch2);f.add(label);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);	
		
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getStateChange() == 1)
		{
			label.setText("Java Checkbox :"+"checked");
		}
		else
		{
			label.setText("Java Checkbox :"+"unchecked");
		}
	}
	
	public static void main(String[] args) 
	{
		new ChecBoxExample_B();
	}

}
