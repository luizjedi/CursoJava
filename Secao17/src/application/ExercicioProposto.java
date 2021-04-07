package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExercicioProposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Source file: ");
		String path = sc.nextLine();
		System.out.println();

		File sourceFile = new File(path);

		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		System.out.println("Output file (out/sumarry.csv):");
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] type = line.split(",");

				String name = type[0];
				Double price = Double.parseDouble(type[1]);
				int quantity = Integer.parseInt(type[2]);

				products.add(new Product(name, price, quantity));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : products) {

					bw.write(item.toString());
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
			}

			catch (IOException e) {
				System.out.println("Error writing file : " + e.getMessage());
			}

		}

		catch (IOException e) {
			System.out.println("Error reading file : " + e.getMessage());
		}

		sc.close();

	}

}