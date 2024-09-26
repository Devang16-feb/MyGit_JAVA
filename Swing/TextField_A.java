import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField_A implements ActionListener
{
	
	JTextField tf1,tf2,tf3;
	JButton b1, b2;
	
	public TextField_A() 
	{
		JFrame f = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(50,50,150,20);
		
		tf2 = new JTextField();
		tf2.setBounds(50,100,150,20);
		
		tf3 = new JTextField();
		tf3.setBounds(50,150,150,20);
		
		b1 = new JButton("+");
		b1.setBounds(50,200,50,50);
		b1.addActionListener(this);
		
		b2 = new JButton("-");
		b2.setBounds(150,200,50,50);
		b2.addActionListener(this);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		int c = 0;
		
		if(e.getSource() == b1)
		{
			c = a + b;
		}
		else
		{
			c = a - b;
		}
		
		String Result = String.valueOf(c);
		tf3.setText(Result);
		
	}
	

	public static void main(String[] args) 
	{
		new TextField_A();
	}

}
