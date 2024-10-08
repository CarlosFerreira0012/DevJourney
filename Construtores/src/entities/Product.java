
package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Construtor soluciona um problema: Esse problema é caso o usuario esqueça de digitar/Instanciar o objeto produto.
	//Não existe Produto sem NOME,PREÇO e QUANTIDADE.
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
