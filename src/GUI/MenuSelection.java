package GUI;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonExit;
import listener.ButtonIEListener;
import listener.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Create Accounts");
		JButton button2 = new JButton("Delete Accounts");
		JButton button3 = new JButton("Input Income And Expense");
		JButton button4 = new JButton("Edit Accounts");
		JButton button5 = new JButton("View Accounts");
		JButton button6 = new JButton("View Bank Events");
		JButton button7 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));
		button3.addActionListener(new ButtonIEListener(frame));
		button5.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		button7.addMouseListener(new ButtonExit(frame));
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}
}
