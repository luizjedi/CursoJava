import java.util.Scanner;
import java.util.Locale;

public class Exe_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double v, salario;
		
		System.out.println("Digite seu número:");
		
		n = sc.nextInt();
		
		System.out.println("Digite as horas trabalhadas:");
		
		h = sc.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada:");
		
		v = sc.nextDouble();
		
		salario = h * v;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f" , salario);
		
		

	}

}
