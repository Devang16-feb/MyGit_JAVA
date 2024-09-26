import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class JScrollBar_A 
{
	JFrame f;
	JScrollBar s;
	
	public JScrollBar_A() 
	{
		f = new JFrame("Scrollbar Example");
		
		s = new JScrollBar();
		s.setBounds(100,100,50,100);
		
		f.add(s);
		f.setSize(400,400);  
		f.setLayout(null); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new JScrollBar_A();
	}

}
