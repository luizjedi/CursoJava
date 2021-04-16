package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		// HashSet

		System.out.println("HashSet:");
		Set<String> set = new HashSet<>(); // É rápido porém não garante a ordem.

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

		// TreeSet.

		System.out.println("\nTreeSet:");
		Set<String> set1 = new TreeSet<>(); // Ordena os elementos.

		set1.add("TV");
		set1.add("Tablet");
		set1.add("Notebook");

		System.out.println(set1.contains("Notebook"));

		for (String p : set1) {
			System.out.println(p);
		}

		// LinkedHashSet.

		System.out.println("\nLinkedHashSet:");
		Set<String> set2 = new LinkedHashSet<>(); // Mantém a ordem de inserção
		// dos elementos.

		set2.add("TV");
		set2.add("Tablet");
		set2.add("Notebook");

		System.out.println("\nRemove:");
		set2.remove("Tablet");

		for (String p : set2) {
			System.out.println(p);
		}

		System.out.println("\nRemoveIf:");
		set2.removeIf(x -> x.charAt(0) == 'T'); // Remove todos elementos que satistação
		// a condição.

		for (String p : set2) {
			System.out.println(p);
		}

		/////////////////////////////////////////////////////////
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// Union

		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b); // Não adiciona elementos repetidos.
		System.out.println("\nUnion:");
		System.out.println(c);
		
		// Intersection
		
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); // Adiciona somente os elementos em comum.
		System.out.println("\nIntersection:");
		System.out.println(d);
		
		// Difference
		
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); // Deixa somente os elementos que forem diferentes.
		System.out.println("\nDifference:");
		System.out.println(e);

	}

}
