package Entities;

public class Rectangle {

	public double width;
	public double heigth;

	public double Area() {
		return width * heigth;
	}

	public double Perimeter() {
		return (width + heigth) * 2.0;
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}

	public void Print() {
		
		System.out.printf("AREA = %.2f", Area());
		System.out.printf("\nPERIMETER = %.2f", Perimeter());
		System.out.printf("\nDIAGONAL = %.2f", Diagonal());
				
	}
}
