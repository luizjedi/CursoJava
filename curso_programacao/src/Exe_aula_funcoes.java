import java.util.Scanner;

public class Exe_aula_funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Esse programa recebe três números inteiros como entrada
		// e mostra qual o maior deles

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira 3 valores inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int higher = max(x, y, z);

		showResult(higher);

		sc.close();

	}

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		}

		else if (b > c) {
			aux = b;
		}

		else {
			aux = c;
		}
		
		return aux;

	}
	
	public static void showResult (int value) {
		
		System.out.println("O maior é: " + value);
		
	}

}










