package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Exemplo2_Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int qtd = sc.nextInt();
		
		Product product = new Product(name, price, qtd);

		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}

}
