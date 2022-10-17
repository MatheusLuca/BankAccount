
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account number:");
		int accountNumber = input.nextInt();
		
		System.out.println("Enter account holder");
		String accountHolder = input.next(); 

		
		System.out.println("Is there na initial deposit (y/n)?");
		char verifyDeposit = input.next().charAt(0);
		
		double depositValue = 0;
		
		if (verifyDeposit == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			depositValue = input.nextDouble();
			
		}
		
		bankAccount account = new bankAccount(accountNumber, accountHolder, depositValue);
		
		System.out.println(account.showBalance());
		
		
		System.out.println("Enter deposit value: ");
		double amount = input.nextDouble();
		account.depositar(amount);
		System.out.println(account.showBalance());
		
		System.out.println("Enter deposit value: ");
		double sacar = input.nextDouble();
		account.sacar(sacar);
		
		System.out.println(account.showBalance());
		
		
	}

}

