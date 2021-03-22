import java.util.Locale;
import java.util.Scanner;

public class Expressoes_comparativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
		   System.out.println("Boa Dia");
		}
		
		else if (hora >= 18) {
		   System.out.println("Boa Noite");
		      }
	    else {
		   System.out.println("Boa Tarde");
		      }
		   
		
		sc.close();

	}
		
}
