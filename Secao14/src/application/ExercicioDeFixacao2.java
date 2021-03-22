package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class ExercicioDeFixacao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> anualTax = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int nPayers = sc.nextInt();

		for (int i = 1; i <= nPayers; i++) {

			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char typePerson = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (typePerson == 'i' || typePerson == 'I') {

				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();

				anualTax.add(new Individual(name, anualIncome, healthExpenses));

			}

			else {

				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				anualTax.add(new Company(name, anualIncome, numberOfEmployees));
			}

			System.out.println();

		}

		System.out.println("TAXES PAID:");

		double sum = 0.0;

		for (Person payer : anualTax) {

			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));

			sum += payer.tax();

		}

		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));

		sc.close();
	}

}
