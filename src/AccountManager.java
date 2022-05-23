import java.io.Serializable;
import java.util.*;

import Account.Account;
import Account.BankEvent;
import Account.IHbankAccounts;
import Account.JBbankAccounts;
import Account.JHbankAccounts;
import Account.MSbankAccounts;

public class AccountManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2506940107936720890L;
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	transient Scanner input;
	
	AccountManager(Scanner input){
		this.input = input;
	}
	
	public void CreateAccount() {
		int kind = 0;
		Account account;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			try {
				showBankMenu();
				kind = input.nextInt();
				if(kind == 1) {
					account = new IHbankAccounts();
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		} 
		
	}
	
	public void showBankMenu() {
		System.out.println("1. for IHbank");
		System.out.println("2. for JHbank");
		System.out.println("3. for JBbank");
		System.out.println("4. for MSbank");
		System.out.println("Select num for Account Kind between 1 and 4 : ");
	}
	
	
	public void DeleteAccount() {
		System.out.print("Account Number : ");
		int accountnum = input.nextInt();
		int index = findIndex(accountnum);
		removeAccountNum(index,accountnum);
	}
	
	public int findIndex(int accountnum) {
		int index = -1;
		for(int i = 0 ; i < accounts.size() ; i++) {
			if (accounts.get(i).getAccountnum() == accountnum) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeAccountNum(int index, int accountnum) {
		if (index >= 0) {
			accounts.remove(index);
			System.out.println("Account" + accountnum + "is deleted");
			return 1;
		}
		else {
			System.out.println("Account has not been registered");
			return -1;
		}	
	}
	
	public void IncomeAndExpense() {
		int num = 0;
		while (!(num >= 1 && num<= 4)) {
			try {
				showBankAccountMenu();
				num = input.nextInt();
			
				if(num >= 1 && num <= 4)
					printIncomeAndExpense();	
				else 
					System.out.println("Select num for Account Kind between 1 and 4 : ");
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public void showBankAccountMenu() {
		System.out.println("1. For IHbank Accounts");
		System.out.println("2. For JHbank Accounts");
		System.out.println("3. For JBbank Accounts");
		System.out.println("4. For MSbank Accounts");
		System.out.println("Select num for Account Kind between 1 and 4 : ");
	}
	
	public void printIncomeAndExpense() {
		System.out.print("Account Number : ");
		int accountnum = input.nextInt();
		int index = findIndex(accountnum);
		if (index >= 0) {
			setIncomeAndExpense(index);
		}
		
		else {
			System.out.println("Account has not been registered");
		}	
	}
	public void setIncomeAndExpense(int index) {
		Account tempAcc = accounts.get(index);
		System.out.println("Income : ");
		int incomeMoney = input.nextInt();
		tempAcc.setIncome(incomeMoney);
		System.out.println("Expense : ");
		int expenseMoney = input.nextInt();
		tempAcc.setExpense(expenseMoney);
	}
	
	public void EditAccount() {
		System.out.print("Account number : ");
		int accountnum = input.nextInt();
		for(int i = 0 ; i < accounts.size() ; i++) {
			Account account = accounts.get(i);
			if (account.getAccountnum() == accountnum) {
				int num = -1;
				while(num != 4) {
					try {
						showEditMenu();
						num = input.nextInt();
						if(num == 1) 
							setAccountNum(account,input);
						
						else if (num == 2) 
							setAccountIncome(account,input);
						
						else if (num == 3) 
							setAccountExpense(account,input);
						else 
							continue;
					}
					catch(InputMismatchException e) {
						System.out.println("Please put an integer between 1 and 4!");
						if(input.hasNext()) {
							input.next();
						}
						num = -1;
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
	
	public void setAccountNum(Account accountnum, Scanner input) {
		System.out.print("Account number : ");
		int accountnum1 = input.nextInt();
		accountnum.setAccountnum(accountnum1);
	}
	
	public void setAccountIncome(Account income, Scanner input) {
		System.out.print("Income : ");
		int income1 = input.nextInt();
		income.setIncome(income1);
	}
	
	public void setAccountExpense(Account expense, Scanner input) {
		System.out.print("Expense : ");
		int expense1 = input.nextInt();
		expense.setExpense(expense1);
	}
	
	public void showEditMenu() {
		System.out.println("** Account Info Edit Menu **");
		System.out.println(" 1. Edit Account number");
		System.out.println(" 2. Edit Income");
		System.out.println(" 3. Edit Ecpense");
		System.out.println(" 4. Exit");
		System.out.println("Select one number between 1 - 4 :");
	}
	
	public void bankEvents() {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 5) {
			try {
				System.out.println("1. IHbank Events");
				System.out.println("2. JBbank Events");
				System.out.println("3. JHbank Events");
				System.out.println("4. MSbank Events");
				System.out.println("5. Exit Menu");
				num = input.nextInt();
			 
				if(num == 1) {
					BankEvent be = new IHbankAccounts();
					be.bankEvent();
					System.out.println("");
				}
				else if(num == 2) {
					BankEvent be = new JBbankAccounts();
					be.bankEvent();
					System.out.println("");
				}
				else if(num == 3) {
					BankEvent be = new JHbankAccounts();
					be.bankEvent();
					System.out.println("");
				}
				else if(num == 4){
					BankEvent be = new MSbankAccounts();
					be.bankEvent();
					System.out.println("");
				}
				else if(num == 5){
					continue;
				}
				else {
					System.out.println("Select correct number!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
}