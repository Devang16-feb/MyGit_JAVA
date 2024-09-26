import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JTohgleEx implements ItemListener
{
	JFrame f;
	JToggleButton Jb;
	
	public JTohgleEx() 
	{
		f = new JFrame("JToggleButton");
		
		Jb = new JToggleButton("Selected");
		Jb.setBounds(30,100,50,100);
		Jb.addItemListener(this);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(Jb);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(Jb.isSelected())
		{
			Jb.setText("ON");
		}
		else
		{
			Jb.setText("OFF");
		}
		}

	public static void main(String[] args) {
		
		new JTohgleEx();
	}

	


}
