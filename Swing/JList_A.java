import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JList_A 
{
	JFrame f;
	
	public JList_A() 
	{
		f = new JFrame();
		
		DefaultListModel<String> l1 = new DefaultListModel<String>();
		
		l1.addElement("Item1");
		l1.addElement("Item2");
		l1.addElement("Item3");
		l1.addElement("Item4");
		
		JList<String> list = new JList<String>(l1);
		list.setBounds(100,100,75,75);
		
		f.add(list);
		
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);  
        f.setLayout(null);  
        f.setVisible(true); 
	}
	public static void main(String[] args) 
	{
		new JList_A();
	}

}
