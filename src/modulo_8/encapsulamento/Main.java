package modulo_8.encapsulamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.print("Product name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		// p.name = name <= isso não funcionará, pois o atributo é privado.
		p.setName(name);
		p.setPrice(price);
		System.out.printf("Product name %s, Price: $%s", p.getName(), p.getPrice());
		sc.close();
	}

}
