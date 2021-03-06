package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class MetodosAbstratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> shapes = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			// Forma de ler a entrada com o tipo Enum.
			Color color = Color.valueOf(sc.next());

			if (shape == 'r' || shape == 'R') {

				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();

				shapes.add(new Rectangle(color, width, heigth));

			}

			else if (shape == 'c' || shape == 'C') {

				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				shapes.add(new Circle(color, radius));

			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS:");

		for (Shape sp : shapes) {

			System.out.println(
					sp.toString() 
					+ " ?rea: " 
					+ String.format("%.2f", sp.area())
					+ "UNID" 
					+ " Color: " 
					+ sp.getColor());
		}

		sc.close();
	}

}
