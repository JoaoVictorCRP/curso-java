package modulo_8.produtoEstoque;
import java.util.Locale;
import java.util.Scanner;

public class exercicio {
	/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
	* 
	* - Mostrar os dados do produto (nome, preço, qntd e valor no estoque);
	* - Realizar uma entrada no estoque e mostrar novamente os dados do produto;
	* - Realizar uma saída no estoque e mostrar novamente os dados do produto.
	*
	*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		int remove, add;
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Quantity: ");
		quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.printf("Product data: %s, $ %.2f, %s units, Total Value: %s\n", p.name, p.price, p.quantity, p.totalValueInStock());

		
		// Adding products
		System.out.print("\nEnter number of products to be added in stock: ");
		add = sc.nextInt();
		p.addProducts(add);
		System.out.printf("UPDATED data: %s, $ %.2f, %s units, Total Value: %s\n", p.name, p.price, p.quantity, p.totalValueInStock());
		
		// Removing products
		System.out.print("\nEnter number of products to be removed from stock: ");
		remove = sc.nextInt();
		p.removeProducts(remove);
		System.out.printf("UPDATED data: %s, $ %.2f, %s units, Total Value: %s", p.name, p.price, p.quantity, p.totalValueInStock());
		
		sc.close();
	}
}
