package modulo_1.funcoes;

import java.util.Scanner;

public class main {

	public static void main(String[] args) { // Main é o entrypoint da classe, o principal método (função), 
		Scanner sc = new Scanner(System.in); // se a sua classe é executável, ela precisa ter um método main.
		
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	// Uma nova função...
	public static int max(int x, int y, int z) {

		if(x>y && x>z) {
			return x;
		} else if (y>z) {
			return y;
		}
		// Else:
		return z;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
