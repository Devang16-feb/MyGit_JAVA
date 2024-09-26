import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.crypto.Data;

public class JComboBoxExample_B implements ActionListener
{
	JFrame f;
	JLabel label;
	JButton b;
	JComboBox<String> cb;
	
	public JComboBoxExample_B() 
	{
		f = new JFrame("ComboBox Example");
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		
		b = new JButton("Show");
		b.setBounds(200,100,75,20);
		b.addActionListener(this);
		
		String Languges[] = {"C","C++","C#","Java","PHP"};
		
		cb = new JComboBox<String>(Languges);
		cb.setBounds(50,100,90,20);
		
		f.add(cb);f.add(label);f.add(b);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String  data = cb.getItemAt(cb.getSelectedIndex());

		label.setText("Programming language Selected: "+data);
	}
	
	
	public static void main(String[] args) 
	{
		new JComboBoxExample_B();
	}


}
