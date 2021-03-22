import java.util.Scanner;

public class Exe_For_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n, fat = 1;

		System.out.println("Informe o valor a ser calculado:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fat *= i;

		}

		System.out.println(fat);

		sc.close();

	}

}
