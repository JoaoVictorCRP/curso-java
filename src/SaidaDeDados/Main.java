package SaidaDeDados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		int y = 32;
		double x  = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		// println -> Quebra de linha no final
		// print -> Sem quebra de linha
		
		// FORMATANDO CASAS DECIMAIS COM printf (Print formatado)
		System.out.printf("%.2f%n", x); // %.2f -> duas casas decimais ; %n -> quebra de linha
		
		
		Locale.setDefault(Locale.US); // Alterando a localização da JVM para os EUA, o que fará com que se utilize o ponto ao invés da vírgula
		System.out.printf("%.4f%n", x); // Formatando com quatro casas decimais
		
		// Interpoolação de string pode ser feita de duas maneiras:
		System.out.print("Variável Y está armazenando: " + y + " na memória\n"); // Concatenando
		System.out.printf("Variável X está armazenando: %s na memória\n", x);
		
		// FLAGS DE FORMATAÇÃO ( % )
		//	%s  -> formatar preservando maiuscúlas e minúsculas
		
		//	%S   -> formatar TUDO MAIÚSCULO
		
		//	%-s  -> alinhar texto à esquerda, case preservado
		
		//	%20s  -> alocar 20 espaços, para exibir o texto à direita
		String lang = "Java";
		String quality = "top";
		System.out.printf("\n%S é muito %50S", lang, quality);
	}

}
