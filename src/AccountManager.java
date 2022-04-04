import java.util.Scanner;

public class AccountManager {
	Account account;
	Scanner input;
	
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void CreateAccount() {
		account = new Account();
		System.out.print("New account number is : ");
		account.accountnum  = input.nextInt();
		System.out.println();
	}
	
	public void DeleteAccount() {
		System.out.print("Account Number : ");
		int accountnum = input.nextInt();
		if (account == null) {
			System.out.println("My account has not been registered");
			System.out.println();
			return;
		}
		if (account.accountnum == accountnum) {
			account = null;
			System.out.println("My account is deleted");
			System.out.println();
		}
		
	}
	
	public void Income() {
		System.out.printf("Income : ");
		int income = input.nextInt();
	}
	
	public void Expense() {
		System.out.printf("expense : ");
		int expense = input.nextInt();
	}

}
