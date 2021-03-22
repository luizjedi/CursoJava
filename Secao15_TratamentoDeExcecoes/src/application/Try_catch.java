package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {

			// Bloco com as a��es que tentar�o ser executadas.
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		}

		// Bloco com o tratamento das poss�veis exce��es.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}

		catch (InputMismatchException e) {
			System.out.println("Input Error!");
		}

		System.out.println("End of program! By!");

		sc.close();
	}

}
