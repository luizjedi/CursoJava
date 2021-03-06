package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private String name = "Circle";
	private Double radius;

	public Circle() {

	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String circle) {
		this.name = circle;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;

	}

	public String toString() {
		return name;
	}

}
