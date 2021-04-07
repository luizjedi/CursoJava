package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "E:\\Documentos\\CursoJava\\Secao17\\out.txt";
		
		// Ao utilizar o método new (new FileWriter(path), o programa cria ou recria o arquivo,
		// e se usar (new FileWriter(path, true) o programa irá manter o que já tinha
		// e adicionar novos dados ao final.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				
				bw.write(line);
				bw.newLine();
				
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
