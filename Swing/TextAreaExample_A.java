import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaExample_A implements ActionListener
{
	JLabel L1, L2;
	JTextArea area;
	JButton b;
	
	public TextAreaExample_A() 
	{
		JFrame f = new JFrame();
		
		L1 = new JLabel();
		L1.setBounds(50,25,100,30);
		
		L2 = new JLabel();
		L2.setBounds(160,25,100,30);
		
		area = new JTextArea();
		area.setBounds(20,75,250,200);
		
		b = new JButton("Count Words");
		b.setBounds(100,300,120,30);
		b.addActionListener(this);
		
		f.add(L1);f.add(L2);f.add(area);f.add(b);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String text = area.getText();
		String Words[] = text.split("\\s");
		
		L1.setText("Words: "+Words.length);
		L2.setText("Characters: "+text.length());
		
		
	}
	
	public static void main(String[] args) 
	{
		new TextAreaExample_A();

	}



}
