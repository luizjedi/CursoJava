package Seção_10;

import java.util.Locale;
import java.util.Scanner;

public class Exer_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Forma de instanciar matriz bidimensional

		int[][] mat = new int[n][n];

		// i é o número de linhas e j o número de colunas.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		System.out.print("Negative numbers = ");

		int qtd = 0;
		// A chamada lenght permite obter o número de linhas e colunas do vetor
		// da matriz.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					qtd++;
				}
			}
		}

		System.out.println(qtd);

		sc.close();
	}

}
