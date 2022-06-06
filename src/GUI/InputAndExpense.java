package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class InputAndExpense extends JPanel{
	
	WindowFrame frame;
	 
	public InputAndExpense(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelInput = new JLabel("Money Input : ",JLabel.TRAILING);
		JTextField fieldInput = new JTextField(10);
		labelInput.setLabelFor(fieldInput);
		panel.add(labelInput);
		panel.add(fieldInput);
		
		JLabel labelExpense = new JLabel("Money Expense : ",JLabel.TRAILING);
		JTextField fieldExpense = new JTextField(10);
		labelExpense.setLabelFor(fieldExpense);
		panel.add(labelExpense);
		panel.add(fieldExpense);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 3, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}