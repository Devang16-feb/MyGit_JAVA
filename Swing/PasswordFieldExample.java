import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordFieldExample 
{

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Password Field Example");
		
		JPasswordField Value = new JPasswordField();
		Value.setBounds(100,100,100,30);
		
		JLabel L1 = new JLabel("Password:");
		L1.setBounds(20,100,80,30);
		
		f.add(Value);
		f.add(L1);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);


	}

}
