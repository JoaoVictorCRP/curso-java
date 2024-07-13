package modulo_1.outrosTopicos;

public class Main {

	public static void main(String[] args) {
		// Operadores BITWISE
		//  & -> "E" bit a bit (AND)
		//  | -> "Ou" bit a bit (OR)
		//  ^ -> "Ou-exclusivo" bit a bit (XOR)
		
		// Exemplo de operação bitwise:
		
		int n1 = 89; // Em binário = 0101 1001
		int n2 = 60; // Em binário = 0011 1100
		
		System.out.println(n1 & n2); // 0001 1000 (24)
		
		System.out.println(n1 | n2); // 0111 1101 (125)
		
		System.out.println(n1 ^ n2); // 0110 0101 (101)
		
		// A aplicabilidade das operações bitwise ocorre na programação de baixo nível: arduino, redes e embarcados em geral.
	}
	
	
}
