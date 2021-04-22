package application;

import java.util.Map;
import java.util.TreeMap;

public class MapTheory {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9999-0000");
		
		cookies.remove("email");
		cookies.put("phone", "9977-1133"); // Map aceita somente um único valor 
		// pra cada chave, ao adicionar dois valores para a mesma chave, o último 
		// valor inserido permanece.
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email")); // quando a chave não 
		// existe o map retorna null.
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
 