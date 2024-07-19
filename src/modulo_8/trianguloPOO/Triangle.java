package modulo_8.trianguloPOO;

public class Triangle {
	
	public double a;
	public double b;
	public double c;

	public double CalcArea() {
		double p = (this.a + this.b + this.c) / 2;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}
// Em suma,
// CLASSSE É UM TIPO ESTRUTURADO QUE PODE CONTER:
// - Atributos
// - Métodos

// A Classe também pode prover muitos outros recursos, tais como:
// - Construtores
// - Sobrecarga
// - Encapsulamento
// - Herança
}
