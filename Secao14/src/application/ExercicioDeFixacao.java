package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExercicioDeFixacao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int nprod = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= nprod; i++) {

			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i' || ch == 'I') {

				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				products.add(new ImportedProduct(name, price, customsFee));
			}

			if (ch == 'u' || ch == 'U') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				products.add(new UsedProduct(name, price, manufactureDate));
			}

			if (ch == 'c' || ch == 'C') {

				products.add(new Product(name, price));
			}

			System.out.println();
		}

		System.out.println("PRICE TAGS:");

		for (Product tags : products) {

			System.out.println(tags.priceTag());
		}

		sc.close();
	}

}
