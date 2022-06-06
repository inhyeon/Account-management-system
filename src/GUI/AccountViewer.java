package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Account.Account;
import Manager.AccountManager;

public class AccountViewer extends JPanel{
	
	WindowFrame frame;
	AccountManager accountmanager;
	
	public AccountViewer(WindowFrame frame,AccountManager accountmanager) {
		
		this.frame = frame;
		this.accountmanager = accountmanager;

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Account Number");
		model.addColumn("Money Input");
		model.addColumn("Money Expense");
		model.addColumn("Contact Info");
		
		for(int i = 0; i< accountmanager.size();i++) {
			Vector row = new Vector();
			Account a = accountmanager.get(i);
			row.add(a.getAccountnum());
			row.add(a.getIncome());
			row.add(a.getExpense());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		
	}
}
