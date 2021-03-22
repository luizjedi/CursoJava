package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.ProductEncapsulado;

public class ExemploEncapsulamento {

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
		
		ProductEncapsulado product = new ProductEncapsulado(name, price, qtd);
		
		product.setName("Computer");
		System.out.println("\nUpdated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("\nUpdated price: " + product.getPrice());

		System.out.println("\nProduct data: " + product);

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
