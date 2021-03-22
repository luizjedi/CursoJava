package Entities;

public class Product {

	public String name;
	public double price;
	public int qtd;

	public Product(String name, double price, int qtd) {
		//A palavra this serve para referênciar o atributo da classe.
		//sem ela o a variável atribuida será a local.
		this.name = name;
		this.price = price;
		this.qtd = qtd;
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
