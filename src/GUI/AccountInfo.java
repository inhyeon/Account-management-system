package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountInfo extends JPanel{
	
	WindowFrame frame;
	 
	public AccountInfo(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelAccountNum = new JLabel("Account Number : ",JLabel.TRAILING);
		JTextField fieldAccountNum = new JTextField(10);
		labelAccountNum.setLabelFor(fieldAccountNum);
		panel.add(labelAccountNum);
		panel.add(fieldAccountNum);
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 2, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
