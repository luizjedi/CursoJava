import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe quantos números deseja somar:");
		int N = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			System.out.println("Informe o número para a soma:");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("A soma dos números é: " + soma);
	
		sc.close();
	}

}
