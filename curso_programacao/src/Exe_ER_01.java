import java.util.Scanner;

public class Exe_ER_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.println("Informe a senha:");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.println("Informe a senha:");
			senha = sc.nextInt();
		}

		if (senha == 2002) {
			System.out.println("Acesso Permitido");
		}

		sc.close();

	}

}
