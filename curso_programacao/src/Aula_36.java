import java.util.Locale;
import java.util.Scanner;

public class Aula_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int min;
		double fat = 50.0;

		System.out.println("Informe a quantidade de minutos:");
		min = sc.nextInt();

		if (min > 100) {
			fat += (min - 100) * 2.0;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n ", fat);

		sc.close();

	}

}
