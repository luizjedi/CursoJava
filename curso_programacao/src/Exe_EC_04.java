import java.util.Scanner;

public class Exe_EC_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x, y, hora;
		
		System.out.println("Insira a hora inicial e a final:");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		if (x == y) {
			
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		else {
			
			if (x > y) {
				
				hora = 24 - (x - y);
				
				System.out.printf("O JOGO DUROU %d HORA(S)", hora);
			}
			
			else {
				
				hora = y - x;
				
				System.out.printf("O JOGO DUROU %d HORA(S)", hora);
			}
		
		}
		sc.close();
	}

}
