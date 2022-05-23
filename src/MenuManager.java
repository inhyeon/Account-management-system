import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import log.EventLogger;
 
public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = getObject("accountmanager.ser");
		if(accountManager == null) {
			accountManager = new AccountManager(input);
		}
		selectMenu(input, accountManager);
		putObject(accountManager, "accountmanager.ser");
	}
	
	public static void selectMenu(Scanner input, AccountManager accountManager) {
		int num = 0; 
		while (num != 7) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					accountManager.CreateAccount();
					logger.log("create an account");
					break;
				case 2:
					accountManager.DeleteAccount();
					logger.log("delete an account");
					break;
				case 3:
					accountManager.IncomeAndExpense();
					logger.log("input income and expense");
					break;
				case 4:
					accountManager.EditAccount();
					logger.log("edit accounts info");
					break;
				case 5:
					accountManager.ViewAccounts();
					logger.log("view all accounts");
					break;
				case 6:
					accountManager.bankEvents();
					logger.log("view bank events");
					break;
				default:
					continue;
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 7!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}	
	}
	
	public static void showMenu() {
		System.out.println("1. create new account");
		System.out.println("2. delete my account");
		System.out.println("3. income & output");
		System.out.println("4. edit account info");
		System.out.println("5. view acoount");
		System.out.println("6. bank events");
		System.out.println("7. exit");
		System.out.println("Select one number between 1 - 7 : ");
		
	}
	
	public static AccountManager getObject(String filename) {
		AccountManager accountManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
		
			accountManager = (AccountManager) in.readObject();
			
			in.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			return accountManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return accountManager;
	}

	public static void putObject(AccountManager accountManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			out.writeObject(accountManager);
			
			out.close();
			file.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}