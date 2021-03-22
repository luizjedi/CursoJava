
import java.util.Locale;
import java.util.Scanner;

public class Aula_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, soma = 0;

		System.out.println("Informe os Números desejados:");
		x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
		}

		System.out.println("A soma dos números é: " + soma);

		sc.close();

	}

}