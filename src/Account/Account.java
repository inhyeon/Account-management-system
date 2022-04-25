package Account;

import java.util.Scanner;

public class Account {
	protected AccountKind kind = AccountKind.IHbank;
	protected int accountnum;
	protected int income;
	protected int expense;
	
	public AccountKind getKind() {
		return kind;
	}

	public void setKind(AccountKind kind) {
		this.kind = kind;
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

	public Account() {		
	}
	
	public Account(int accountnum) {
		this.accountnum = accountnum;
		this.income = income;
		this.expense = expense;
	}
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	}
	
	public void getUserIncome(Scanner input) {
		System.out.println("Income : ");
		int income = input.nextInt();
		this.setIncome(income);
	}
	
	public void getUserExpense(Scanner input) {
		System.out.println("Expense : ");
		int expense = input.nextInt();
		this.setExpense(expense);
	}
}
