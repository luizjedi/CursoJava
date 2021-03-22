package Seção_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Forma de instanciar a lista.
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Luiz");
		list.add("Hanna");
		list.add("Renan");
		list.add("Guaraci");
		// Adiciona um elemento na posição desejada.
		list.add(2, "João");
		list.add(5, "Jiraya");
		list.add("Gustavo");

		for (String obj : list) {
			System.out.println(obj);
		}

		// Mostra o tamanho da lista
		System.out.println(list.size());

		System.out.println("--------------------------");

		// Remove um elemento que possua o mesmo valor da chamada da função.
		list.remove("Maria");
		// Remove o elemento de acordo com a posição.
		list.remove(1);

		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println(list.size());

		System.out.println("--------------------------");
		// Remove utilizando um predicado com função lambda.
		// No caso irá remover todos os elementos cujo primeiro caracter for
		// o 'J'.
		list.removeIf(obj -> obj.charAt(0) == 'J');

		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println(list.size());

		// Encontrar a posição de algum elemento na lista.
		System.out.println("--------------------------");
		System.out.println("Index of Renan: " + list.indexOf("Renan"));
		// Quando um elemento da lista não é encontrado o valor padrão retornado
		// é -1.
		System.out.println("Index of Jiraya: " + list.indexOf("Jiraya"));

		System.out.println("--------------------------");
		// Filtrar elementos da lista e descartar os que não atendem ao predicado.
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'G').collect(Collectors.toList());

		for (String obj : result) {
			System.out.println(obj);
		}

		System.out.println("--------------------------");
		// Encontrar o primeiro elemento que atenda ao predicado, caso não exista
		// retorna null.
		String name = list.stream().filter(obj -> obj.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);

	}

}
