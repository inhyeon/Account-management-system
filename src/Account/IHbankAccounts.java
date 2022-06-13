package Account; 

import java.io.Serializable;
import java.util.Scanner;

public class IHbankAccounts extends Account implements BankEvent, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6740928092007334693L;

	public void getUserInput(Scanner input) {
		System.out.print("IHbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
	
	public void getUserInput(int accountNum, int income, int expense) {
		this.setAccountnum(accountNum);
		this.setExpense(expense);
		this.setIncome(income);
	}
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("IHbank의 이벤트");
		System.out.println("IH 특별 적금 - 금리 4.5%");
	}
}  