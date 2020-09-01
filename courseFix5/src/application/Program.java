package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("New bank account: ");
		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();
		BankAccount account;

		System.out.print("Is there na initial deposit (y/n)? ");
		String teste = sc.next();
		if (teste.toLowerCase().equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextInt();
			account = new BankAccount(accountNumber, name, initialDeposit);
		}
		else {
			account = new BankAccount(accountNumber, name);
		}
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		double value = sc.nextInt();
		account.deposit(value);
		
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextInt();
		account.withdraw(value);
		
		System.out.println(account);

		sc.close();
		
	}

}
