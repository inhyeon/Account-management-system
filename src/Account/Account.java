package Account;

import java.io.Serializable;
import java.util.Scanner; 

public abstract class Account implements Serializable{
	private static final long serialVersionUID = -4668407136583905226L;
	
	protected int accountnum;
	protected int income;
	protected int expense;
	
	public Account(int accountnum, AccountKind kind) {
		this.accountnum = accountnum;
	}
	
	public Account() { 
	}

	public int getAccountnum() {
		return accountnum;
	}
	
	
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	} 

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public abstract void printInfo();
	
	public void getUserInput(Scanner input) {
		System.out.print("Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
}
