package Aplication;

import java.util.Locale;
import java.util.Scanner;
import Entities.Rectangle;

public class Exer_Fix_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth:");
		rectangle.heigth = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		rectangle.Print();
		
		sc.close();
	}

}
