import java.util.Scanner;

public class Exe_For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Insira um valor inteiro:");
		x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			if (x > 1000) {
				sc.close();
			}

			else if (i % 2 == 1){
				System.out.println(i);
			}
			
			else {
				sc.close();
			}
		}

		sc.close();

	}

}