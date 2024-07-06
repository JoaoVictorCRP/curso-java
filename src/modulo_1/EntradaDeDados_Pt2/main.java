package modulo_1.EntradaDeDados_Pt2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // CUIDADO! Quebra de linha ficará pendente caso não utilize o método NextLine
		sc.nextLine(); // Absorvendo a quebra de linha anterior
		s1 = sc.nextLine(); 
		s2 = sc.nextLine();
		s3 = sc.nextLine(); // Nextline permite ler uma linha inteira, ao invés de ler somente uma palavra
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
	}

}
