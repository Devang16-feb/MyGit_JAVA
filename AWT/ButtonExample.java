import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {
	
	public ButtonExample() 
	{
		JFrame f=new JFrame("Button Example");            
		JButton b=new JButton(new ImageIcon("download-button.png"));
		
		b.setBounds(100,100,100,40);
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ButtonExample();

	}

}
