package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private String name = "Rectangle";
	private Double width;
	private Double heigth;

	public Rectangle() {

	}

	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public final double area() {

		return width * heigth;
	}
	
	public String toString() {
		return name;
	}

}
