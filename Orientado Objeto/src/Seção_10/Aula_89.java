package Seção_10;

import java.util.Locale;
import java.util.Scanner;

public class Aula_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Como instanciar um vetor
		double[] height = new double[n];

		for (int i = 0; i < n; i++) {
			height[i] = sc.nextDouble();
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += height[i];
		}
		
		double average = sum / n;
		
		System.out.printf("%nAVERAGE HEIGTH = %.2f", average);

		sc.close();
	}

}
