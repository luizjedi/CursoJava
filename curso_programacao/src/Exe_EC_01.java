import java.util.Scanner;

public class Exe_EC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Insira um N�mero inteiro:");
		x = sc.nextInt();
		
	    if (x < 0) {
	    	System.out.println("NEGATIVO");
	    }
		
	    else {
	    	System.out.println("N�O NEGATIVO");
	    }
	}

}
