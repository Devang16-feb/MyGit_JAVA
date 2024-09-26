import javax.swing.JFrame;
import javax.swing.JTextField;

public class textFieldE {

	public static void main(String[] args) 
	{
		JFrame f = new JFrame("TexField Exapmle");
		
		JTextField T1 = new JTextField("Welcome to the JAva Tpoint");
		T1.setBounds(50,100,200,30);
		
		JTextField T2 = new JTextField("AWT Tutorial");
		T2.setBounds(50,150,200,30);
		
		f.add(T1);
		f.add(T2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}

}
