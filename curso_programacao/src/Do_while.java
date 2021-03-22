import java.util.Scanner;
import java.util.Locale;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		char resp;

		do {

			System.out.printf("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();

			double formula = ((9 * c) / 5) + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f\n", formula);

			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();

	}

}
