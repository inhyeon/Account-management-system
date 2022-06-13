package GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Account.Account;
import Account.IHbankAccounts;
import Manager.AccountManager;
import Manager.MenuManager;
import listener.ButtonCancel;
import listener.ButtonSaveAccount;

public class AccountInfo extends JPanel{

	WindowFrame frame;
	AccountManager am;
	public AccountInfo(WindowFrame frame, AccountManager am) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelAccountNum = new JLabel("Account Number : ",JLabel.TRAILING);
		JLabel labelInput = new JLabel("Money Input : ",JLabel.TRAILING);
		JTextField fieldInput = new JTextField("1");
		labelInput.setLabelFor(fieldInput);
		panel.add(labelInput);
		panel.add(fieldInput);
		
		JLabel labelExpense = new JLabel("Money Expense : ",JLabel.TRAILING);
		JTextField fieldExpense = new JTextField("1");
		labelExpense.setLabelFor(fieldExpense);
		panel.add(labelExpense);
		panel.add(fieldExpense);
		
		JTextField fieldAccountNum = new JTextField("1");
		JButton save = new JButton("save");
		save.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				Account account = new IHbankAccounts();
				account.setAccountnum(Integer.parseInt(fieldAccountNum.getText()));
				account.setExpense(Integer.parseInt(fieldExpense.getText()));
				account.setIncome(Integer.parseInt(fieldInput.getText()));
				am.addToList(account);
				MenuManager.putObject(am,"accountmanager.ser");
			}
		});
		JButton cancel = new JButton("cancel");
		cancel.addMouseListener(new ButtonCancel(frame));
		
		panel.add(labelAccountNum);
		panel.add(fieldAccountNum);
		panel.add(save);
		panel.add(cancel);
			
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
