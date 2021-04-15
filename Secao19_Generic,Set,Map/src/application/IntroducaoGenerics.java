package application;

import java.util.Scanner;
import services.PrintService;

public class IntroducaoGenerics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many values? ");
		int quantity = sc.nextInt();
		sc.nextLine();

		PrintService<String> p = new PrintService<>();

		for (int i = 0; i < quantity; i++) {

			String n = sc.nextLine();
			p.addValue(n);
		}

		p.print();

		sc.close();
	}

}
