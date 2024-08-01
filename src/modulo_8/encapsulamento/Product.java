package modulo_8.encapsulamento;

public class Product {
	// O encapsulamento tem como premissa a proteção dos atributos da classe, garantindo que o usuário (ou um colega programador)
	// não modifique a classe de maneira danosa ao programa.
	private String name;
	private double price;
	
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
	
}
