package modulo_8.produtoEstoque;

public class notes {
	// Toda classe em Java é uma subclasse da classe Object
	
	// Object possui os seguintes métodos:
	// - getClass : Retorna o tipo do objeto
	// - equals : compara se o objeto é igual a outro
	// - hashCode : retorna um código hash do objeto
	// - toString : converte o objeto para string

	// EXEMPLIFICANDO:
	public static void main(String[] args) {
		Product p = new Product();
		String name = "TV";
		double price = 900.00;
		int qnt = 5;
		p.name = name;
		p.price = price;
		p.quantity = qnt;

		System.out.println(p); // Printará um endereço de memória SE UM MÉTODO ToString não for implementado.
	}
	
}
