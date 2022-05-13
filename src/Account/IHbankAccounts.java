package Account;

import java.util.Scanner;

public class IHbankAccounts extends Account implements BankEvent{
	
	public void getUserInput(Scanner input) {
		System.out.print("IHbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	}
	
	public void bankEvent() {
		System.out.println("IHbank의 이벤트");
		System.out.println("IH 특별 적금 - 금리 4.5%");
	}
} 