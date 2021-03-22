package Seção_10;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		
		//Classe mais genérica do java
		//Todas as outras classes herdam dela
		Object obj = x;
		
		System.out.println(obj);
		
		//É preciso fazer casting para que o compilador reconheça obj sendo do 
		//mesmo tipo que a variável y.
		int y = (int)obj;
		
		System.out.println(y);
		
	}

}
