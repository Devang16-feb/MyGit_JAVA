import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample_A 
{
	JFrame f;
	JCheckBox Cbox1, Cbox2;
	
	public CheckBoxExample_A() 
	{
		f = new JFrame("CheckBox Example");
		
		Cbox1 = new JCheckBox("C++");
		Cbox1.setBounds(100,100,50,50);
		
		Cbox2 = new JCheckBox("Java");
		Cbox2.setBounds(100,150,50,50);
		
		f.add(Cbox1);
		f.add(Cbox2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new CheckBoxExample_A();

	}

}


/*Java JCheckBox :
 
The JCheckBox class is used to create a checkbox. 
It is used to turn an option on (true) or off (false). 
Clicking on a CheckBox changes its state from "on" to "off" or from "off" to "on ".
It inherits JToggleButton class

*/
