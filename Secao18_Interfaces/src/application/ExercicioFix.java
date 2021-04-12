package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class ExercicioFix {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double amount = sc.nextDouble();

		Contract contract = new Contract(number, date, amount);

		System.out.print("Enter number of installments: ");
		number = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, number);

		System.out.println("Installments:");

		for (Installment x : contract.getInstallments()) {

			System.out.println(x);
		}

		sc.close();
	}

}
