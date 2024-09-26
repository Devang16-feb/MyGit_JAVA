import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaE 
{
	JFrame f;
	JTextArea Area;
	
	public TextAreaE() 
	{
		f = new JFrame();
		
		Area = new JTextArea("welcom to javapoint");
		Area.setBounds(10,30,500,500);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(Area);
	}
	public static void main(String[] args) 
	{
		new TextAreaE();

	}

}
