package Account;

import java.io.Serializable;
import java.util.Scanner;

public class JHbankAccounts extends Account implements BankEvent, Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7043199056387505849L;

	public void getUserInput(Scanner input) {
		 
		System.out.print("JHbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("JHbank의 이벤트");
		System.out.println("JH 장기 적금 - 금리 5.5%");
	}
}
 