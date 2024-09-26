import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordfieldExample_A implements ActionListener
{

	JFrame f;
	JLabel label;
	JTextField text;
	JPasswordField Value;
	JLabel L1, L2;
	JButton b;
	
	public PasswordfieldExample_A() 
	{
		f = new JFrame("Password field example");
		
		label = new JLabel();
		label.setBounds(20,150,200,50);
		
		Value = new JPasswordField();
		Value.setBounds(100,75,100,30);
		
		L1 = new JLabel("Username:");
		L1.setBounds(20,20,80,30);
		
		L2 = new JLabel("Password:");
		L2.setBounds(20,75,80,30);
		
		b = new JButton("Login");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
		
		text = new JTextField();
		text.setBounds(100,20,100,30);
		
		f.add(Value);
		f.add(label); 
		f.add(L1); 
		f.add(L2); 
		f.add(b);
		f.add(text);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String data = "Username " + text.getText();
		
		data = data + ",Password:" + new String(Value.getPassword());
		
		label.setText(data);
		
	}
	
	
	public static void main(String[] args) 
	{
		new PasswordfieldExample_A();
	}

}
