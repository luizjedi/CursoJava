import java.util.Scanner;

public class Exe_ER_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Informe os pontos x e y");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}

			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}

			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}

			else {
				System.out.println("Segundo");
			}
			
			System.out.println("Informe os pontos x e y");
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();
	}

}
