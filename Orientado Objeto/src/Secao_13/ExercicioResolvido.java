package Secao_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class ExercicioResolvido {

	// Lê os dados de um trabalhador, depois solicita um mês e
	// mostra qual foi o salário do funcionário nesse mês.

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		// É necessário instanciar a classe WorkerLevel e o construtor Department
		// para que a instanciação do construtor Worker flua sem erros.
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

		System.out.print("How many contracts to this worker? ");
		int nContracts = sc.nextInt();

		for (int i = 0; i < nContracts; i++) {

			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			// Para que uma variável Date seja criada e receba dados do usuário é
			// necessário criar um SimpleDateFormat;
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, value, hours);
			worker.addContract(contract);
		}

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		// Pegará os dois primeiros dígitos da string.
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		// Pegará os dígitos restantes.
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " 
		+ String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
