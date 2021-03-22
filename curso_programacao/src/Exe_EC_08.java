import java.util.Locale;
import java.util.Scanner;

public class Exe_EC_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda, imp;
		
		System.out.println("Informe seu salário:");
		renda = sc.nextDouble();
		
		if (renda <= 2000.0) {
			System.out.println("Isento");
		}
		
		else if (renda > 2000.0 && renda <= 3000.0) {
			imp = (renda - 2000.0) * 0.08;
			System.out.printf("\nR$ %.2f", imp);
		}
		
		else if (renda > 3000.0 && renda <= 4500.0) {
			imp = 80.0 + (renda - 3000.0) * 0.18;
			System.out.printf("\nR$ %.2f", imp);
		}
		
		else {
			imp = 350 + (renda - 4500.0) * 0.28;
			System.out.printf("\nR$ %.2f", imp);
		}
		
		sc.close();

	}

}
