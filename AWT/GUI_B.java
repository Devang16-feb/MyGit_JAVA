import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_B {

	public static void main(String[] args) 
	{
		// Jpanel = a GUI cpmponet that function as container to hold other container to hold omponets
		
		ImageIcon icon = new ImageIcon("programmer (1).png");
		
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.orange);
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setLayout(null);
		
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.white);
		whitePanel.setBounds(250, 0, 250, 250);
		whitePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(500, 0, 250, 250);
		greenPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0, 250, 550, 500);
		bluePanel.setLayout(new BorderLayout());
		
		JFrame frame = new JFrame(); // Creates Frame
		frame.setTitle("Welcome to JFrame.....");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application
		frame.setResizable(true); //prevent frame from resizeL
		frame.setLayout(null);
		frame.setSize(750,750); // Sets X dimension and Y dimensions
		frame.setVisible(true); // Main Frame Visible
		frame.add(redpanel);
		bluePanel.add(label);
		frame.add(whitePanel);
		frame.add(greenPanel);
		frame.add(bluePanel);

	}

}
