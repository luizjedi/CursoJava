package Se��o_10;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		//La�o padr�o
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------------------");
		
		//La�o For each
		//Dentro do la�o deve conter o tipo com um apelido criado o objeto
		// ":" e o nome da cole��o que se deseja percorrer.
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
