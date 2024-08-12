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
		
		
		// GARBAGE COLLECTOR
		// objetos uma vez instanciados e que perderam a referência serão desalocados da memória heap (memória dinâmica) pelo garbage collector.
		Product p4 = new Product("Caderno", 20.00, 5);
		Product p5 = new Product("Caneta", 2.00, 5);
		p4 = p5; // O apontamento do caderno sumiu do mapa... Foi devorado pelo garbage collector.
		
		// Observação: Desalocação por escoppo não é garbage collector. (VEJA  method 1)
		
		
	}
	
	void method1() {
		int x = 10;
		if(x>10) {
			int y=5;
		}
		// y só existe no escopo do if
		System.out.println(x);
	};

}
