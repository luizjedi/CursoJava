package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exer_Fix_MembrosEstaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double qtd = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.PaidValue(dollar, qtd));

		sc.close();
	}

}
