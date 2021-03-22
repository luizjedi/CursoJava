
import java.util.Scanner;

public class Exe_ER_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x, alcool = 0, gas = 0, diesel = 0;

		System.out.println("Informe o tipo de abastecimento:");
		x = sc.nextInt();

		while (x != 4) {

			if (x == 1) {
				alcool += 1;

			}

			else if (x == 2) {
				gas += 1;

			}

			else if (x == 3) {
				diesel += 1;

			}

			System.out.println("Informe o tipo de abastecimento:");
			x = sc.nextInt();

		}

		System.out.printf("Muito Obrigado:\n¡lcool: %d\nGasolina: %d\nDiesel: %d", alcool, gas, diesel);

		sc.close();

	}

}
