import java.util.Locale;
import java.util.Scanner;

public class Aula_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 System.out.print("Digite seu nome: ") ;
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
     
     String x, a, b, c;
     int y;
     double z;
     
     x = sc.next();
     a = sc.next();
     b = sc.next();
     c = sc.next();
     
     System.out.print("Digite sua idade: ");
     
     y = sc.nextInt();
     
     System.out.print("Digite seu sal?rio: ");
     z = sc.nextDouble();
     
     System.out.printf("%nNome: %s %s %s %s%n", x, a, b, c);
     System.out.printf("Idade: %d%n", y);
     System.out.printf("Sal?rio: R$%.2f%n", z);
    
     sc.close();
     
	}

}
