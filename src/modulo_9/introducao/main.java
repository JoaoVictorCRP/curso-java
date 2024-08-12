package modulo_9.introducao;

import modulo_8.produtoEstoque.Product;

public class main {

	public static void main(String[] args) {
		// Classes são tipos referência
		// Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim ponteiros para caixas.

		// Ambas variáveis acima apontam para o mesmo endereço de memória
		Product p1 = new Product("TV", 500.00, 2);
		Product p2 = p1;

		// uma variável de referência pode ser inicializada como null
		Product p3 = null;

		
		// Tipos primitivos são tipos valor
		// Tipos valor são CAIXAS e não ponteiros.
		double x, y;
		x = 10;
		y = x;
		// "y recebe uma CÓPIA de x"
		y=y+5;
		System.out.println(x); // x segue inalterado
	}

}
