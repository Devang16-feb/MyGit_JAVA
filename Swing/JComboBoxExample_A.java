import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExample_A 
{
	JFrame f;
	JComboBox<String> cb;
	
	public JComboBoxExample_A() 
	{
		f = new JFrame("ComboBox Example");
		
		String Country[] = {"India","Aus","U.S.A","England","Newzealand"};   
		
		cb = new JComboBox<String>(Country);
		cb.setBounds(50,50,90,20);
		
		f.add(cb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new JComboBoxExample_A();
	}

}


/*
Java JComboBox :

The object of Choice class is used to show popup menu of choices. 
Choice selected by user is shown on the top of a menu. 
It inherits JComponent class.

*/