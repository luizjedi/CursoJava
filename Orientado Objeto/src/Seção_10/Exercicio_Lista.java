package Seção_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employees;

public class Exercicio_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1));

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employees employee = new Employees(id, name, salary);

			list.add(employee);

			System.out.println();

		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		// Encontrará a posição do funcionário na lista de acordo com seu id.
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!!!");
		}

		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			// Caso o id exista pegará a posição do mesmo e fará o incremento de
			// salário.
			emp.Increase(percent);

		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employees obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
