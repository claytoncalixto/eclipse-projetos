package appplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit, y->Yes | n->No?");
		char letter = sc.nextLine().charAt(0);
		if((letter == 'y') || (letter == 'Y')){
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);	
		}else {
			System.out.println("No initial deposit!");
			account =  new Account(number, holder);
		}
		System.out.println();

		System.out.print("Enter account holder: ");
		System.out.println(account);
		System.out.println();
			
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Upadate account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
				
		sc.close();
		

	}

}
