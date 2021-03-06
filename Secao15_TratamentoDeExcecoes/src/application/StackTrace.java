package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();

		System.out.println();
		System.out.println("End of program! By!");

	}

	public static void method1() {

		System.out.println("****METHOD1 START****");
		method2();
		System.out.println("****METHOD1 END****");

	}

	public static void method2() {

		System.out.println("****METHOD2 START****");
		Scanner sc = new Scanner(System.in);

		try {

			// Bloco com as a??es que tentar?o ser executadas.
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println();
			System.out.println(vect[position]);

		}

		// Bloco com o tratamento das poss?veis exce??es.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			// Stack trace permite rastrear o caminho percorrido pela exce??o gerada.
			e.printStackTrace();
			sc.next();
		}

		catch (InputMismatchException e) {
			System.out.println("Input Error!");
		}

		System.out.println();
		System.out.println("****METHOD2 END****");

		sc.close();

	}

}
