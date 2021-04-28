package application;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamTheory {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Criando stream a partir de uma coleção
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		// Criando stream usando Stream.of
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Criando stream infinita e consumindo com limit
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(20).toArray()));
		
		// Criando stream infinita de Fibonacci e consumindo com short-circuit
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] + x[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
