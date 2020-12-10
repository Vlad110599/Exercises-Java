import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel implements ActionListener {

	
	private static String buttonText[] = {"CE", "C", "\u232B", "/", 
			"7", "8", "9", "x", 
			"4", "5", "6", "-", 
			"1", "2", "3", "+",
			".", "+/-", "0", "=" };
	
	private static JButton button [] = new JButton[buttonText.length];
	private Font font = new Font("", Font.PLAIN, 12);
	private int count = 0;
	
	private double secondNr = 0;
	private double firstNr = 0;
	private static double c,a;
	private String operation = "";
	private double result = 0;
	private String output = "";
	
	
	public Buttons() {
		
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(buttonText[i]);
			button[i].setFont(new Font("", Font.PLAIN, 12));
		}
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.PAGE_START;
		c.fill = GridBagConstraints.BOTH;
		c.weightx = .20;
		c.weighty = .20;
		c.insets = new Insets(1, 2, 1, 2);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				c.gridx = j;
				c.gridy = i;

				add(button[count++], c);
			}
		}
		
		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}
	}
	
	protected static JButton getButton(int i) {
		return button[i];
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button[0]) {
			String input = TextPanel.getText().getText();
			if (input != null && input.length() > 0) {
				TextPanel.getText().setText("");
				Buttons.c = 0;
				Buttons.a =0;

			}

		}
		if (e.getSource() == button[1]) {
			String input = TextPanel.getText().getText();
			if (input != null && input.length() > 0) {
				TextPanel.getText().setText("");
				HisPanel.getText().setText(" ");
				Buttons.c = 0;
				Buttons.a =0;
				secondNr = 0;
				firstNr = 0;
				
			}
			HisPanel.getText().setText("");
	
		}
		
		if (e.getSource() == button[2]) {
			String input = TextPanel.getText().getText();
			if (input != null && input.length() > 0) {
				TextPanel.getText().setText(input.substring(0, input.length() - 1));
			}
		}

		if (e.getSource() == button[3]) {
			String input = TextPanel.getText().getText();
			firstNr = Double.parseDouble(input);
			HisPanel.getText().setText(input+"/");
			TextPanel.getText().setText("");
			Buttons.c =0;
			Buttons.a =0;
			secondNr = 0;
			operation = "/";
		}
		
		
		if (e.getSource() == button[4]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "7");
		}
		if (e.getSource() == button[5]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "8");
		}
		if (e.getSource() == button[6]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "9");
		}
		
		if (e.getSource() == button[7]) {
			String input = TextPanel.getText().getText();
			firstNr = Double.parseDouble(input);
			HisPanel.getText().setText(input+"*");
			TextPanel.getText().setText("");
			operation = "*";
			Buttons.c =0;
			Buttons.a =0;
			secondNr = 0;
		}
		
		if (e.getSource() == button[8]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "4");
		}
		if (e.getSource() == button[9]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "5");
		}
		if (e.getSource() == button[10]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "6");
		}
		if (e.getSource() == button[11]) {
			String input = TextPanel.getText().getText();
			firstNr = Double.parseDouble(input);
			HisPanel.getText().setText(input+"-");
			TextPanel.getText().setText("");
			Buttons.c =0;
			Buttons.a =0;
			secondNr = 0;
			operation = "-";
		}
		
		if (e.getSource() == button[12]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "1");
		}
		if (e.getSource() == button[13]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "2");
		}
		if (e.getSource() == button[14]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "3");
		}
		if (e.getSource() == button[15]) {
			String input = TextPanel.getText().getText();
			String calc = HisPanel.getText().getText();
			firstNr = Double.parseDouble(input);
			HisPanel.getText().setText(input+"+");
			TextPanel.getText().setText("");
			Buttons.c =0;
			Buttons.a =0;
			secondNr = 0;
			operation = "+";
		}
		
	   if (e.getSource() == button[16]) {
			String input = TextPanel.getText().getText();
				TextPanel.getText().setText(input + ".");	
		}
		if (e.getSource() == button[17]) {
			String input = TextPanel.getText().getText();
			if(Double.parseDouble(input)>0) {
			TextPanel.getText().setText("-"+input);
		}else {
			double s = Double.parseDouble(input) * (-1);
			input = Double.toString(s);
			TextPanel.getText().setText(input);
		}
	}
		if (e.getSource() == button[18]) {
			String input = TextPanel.getText().getText();
			TextPanel.getText().setText(input + "0");
		}
		
		if (e.getSource() == button[19]) {
			if (operation == "/") {
				double t = 0;
				t = secondNr;
				String input = TextPanel.getText().getText();
				secondNr = Double.parseDouble(input);
				if(secondNr == 0) {
					result = 0;
					output = "Infinit";
				}
				else if(t == 0) {
					Buttons.c = secondNr;
					result  = firstNr / secondNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"/"+Double.toString(secondNr));
					output = Double.toString(result);
				}
				else {
					result  = secondNr/c;
					HisPanel.getText().setText(Double.toString(secondNr)+"/"+Double.toString(c));
					output = Double.toString(result);
				}
				TextPanel.getText().setText(output);
			} 

			else if (operation == "*") {
				double b = 0;
				b = secondNr;
				String input = TextPanel.getText().getText();
				secondNr = Double.parseDouble(input);
				if(b == 0)
				{
				   Buttons.c = secondNr;
				   result = firstNr * secondNr;
				   output = Double.toString(result);
				   HisPanel.getText().setText(Double.toString(firstNr)+"*"+Double.toString(secondNr));
				}
				else {
					result = secondNr*c;
					HisPanel.getText().setText(Double.toString(secondNr)+"*"+Double.toString(c));
				    output = Double.toString(result);
				}
				TextPanel.getText().setText(output);
			}  

			else if (operation == "-") {
				double te = 0;
				te = secondNr;
				String input = TextPanel.getText().getText();
				secondNr = Double.parseDouble(input);
				if(firstNr == 0 && te == 0) {
					Buttons.c = secondNr;
					result = - secondNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"-"+Double.toString(c));
					output = Double.toString(result);
				}
				else if(te == 0 && Buttons.a == 0 && firstNr != 0) {
					Buttons.c = secondNr;
					result = firstNr-secondNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"-"+Double.toString(secondNr));
				    output = Double.toString(result);
				 }
			    else if(Buttons.c == 0){
				result = firstNr;
				HisPanel.getText().setText(Double.toString(firstNr)+"-"+Double.toString(c));
				output = Double.toString(result);
			    }
				else{
					result = secondNr-c;
					HisPanel.getText().setText(Double.toString(secondNr)+"-"+Double.toString(c));
				    output = Double.toString(result);
				}
				Buttons.a = firstNr;
				TextPanel.getText().setText(output);
			} 

			else if (operation == "+") {
				
				double t = 0;
				t = secondNr;
				String input = TextPanel.getText().getText();
				secondNr = Double.parseDouble(input);
				if(firstNr == 0 && t == 0) {
					Buttons.c = secondNr;
					result = secondNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"+"+Double.toString(c));
					output = Double.toString(result);
				}
				else if(t == 0 && firstNr != 0 && Buttons.a == 0) {
					Buttons.c = secondNr;
					result = firstNr + secondNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"+"+Double.toString(c));
					output = Double.toString(result);		
				}else if(Buttons.c == 0){
					result = firstNr;
					HisPanel.getText().setText(Double.toString(firstNr)+"+"+Double.toString(c));
					output = Double.toString(result);
				}else {
					result = secondNr + c;
					HisPanel.getText().setText(Double.toString(secondNr)+"+"+Double.toString(c));
					output = Double.toString(result);
				}
		        Buttons.a = firstNr;
				TextPanel.getText().setText(output);
			}
		
	}

}
}
