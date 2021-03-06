package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ExercicioResolvidoPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int employees = sc.nextInt();

		// La?o para adicionar a quantidade employees a lista.
		for (int i = 1; i <= employees; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char response = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			// La?o para avaliar se o funcion?rio ? ou n?o terceirizado.
			if (response == 'y' || response == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}

			else {

				employee.add(new Employee(name, hours, valuePerHour));
			}

			System.out.println();

		}

		System.out.println("PAYMENTS: ");

		for (Employee emp : employee) {

			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));

		}

		sc.close();
	}

}
