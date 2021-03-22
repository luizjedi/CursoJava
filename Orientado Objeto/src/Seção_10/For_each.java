package Seção_10;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//Laço padrão
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------------------");
		
		//Laço For each
		//Dentro do laço deve conter o tipo com um apelido criado o objeto
		// ":" e o nome da coleção que se deseja percorrer.
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
