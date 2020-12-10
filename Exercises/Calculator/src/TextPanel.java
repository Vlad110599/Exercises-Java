import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel implements KeyListener {

	private static JTextField inputText;
	private Font font = new Font("Arial", Font.BOLD, 30);
	
	public TextPanel() {
		inputText = new JTextField(12);
		inputText.setHorizontalAlignment(JTextField.RIGHT);
		inputText.setFont(font);
		inputText.setBounds(6, 55, 359, 65);
		
		add(inputText);

		inputText.addKeyListener(this);

	}
	
	
	public static JTextField getText() {
		return inputText;
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
