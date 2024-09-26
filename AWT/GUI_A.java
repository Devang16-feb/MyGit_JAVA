import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI_A {

	public static void main(String[] args) {
		// JLabel = a GUI Display area for String Text, an image, or Both
        // A Label object is a component for placing text in a container
		
		ImageIcon image = new ImageIcon("programmer (1).png"); // Label ICon
		Border border = BorderFactory.createLineBorder(Color.yellow, 8);
		
		JLabel label = new JLabel();
		label.setText("Welcome to the Programming World...{ }"); // Set Text of label
		label.setIcon(image);
		
		label.setHorizontalTextPosition(JLabel.CENTER);// Set Text left ceter ,right pg image icon
		label.setVerticalTextPosition(JLabel.TOP); //Set Text top, CENTER,BOTTOM of Image icon
		label.setForeground(Color.white);
		label.setFont(new Font("MV Boli",Font.PLAIN, 50));
		label.setIconTextGap(25);//Set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // Set vertical position within icon + Text within label
	    label.setHorizontalAlignment(JLabel.CENTER); // Set Horizontal position of icon+text within labele
		label.setBounds(500,100,580,580);//will set X and Y Position within frame as well as dimention
		
		JFrame frame = new JFrame("<<<Welcome to the Page>>>>");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		
	}

}
