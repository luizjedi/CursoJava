package Entities;

public class ProductAutomatico {
	
	private String name;
	private double price;
	private int qtd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	
	public ProductAutomatico(String name, double price, int qtd) {

		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	
	//Sobrecarga
	public ProductAutomatico(String name, double price) {

		this.name = name;
		this.price = price;
		
	}

	public double totalValueInStock() {

		return price * qtd;
	}

	public void addProducts(int qtd) {

		this.qtd += qtd;
	}

	public void removeProducts(int qtd) {

		this.qtd -= qtd;
	}

	public String toString() {

    return name 
    		+ ", $ " 
    		+ String.format("%.2f", price)
    		+ ", " 
    		+ qtd 
    		+ " units, Total: $ "
    		+ String.format("%.2f", totalValueInStock());
	}
}
