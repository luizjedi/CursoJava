package Entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product3 product;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price) {

		this.quantity = quantity;
		this.price = price;
	}

	public OrderItem(Integer quantity, Double price, Product3 product) {

		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product3 getProduct() {
		return product;
	}

	public void setProduct(Product3 product) {
		this.product = product;
	}

	public double subTotal() {
		return quantity * price;
	}

	public String toString() {

		return product.getName()// Pega o campo nome da classe Product3 por heran?a
				+ ", $" + String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
