package Account;
 
import java.io.Serializable;
import java.util.Scanner;

public class JBbankAccounts extends Account implements BankEvent, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6657767826676633396L;

	public void getUserInput(Scanner input) {
		System.out.print("JBbank Account number : ");
		int accountnum  = input.nextInt();
		this.setAccountnum(accountnum);
	} 
	
	public void printInfo() {
		System.out.println("Account Number : " + accountnum + " Income : " + income + " Expense : " + expense);
	} 
	
	public void bankEvent() {
		System.out.println("JBbank의 이벤트");
		System.out.println("JB 청년 희망 적금 - 금리 5.5%");
	} 
}
