package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class FunctionTheory {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		// A fun��o map aplica um fun��o a cada elemento da lista. Mas a fun��o
		// map s� pode ser utilizada ap�s converter a lista para .stream(). E para
		// converter o stream em list novamente basta add o comando :
		// .collect(Collectors.toList())
		
		Function<Product, String> pred = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(pred).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
