package listener;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.AccountInfo;
import GUI.AccountViewer;
import GUI.WindowFrame;
import GUI.InputAndExpense;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JButton b = (JButton) e.getSource();
		AccountInfo accountinfo = frame.getAccountinfo();
		frame.setupPanel(accountinfo);
	}
}