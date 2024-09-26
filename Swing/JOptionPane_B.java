import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPane_B 
{
	JFrame f;
	
	public JOptionPane_B()
	{
		f = new JFrame();
		
		String name = JOptionPane.showInputDialog(f,"Enter Name");
	}
	public static void main(String[] args) 
	{
		new JOptionPane_B();
	}

}
