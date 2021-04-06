package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {
		
		// É preciso colocar \\ após cada pasta até chegar ao caminho desejado.
		File file = new File("E:\\Documentos\\CursoJava\\Secao17\\teste.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
