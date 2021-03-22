import java.util.Locale;
import java.util.Scanner;

public class Exe_EC_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double inter;

		System.out.println("Insira um valor real:");
		inter = sc.nextDouble();

		if (inter < 0.0 || inter > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (inter <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (inter <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}
		else if (inter <= 75.0) {
			System.out.println("Intervalo [50,75]");
		}		
		else {
			System.out.println("Intervalo [75,100]");
		}
		
		sc.close();
	}
}