package Aplication;

import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;

public class Exer_Fix_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();

		System.out.printf("\nEmployee: %s, %.2f\n\n", employee.Name, employee.NetSalary());

		System.out.print("Which percentage to increase salary? ");
		employee.IncreaseSalary(sc.nextDouble());
		
		sc.close();
	}

}
