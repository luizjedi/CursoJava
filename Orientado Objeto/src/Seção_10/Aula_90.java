package Seção_10;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product2;

public class Aula_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Product2[] product = new Product2[n];

		//.lenght representa a quantidade de elementos do vetor
		for (int i = 0; i < product.length; i++) {

			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();

			product[i] = new Product2(name, price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < product.length; i++) {
			//Acessa o vetor na posição i e pega o valor de price para a 
			//variável sum.
			sum += product[i].getPrice();
		}
		
		double average = sum / product.length;
		
		System.out.printf("%nAVERAGE PRICE = %.2f", average);

		sc.close();
	}

}
