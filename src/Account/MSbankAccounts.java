package Account;

import java.util.Scanner;

public class MSbankAccounts extends Account implements BankEvent{

	public void getUserInput(Scanner input) {
		System.out.print("MSbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	}
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("MSbank�� �̺�Ʈ");
		System.out.println("MS ���� ���� - �ݸ� 4.5%");
	} 
}
 