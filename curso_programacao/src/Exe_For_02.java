import java.util.Scanner;

public class Exe_For_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n;
		int in = 0; 
		int out = 0;

		System.out.println("Insira a quantidade de inteiros que deseja analisar:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;
			}

			else {
				out += 1;
			}

		}

		System.out.printf("%d in\n%d out", in, out);

		sc.close();

	}

}
