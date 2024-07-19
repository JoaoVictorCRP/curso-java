package modulo_8.trianguloPOO;

import java.util.Locale;
import java.util.Scanner;
import modulo_8.trianguloPOO.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangles X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of Triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.CalcArea();
		
		double areaY = y.CalcArea();
		
		System.out.printf("Triangle X's area is: %.4f%n", areaX);
		System.out.printf("Triangle Y's area is: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger Area: X");
		} else {
			System.out.println("Larger Area: Y");
		};
		sc.close();
		
		// Compare o código com o anterior (triangulosSemPOO) e veja como este está bem mais limpo e legível.

	}

}
