package entities;

public class Rectangle implements Shape{
	
	private Double wight;
	private Double height;
	
	public Rectangle(Double wight, Double height) {
		super();
		this.wight = wight;
		this.height = height;
	}

	public Double getWight() {
		return wight;
	}

	public void setWight(Double wight) {
		this.wight = wight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	@Override
	public double area() {

		return wight * height;
	}

}
