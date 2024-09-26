import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Swapp implements ActionListener
{
	Frame f;
	TextField tx1, tx2;
	Button b;
	
	public Swapp()
	{
		f = new Frame();
		
		tx1 = new TextField();
		tx1.setBounds(50,100, 150,20);
		
		tx2 = new TextField();
		tx2.setBounds(50,150, 150,20);
		
		b = new Button("Swap");
		b.setBounds(80,200,70,70);
		b.addActionListener(this);
		

		f.setVisible(true);
		f.setLayout(null);
		f.setSize(500,500);
		((JFrame) f).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(tx1);f.add(tx2);
		f.add(b);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String t1 = tx1.getText();
		String t2 = tx2.getText();
		
		tx1.setText(t2);
		tx2.setText(t1);
		
	}
	
	public static void main(String[] args) 
	{
		new Swapp();

	}

}
