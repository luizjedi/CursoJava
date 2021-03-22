import java.util.Scanner;
import java.util.Locale;

public class Exe_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areat, areac, areatra, areaq, arear;
		
		System.out.println("Insira os valores A, B e C:");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areat = (a * c) / 2;
		areac = 3.14159 * c * c;
		areatra = ((a + b) * c) / 2;
		areaq = b * b;
		arear = a * b;
		
		System.out.printf("%nTRIÂNGULO: %.3f%nCÍRCULO: %.3f%nTRAPÉZIO: %.3f%nQUADRADO: %.3f%nRETÂNGULO: %.3f%n", areat, areac, areatra, areaq, arear);

		
	}

}
