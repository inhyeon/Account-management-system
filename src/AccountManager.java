import java.util.*;

import Account.Account;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void CreateAccount() {
		System.out.print("Account number : ");
		int accountnum  = input.nextInt();
		Account account = new Account(accountnum);
		accounts.add(account);
		System.out.println();
	}
	
	public void DeleteAccount() {
		System.out.print("Account Number : ");
		int accountnum = input.nextInt();
		int index = -1;
		for(int i = 0 ; i < accounts.size() ; i++) {
			if (accounts.get(i).getAccountnum() == accountnum) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("Account" + accountnum + "is deleted");
		}
		else {
			System.out.println("Account has not been registered");
			return;
		}	
	}
	
	public void IncomeAndExpense() {
		System.out.printf("Income : ");
		int income = input.nextInt();
		
		System.out.printf("expense : ");
		int expense = input.nextInt();
	}
	
	public void EditAccount() {
		System.out.print("Account number : ");
		int accountnum = input.nextInt();
		for(int i = 0 ; i < accounts.size() ; i++) {
			Account account = accounts.get(i);
			if (account.getAccountnum() == accountnum) {
				int num = -1;
				while(num != 4) {
					System.out.println("** Account Info Edit Menu **");
					System.out.println(" 1. Edit Account number");
					System.out.println(" 2. Edit Income");
					System.out.println(" 3. Edit Ecpense");
					System.out.println(" 4. Exit");
					System.out.println("Select one number between 1 - 4 :");
					num = input.nextInt();
					
					if(num == 1) {
						System.out.print("Account number : ");
						int accountnum1 = input.nextInt();
						account.setAccountnum(accountnum1);
					}
					
					else if (num == 2) {
						System.out.printf("Income : ");
						int income = input.nextInt();
						account.setIncome(income);
					}
					
					else if (num == 3) {
						System.out.printf("expense : ");
						int expense = input.nextInt();
						account.setExpense(expense);
					}
					
					else {
						continue;
					}
				}
				break;
			}	
		}
	}
	
	public void ViewAccounts() {
//		System.out.print("Account number : ");
//		int accountnum = input.nextInt();
		for(int i = 0 ; i < accounts.size() ; i++) {
			accounts.get(i).printInfo();
		}
	}

}
