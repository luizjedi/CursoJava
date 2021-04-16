package application;

import entities.Client;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b)); // testa a igualdade com 100% de precisão.
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println("\n");
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); // A comparação é feita por conteúdo.
		System.out.println(c1 == c2); // A comparação é feita pelas posições de memória.
	
		String s1 = "Test"; 
		String s2 = "Test";
		
		System.out.println(s1 == s2); // Compilador permite tratamento especial 
		// para literais.
	}

}
