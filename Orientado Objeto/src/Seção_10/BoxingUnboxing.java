package Se��o_10;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20;
		
		//Classe mais gen�rica do java
		//Todas as outras classes herdam dela
		Object obj = x;
		
		System.out.println(obj);
		
		//� preciso fazer casting para que o compilador reconhe�a obj sendo do 
		//mesmo tipo que a vari�vel y.
		int y = (int)obj;
		
		System.out.println(y);
		
	}

}
