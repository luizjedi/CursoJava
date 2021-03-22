package Aplication;

import java.util.Scanner;
import java.util.Locale;

import Entities.Account;

public class Exer_Fix_Secao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there a initial deposit (y/n)? ");
		// Método para utilizar scanner em apenas 1 caractere, ou seja,
		// char.
		char answer = sc.next().charAt(0);

		double inicialDeposit;

		if (answer == 'y' || answer == 'Y') {

			System.out.print("Enter initial deposit value: ");
			inicialDeposit = sc.nextDouble();

			account = new Account(holder, number, inicialDeposit);
		}

		else {
			account = new Account(holder, number); //Sobrecarga
		}

		System.out.println("\nAccount data:");
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		account.Deposit(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.print("\nEnter a whitdraw value: ");
		account.Whitdraw(sc.nextDouble());

		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
