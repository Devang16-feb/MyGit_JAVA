import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class labelex extends Frame implements ActionListener 
{
	JTextField tf;
	JLabel L;
	JButton b;
	JFrame F;
	
	public labelex() 
	{
		F = new JFrame("Welcome to Webpage>>>");
		
		tf = new JTextField();
		tf.setBounds(150,50,150,20);
		
		L = new JLabel();
		L.setBounds(50,100,250,30);
		
		b = new JButton("Proceed");
		b.setBounds(100,150,250,20);
		
		b.addActionListener(this);
		
		F.add(b);
		F.add(tf);
		F.add(L);
		
        F.setSize(400,400);  
    	F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setLayout(null);
		F.setSize(500,500);
		F.setVisible(true);
       
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try 
		{
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			
			L.setText("IP of "+host+" is: "+ip);
		} catch (Exception e2)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		new labelex();

	}

}
