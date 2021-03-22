import java.util.Scanner;
import java.util.Locale;

public class Exe_For_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		double x, y, z, med;

		System.out.println("Insira o número de casos:");
		N = sc.nextInt();

		System.out.println("Insira 3 valores reais:");

		for (int i = 0; i < N; i++) {

			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();

			med = ((x * 2) + (y * 3) + (z * 5)) / 10;

			System.out.printf("%.1f\n", med);

		}

		sc.close();

	}

}
