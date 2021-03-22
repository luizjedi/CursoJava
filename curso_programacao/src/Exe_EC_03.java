import java.util.Scanner;

public class Exe_EC_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Insira Dois Valores Inteiros:");
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x % y == 0 || y % x == 0) {
        	
        	System.out.println("São Mútiplos");
        
        }

        else {
        	
        	System.out.println("Não são Múltiplos");
        
        }
        
	}

}
