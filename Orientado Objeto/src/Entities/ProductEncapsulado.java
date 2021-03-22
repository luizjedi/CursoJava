package Entities;

public class ProductEncapsulado {
	
	private String name;
	private double price;
	private int qtd;

	public ProductEncapsulado(String name, double price, int qtd) {
				
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
    public void setPrice(double price) {
		
		this.price = price;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public int getQtd() {
		
		return qtd;
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
