import java.util.Scanner;
import java.util.Locale;

public class Exe_For_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, x, y;
		double div;

		System.out.println("Insira o n�mero de pares desejados:");
		n = sc.nextInt();

		System.out.println("Informe os valores:");

		for (int i = 0; i < n; i++) {

			x = sc.nextInt();
			y = sc.nextInt();

			if (y == 0) {
				System.out.println("Divis�o Imposs�vel");
			}

			else {
				div = (double) x / y;
				System.out.printf("%.1f\n", div);
			}

		}

		sc.close();

	}

}
