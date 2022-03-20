import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		String account = "";
		int total = 0;
		int income = 0;
		int expense = 0;
		
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
			{
				System.out.print("New account number is : ");
				account = input.next();
			}
			
			if (num == 2) 
			{
				System.out.println("My account number is "+ account);
				System.out.printf("Total Money : ",total);
				System.out.print("Input the total money >>" );
				total = input.nextInt();
			}
			
			else if (num == 3)
			{
				System.out.printf("Income : %d\n",income);
				System.out.print("Input the income >>" );
				income = input.nextInt();
			}
			
			else if (num == 4)
			{
				System.out.printf("expense : %d\n",expense);
				System.out.print("Input the expense >>" );
				expense = input.nextInt();
			}
			
			else if (num == 5)
			{
				continue;
			}
		
		}

	}

}
