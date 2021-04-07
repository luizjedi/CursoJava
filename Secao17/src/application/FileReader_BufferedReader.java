package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "E:\\Documentos\\CursoJava\\Secao17\\teste.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
