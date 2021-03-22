import java.util.Scanner;
import java.util.Locale;
public class Exe_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		double v1, v2, total;
		
		System.out.println("Digite o código, quantidade e valor unitário de cada peça:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		v1 = sc.nextDouble();
	    c = sc.nextInt();
		d = sc.nextInt();
		v2 = sc.nextDouble();
		
		total = (b * v1) + (d * v2);
		
		System.out.printf("VALOR A PAGAR: %.2f%n", total);
		
		
	}

}
