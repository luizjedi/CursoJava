package Secao_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order1;
import Entities.OrderItem;
import Entities.Product3;
import Entities.enums.OrderStatus;

public class Exer_Fixacao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order1 order = new Order1(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String name1 = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();

			Product3 product = new Product3(name1, price);

			System.out.print("Quantity: ");
			int qtd = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(qtd, price, product);
			
			order.addItem(orderItem);

		}
		
		System.out.println();
		System.out.println(order);

		sc.close();
	}

}
