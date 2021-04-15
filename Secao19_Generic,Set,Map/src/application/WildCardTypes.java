package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardTypes {

	public static void main(String[] args) {

		// Super Tipo de listas

		List<?> myObjs = new ArrayList<>(); // ? é o super tipo de qualquer tipo
		// de lista.
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		/////////////////////////////////////////////////////////

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	// Tipo genérico de impressão de listas.

	public static void printList(List<?> list) {

		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
