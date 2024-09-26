import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	public MyFrame() 
	{
		this.setTitle("Welcome to JFrame.....");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application
		this.setResizable(true); //prevent this from resized
		this.setSize(420,420); // Sets X dimension and Y dimensions
		this.setVisible(true); // Main Frame Visible
		
		ImageIcon image = new ImageIcon("Devang_Logo.png"); // Create an Image Icon
		this.setIconImage(image.getImage()); //Change Icon of Frame
        this.getContentPane().setBackground(new Color(123,50,250));// Change Color of Bagraound
	    // We Set it by RGB vlaue new Color(0,0,255) for Blue
	}
}
