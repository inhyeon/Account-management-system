package Account;

import java.util.Scanner;

public class JHbankAccounts extends Account {
	
	public void getUserInput(Scanner input) {
		
		System.out.print("Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
}
