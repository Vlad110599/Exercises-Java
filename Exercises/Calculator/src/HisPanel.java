import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class HisPanel extends JPanel{
	
	private static JTextField calcText;
	private Font font = new Font("Arial", Font.BOLD, 14);
	
	public HisPanel() {
		calcText = new JTextField(26);
		calcText.setHorizontalAlignment(JTextField.RIGHT);
		calcText.setFont(font);
		calcText.setBounds(6, 55, 359, 65);
		
		add(calcText);

		//inputText.addKeyListener(this);

	}
	
	
	public static JTextField getText() {
		return calcText;
	}

}
