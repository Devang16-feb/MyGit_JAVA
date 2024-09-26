// Used to create Dialog Box

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane_A 
{
	JFrame f;
	
	public JOptionPane_A()
	{
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Hello, welcome to javaPoint.");
	}
	public static void main(String[] args) 
	{
		new JOptionPane_A();
	}

}
