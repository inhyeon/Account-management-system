package listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Account.Account;
import Account.IHbankAccounts;
import Manager.AccountManager;

public class ButtonSaveAccount extends MouseAdapter {
	int accountNum;
	int income;
	int expense;
	
	public ButtonSaveAccount(String accountNum, String income, String expense){
		this.accountNum = Integer.parseInt(accountNum);
		this.income = Integer.parseInt(income);
		this.expense = Integer.parseInt(expense);
		System.out.println(accountNum+" "+income+" "+expense);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("zz");
		Account account = new IHbankAccounts();
		account.setAccountnum(accountNum);
		account.setIncome(income);
		account.setExpense(expense);
		AccountManager.getInstance().getList().add(account);
	}
}
