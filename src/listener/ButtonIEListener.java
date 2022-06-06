package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.AccountInfo;
import GUI.InputAndExpense;
import GUI.WindowFrame;

public class ButtonIEListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonIEListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		InputAndExpense inputandexpense = frame.getInputandexpense();
		frame.setupPanel(inputandexpense);
 
	}
}
