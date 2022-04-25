import java.util.*;

import Account.Account;
import Account.JBbankAccounts;
import Account.JHbankAccounts;
import Account.MSbankAccounts;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void CreateAccount() {
		int kind = 0;
		Account account;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1. for IHbank");
			System.out.println("2. for JHbank");
			System.out.println("3. for JBbank");
			System.out.println("4. for MSbank");
			System.out.println("Select num for Account Kind between 1 and 4 : ");
			kind = input.nextInt();
			if(kind == 1) {
				account = new Account();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 2) {
				account = new JHbankAccounts();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 3) {
				account = new JBbankAccounts();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else if (kind == 4) {
				account = new MSbankAccounts();
				account.getUserInput(input);
				accounts.add(account);
				break;
			}
			else {
				System.out.println("Select num for Account Kind between 1 and 4 : ");
			}
		}
		
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
		int num = 0;
		while (num != 1 && num != 2 && num != 3 && num != 4) {
			System.out.println("1. For IHbank Accounts");
			System.out.println("2. For JHbank Accounts");
			System.out.println("3. For JBbank Accounts");
			System.out.println("4. For MSbank Accounts");
			System.out.println("Select num for Account Kind between 1 and 4 : ");
			num = input.nextInt();
			
			if(num == 1) {
				System.out.print("Account Number : ");
				int accountnum = input.nextInt();
				int index = -1;
				for(int i = 0 ; i < accounts.size() ; i++) {
					if (accounts.get(i).getAccountnum() == accountnum) {
						index = i;
						break;
					}
				}
				
				Account tempAcc = accounts.get(index);
				
				if (index >= 0) {
					System.out.println("Income : ");
					int incomeMoney = input.nextInt();
					tempAcc.setIncome(incomeMoney);
					System.out.println("Expense : ");
					int expenseMoney = input.nextInt();
					tempAcc.setExpense(expenseMoney);
				}
				
				else {
					System.out.println("Account has not been registered");
					return;
				}	
			}
			else if (num == 2) {
				System.out.print("Account Number : ");
				int accountnum = input.nextInt();
				int index = -1;
				for(int i = 0 ; i < accounts.size() ; i++) {
					if (accounts.get(i).getAccountnum() == accountnum) {
						index = i;
						break;
					}
				}
				Account tempAcc = accounts.get(index);
				
				if (index >= 0) {
					System.out.println("Income : ");
					int incomeMoney = input.nextInt();
					tempAcc.setIncome(incomeMoney);
					System.out.println("Expense : ");
					int expenseMoney = input.nextInt();
					tempAcc.setExpense(expenseMoney);
				}
				
				else {
					System.out.println("Account has not been registered");
					return;
				}	
			}
			else if (num == 3) {
				System.out.print("Account Number : ");
				int accountnum = input.nextInt();
				int index = -1;
				for(int i = 0 ; i < accounts.size() ; i++) {
					if (accounts.get(i).getAccountnum() == accountnum) {
						index = i;
						break;
					}
				}
				Account tempAcc = accounts.get(index);
				
				if (index >= 0) {
					System.out.println("Income : ");
					int incomeMoney = input.nextInt();
					tempAcc.setIncome(incomeMoney);
					System.out.println("Expense : ");
					int expenseMoney = input.nextInt();
					tempAcc.setExpense(expenseMoney);
				}
				
				else {
					System.out.println("Account has not been registered");
					return;
				}	
			}
			else if (num == 4) {
				System.out.print("Account Number : ");
				int accountnum = input.nextInt();
				int index = -1;
				for(int i = 0 ; i < accounts.size() ; i++) {
					if (accounts.get(i).getAccountnum() == accountnum) {
						index = i;
						break;
					}
				}
				Account tempAcc = accounts.get(index);
				
				if (index >= 0) {
					System.out.println("Income : ");
					int incomeMoney = input.nextInt();
					tempAcc.setIncome(incomeMoney);
					System.out.println("Expense : ");
					int expenseMoney = input.nextInt();
					tempAcc.setExpense(expenseMoney);
				}
				
				else {
					System.out.println("Account has not been registered");
					return;
				}	
			}
			else {
				System.out.println("Select num for Account Kind between 1 and 4 : ");
			}
		}
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

		for(int i = 0 ; i < accounts.size() ; i++) {
			accounts.get(i).printInfo();
		}
	}

}
