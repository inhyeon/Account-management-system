
public class Account {
	
	int accountnum;
	int income;
	int expense;
	
	public Account() {		
	}
	
	public Account(int accountnum, int total, int income, int expense) {
		this.accountnum = accountnum;
		this.income = income;
		this.expense = expense;
	}
	
	public void printInfo() {
		System.out.println("Account Nunber : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
}
