import java.util.Scanner;

public class Exe_For_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n, quad, cubo;
		
		System.out.println("Insira o valor inteiro positivo:");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			quad = i * i;
			cubo = i * i * i;
			
			System.out.printf("%d %d %d\n", i, quad, cubo);
		}
		
		sc.close();
	}

}
