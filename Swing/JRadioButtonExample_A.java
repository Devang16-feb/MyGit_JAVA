import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonExample_A 
{
	JFrame f;
	JRadioButton r1, r2;
	ButtonGroup bg;
	
	public JRadioButtonExample_A() 
	{
		f = new JFrame();
		
		r1 = new JRadioButton("A] Male");
		r1.setBounds(75,50,100,30);
		
		r2 = new JRadioButton("B] Female");
		r2.setBounds(75,100,100,30);
		
		bg = new ButtonGroup();
		
		bg.add(r1);bg.add(r2);
		
		f.add(r1);f.add(r2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new JRadioButtonExample_A();
	}

}


/*
Java JRadioButton :

The JRadioButton class is used to create a radio button. 
It is used to choose one option from multiple options. 
It is widely used in exam systems or quiz.

It should be added in ButtonGroup to select one radio button only.

*/