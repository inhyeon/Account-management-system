package Account;

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
		System.out.println("Account Nunber : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
}
