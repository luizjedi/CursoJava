import java.util.Scanner;

public class Exe_For_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n, div;

		System.out.println("Informe um número inteiro:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);

			}

		}
		
		sc.close();

	}

}
