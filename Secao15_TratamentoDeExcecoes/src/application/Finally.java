package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("E:\\Documentos\\CursoJava\\Files\\in.txt");
		Scanner sc = null;

		try {

			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}

		finally {

			if (sc != null) {
				sc.close();
			}
			
			System.out.println("Finally block executed!");
		}
	}
}
