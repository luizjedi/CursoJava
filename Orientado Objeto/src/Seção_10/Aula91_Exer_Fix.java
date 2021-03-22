package Se��o_10;

import java.util.Scanner;

import Entities.Rent;

public class Aula91_Exer_Fix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		// Inst�ncia de um Array de 10 posi��es.
		Rent[] rooms = new Rent[10];

		for (int i = 0; i < n; i++) {

			System.out.println("Rent #" + (i + 1));
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int room = sc.nextInt();

			// Chamada do construtor para alocar os dados coletados no array
			// de acordo com o n�mero do quarto
			rooms[room] = new Rent(name, email);

			System.out.println();
		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < 10; i++) {

			// Checagem dos quartos ocupados de acordo com as posi��es do vetor
			// com valores nulos.
			if (rooms[i] != null) {
				// Relet�rio de quartos ocupados por ordem crescente num�rica.
				System.out.println(i + ": " 
				+ rooms[i].getName() + ", " + rooms[i].getEmail());
			}

		}

		sc.close();
	}

}
