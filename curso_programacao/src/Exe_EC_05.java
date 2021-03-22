import java.util.Scanner;
import java.util.Locale;

public class Exe_EC_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		int item, quant;
		double total;
		
		System.out.println("Insira o item e a quantidade:");
		item = sc.nextInt();
		quant = sc.nextInt();
		
		
		if (item == 1) {
			total = 4.00 * quant;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else {
			if (item == 2) {
				total = 4.50 * quant;
				System.out.printf("Total: R$ %.2f", total);
			}
			
			else {
				if (item == 3) {
					total = 5.00 * quant;
					System.out.printf("Total: R$ %.2f", total);
				}
				
				else {
					if (item == 4) {
						total = 2.00 * quant;
						System.out.printf("Total: R$ %.2f", total);
					}
					
					else {
						if (item == 5) {
							total = 1.50 * quant;
							System.out.printf("Total: R$ %.2f", total);
						}
						
						else {
							System.out.println("Esse item não está cadastrado no sistema");
						}
					}
				}
			}
		}
		 sc.close();
	}

}
