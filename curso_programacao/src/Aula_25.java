import java.util.Scanner;

public class Aula_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		System.out.printf("Digite um n?mero:%n%n");
		
		x = sc.nextInt();
		
		System.out.printf("%nDigite Dados:%n%n");
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
 
		
		System.out.printf("%nDados Digitados:%n%n");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	
	}

}
