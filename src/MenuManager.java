import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0; 
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		
		while (num != 6) {
				
			System.out.println("1. create new account");
			System.out.println("2. delete my account");
			System.out.println("3. income & output");
			System.out.println("4. edit account info");
			System.out.println("5. view acoount");
			System.out.println("6. exit");
			System.out.println("Select one number between 1 - 6 : ");
			num = input.nextInt();
			
			if (num == 1) 
				accountManager.CreateAccount();
			
			else if (num == 2) 
				accountManager.DeleteAccount();
			
			else if (num == 3)
				accountManager.IncomeAndExpense();
			
			else if (num == 4)
				accountManager.EditAccount();
			
			else if (num == 5)
				accountManager.ViewAccounts();
			
			else
				continue;
		}
	}
}