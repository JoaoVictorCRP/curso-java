package EntradaDeDados;

// import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:
		Scanner sc = new Scanner(System.in);		
		//Locale.setDefault(Locale.US); // Colocando numeração em inglês (números utilizarão ponto, e não vírgula)

		
		// LENDO STRINGS
		String x;
		x = sc.next(); // armazenar uma string na variável x
		
		System.out.println("Você digitou: " + x);
		
		
		// LENDO NÚMERO INTEIRO
		int numInt;
		numInt = sc.nextInt();
		System.out.println("O Número digitado foi: " + numInt);
		
	
		// LENDO NÚMERO COM PONTO FLUTUANTE
		double numDbl;
		numDbl = sc.nextDouble();
		System.out.println("O número decimal digitado foi: " + numDbl);
		
		
		// sc.close() quando não precisar mais do objeto
		sc.close();
	}

}
