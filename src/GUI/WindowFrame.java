package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.AccountManager;


public class WindowFrame extends JFrame{

	AccountManager accountmanager;
	MenuSelection menuselection;
	AccountInfo accountinfo;
	AccountViewer accountviewer;
	InputAndExpense inputandexpense;
	
	public WindowFrame(AccountManager accountmanager) {
		this.accountmanager = accountmanager;
		this.menuselection = new MenuSelection(this);
		this.accountinfo = new AccountInfo(this);
		this.accountviewer = new AccountViewer(this, this.accountmanager);
		this.inputandexpense = new InputAndExpense(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public AccountInfo getAccountinfo() {
		return accountinfo;
	}

	public void setAccountinfo(AccountInfo accountinfo) {
		this.accountinfo = accountinfo;
	}

	public AccountViewer getAccountviewer() {
		return accountviewer;
	}

	public void setAccountviewer(AccountViewer accountviewer) {
		this.accountviewer = accountviewer;
	}
	public InputAndExpense getInputandexpense() {
		return inputandexpense;
	}

	public void setInputandexpense(InputAndExpense inputandexpense) {
		this.inputandexpense = inputandexpense;
	}
}