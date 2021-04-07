package application;

import java.io.File;
import java.util.Scanner;

public class HandlingFolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Pegando todas as pastas.
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println();
		System.out.println("Folders: ");
		System.out.println();
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Pegando todos arquivos.
		
		File[] files = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("Files: ");
		System.out.println();
		
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criando uma subpasta.
		
		boolean success = new File(strPath + "\\Nova Pasta Teste").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		
		sc.close();
	}

}
