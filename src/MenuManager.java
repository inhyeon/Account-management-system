import java.util.*;
 
public class MenuManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		
		selectMenu(input, accountManager);
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
					break;
				case 2:
					accountManager.DeleteAccount();
					break;
				case 3:
					accountManager.IncomeAndExpense();
					break;
				case 4:
					accountManager.EditAccount();
					break;
				case 5:
					accountManager.ViewAccounts();
					break;
				case 6:
					accountManager.bankEvents();
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
}