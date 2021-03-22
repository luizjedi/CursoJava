import java.util.Scanner;
import java.util.Locale;

public class Aula_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco, desconto;

		System.out.println("Informe o preço:");
		preco = sc.nextDouble();

		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);

		sc.close();
	}

}
