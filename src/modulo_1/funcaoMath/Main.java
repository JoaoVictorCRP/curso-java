package modulo_1.funcaoMath;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// O pacote Math inclui diversos métodos matemáticos bem úteis
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = -4;
		int z = 4;
		
		double raizQ = Math.sqrt(x);
		Number pot = Math.pow(2, x);
		System.out.println("A Raiz quadrada de " + x + " é " + raizQ);
		System.out.println("2 elevado a " + x + " é " + pot);
		System.out.println("O valor absoluto de " + y + " é " + Math.abs(y));
		System.out.println("O valor absoluto de " + z + " é " + Math.abs(z));
	}

}
