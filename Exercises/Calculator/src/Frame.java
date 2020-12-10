import java.awt.Color; 
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//contains objects of all the other object classes
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private TextPanel inputPanel;
	private HisPanel calcPanel;
	private JLabel title;
	private Buttons buttonPanel;
	
	public Frame() {
		setLayout(null);
		
		inputPanel = new TextPanel();
		inputPanel.setFont(new Font("Arial", Font.PLAIN, 13));			
		inputPanel.setBackground(new Color(238,238,238));
		inputPanel.setForeground(Color.BLACK);
		inputPanel.setBounds(6, 75, 359, 65);
		add(inputPanel);
		
		calcPanel = new HisPanel();
		calcPanel.setFont(new Font("Arial", Font.PLAIN, 13));			
		calcPanel.setBackground(new Color(238,238,238));
		calcPanel.setForeground(Color.BLACK);
		calcPanel.setBounds(6, 55, 359, 30);
		add(calcPanel);
		
		
		title = new JLabel("CALCULATOR");
		title.setFont(new Font("Arial", Font.BOLD, 16));
		title.setBounds(130, 14, 263, 40);
		add(title);
		
		buttonPanel = new Buttons();
		buttonPanel.setBounds(10, 150, 359, 231);
		add(buttonPanel);
	}
}
