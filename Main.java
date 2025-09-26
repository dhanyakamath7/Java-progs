package banking;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Account account=new Account(111,"dhanya",8000.0);
		while(true) {
			  System.out.println("\nBank Menu");
	            System.out.println("1.Deposit");
	            System.out.println("2.Withdraw");
	            System.out.println("3.Show Balance");
	            System.out.println("4.Exit");
	            System.out.print("Enter yourchoice: ");
	            
	            try {
	            	int choice=sc.nextInt();
	            	
	            	switch (choice) {
	            	
	                case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.showbal();
                        break;

                    case 4:
                        System.out.println("Thank you for banking with us. Goodbye!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please select from 1-4.");
	            	
	           
	            sc.close();
                System.exit(0);

         
        }

    } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter numeric values only.");
        sc.nextLine(); // Clear invalid input
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    } catch (InsufficientBalanceException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
}
	            
	

	



