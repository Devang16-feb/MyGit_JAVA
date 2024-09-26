import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelExample {

	public static void main(String[] args) {
		JFrame f = new JFrame("Label Example");
		
		JLabel label = new JLabel("Hello I am Devang!!");
		label.setBounds(50, 50, 100, 30);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(label);

	}

}
