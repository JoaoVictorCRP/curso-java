package modulo_8.produtoEstoque;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return quantity * price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return this.name + ", $" + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $" + String.format("%.2f", this.totalValueInStock());
	}
}
