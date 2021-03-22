package Secao_13;

import java.util.Date;

import Entities.Order;
import Entities.enums.OrderStatus;

public class Enumeracoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
		// Primeira forma
		OrderStatus os1 = OrderStatus.DELIVERED;
		// Segunda forma
		OrderStatus os2 = OrderStatus.valueOf("SHIPPED");

		System.out.println(os1);
		System.out.println(os2);

	}

}
