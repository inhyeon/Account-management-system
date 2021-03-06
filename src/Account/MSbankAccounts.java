package Account;

import java.io.Serializable;
import java.util.Scanner;

public class MSbankAccounts extends Account implements BankEvent, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1235910911906382405L;

	public void getUserInput(Scanner input) {
		System.out.print("MSbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	}
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("MSbank의 이벤트");
		System.out.println("MS 은행 적금 - 금리 4.5%");
	}  
}
 