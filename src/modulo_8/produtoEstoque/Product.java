package modulo_8.produtoEstoque;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) { // O construtor é executado no momento da instanciação do objeto, forçando assim a definição dos atributos logo de cara.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Com a sobrecarga podemos criar um segundo construtor:
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// Suponhamos que você queira criar uma nova instancia de um produto, porém este ainda não tem quantidade no estoque, portanto podemos inicializar apenas os valores de name e price
	}
	
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
