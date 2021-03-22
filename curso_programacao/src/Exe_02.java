import java.util.Scanner;
import java.util.Locale;

public class Exe_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r, area;
		
		System.out.println("Digite o valor do raio:");
		
		r = sc.nextDouble();
		
		area = (pi * r * r);
		
		System.out.printf("A = %.4f" , area);
	}

}
