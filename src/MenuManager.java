import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		
		while (num != 5) {
				
			System.out.println("1. create new account");
			System.out.println("2. delete my account");
			System.out.println("3. income");
			System.out.println("4. expense");
			System.out.println("5. exit");
			System.out.println("Select one number between 1 - 5 : ");
			num = input.nextInt();
			
			if (num == 1) 
				accountManager.CreateAccount();
			
			else if (num == 2) 
				accountManager.DeleteAccount();
			
			else if (num == 3)
				accountManager.Income();
			
			else if (num == 4)
				accountManager.Expense();
			
			else
				continue;
		}

	}
}