package Account;

import java.util.Scanner;

public class JBbankAccounts extends Account implements BankEvent{
	
	public void getUserInput(Scanner input) {
		System.out.print("JBbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("JBbank�� �̺�Ʈ");
		System.out.println("JB û�� ��� ���� - �ݸ� 5.5%");
	}
}
