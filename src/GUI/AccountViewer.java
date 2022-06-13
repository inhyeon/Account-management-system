package GUI;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Account.Account;
import Manager.AccountManager;

public class AccountViewer extends JPanel{
	
	WindowFrame frame;
	AccountManager accountmanager;
	DefaultTableModel model = new DefaultTableModel();
	
	public AccountViewer(WindowFrame frame,AccountManager accountmanager) {
		
		this.frame = frame;
		this.accountmanager = accountmanager;

		model.addColumn("Account Number");
		model.addColumn("Money Input");
		model.addColumn("Money Expense");
		model.addColumn("Contact Info");
		freshTable();
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}
	public void freshTable() {
		for(int i = 0; i< accountmanager.size();i++) {
			Vector row = new Vector();
			Account a = accountmanager.get(i);
			row.add(a.getAccountnum());
			row.add(a.getIncome());
			row.add(a.getExpense());
			model.addRow(row);
		}
	}
}
