import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane_C extends WindowAdapter
{
	JFrame f;
	
	public JOptionPane_C()
	{
		f = new JFrame();
		f.addWindowListener(this);
		
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
        f.setSize(300, 300);  
        f.setVisible(true); 
	}
	
	public void windowClosing(WindowEvent e)
	{
		int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
		
		if(a == JOptionPane.YES_OPTION)
		{
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args) 
	{
		new JOptionPane_C();
	}

}
