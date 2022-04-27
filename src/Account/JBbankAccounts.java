package Account;

import java.util.Scanner;

public class JBbankAccounts extends Account {
	
	public void getUserInput(Scanner input) {
		System.out.print("JBbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
}
