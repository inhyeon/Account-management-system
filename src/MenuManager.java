import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
				
			System.out.println("1. create new account");
			System.out.println("2. my accounts & total money");
			System.out.println("3. income");
			System.out.println("4. expense");
			System.out.println("5. show a menu");
			System.out.println("6. exit");
			System.out.println("Select one number between 1 - 6 : ");
			num = input.nextInt();
			
			if (num == 1) 
				CreateAccount();
			
			else if (num == 2) 
			{
				TotalMoney();
			}
			
			else if (num == 3)
			{
				Income();
			}
			
			else if (num == 4)
			{
				Expense();
			}
			
			else if (num == 5)
			{
				continue;
			}
		
		}

	}
	public static void CreateAccount() {
		Scanner input1 = new Scanner(System.in);
		System.out.print("New account number is : ");
		String account = input1.nextLine();
	}
	
	public static void TotalMoney() {
		int total = 0;
		Scanner input2 = new Scanner(System.in);
		System.out.print("Input the total money >> " );
		System.out.printf("Total Money : ",total);
		total = input2.nextInt();
	}
	
	public static void Income() {
		int income = 0;
		Scanner input3 = new Scanner(System.in);
		System.out.print("Input the income >> " );
		System.out.printf("Income : ");
		income = input3.nextInt();
	}
	
	public static void Expense() {
		int expense = 0;
		Scanner input4 = new Scanner(System.in);
		System.out.print("Input the expense >> " );
		System.out.printf("expense : ");
		expense = input4.nextInt();
	}

}