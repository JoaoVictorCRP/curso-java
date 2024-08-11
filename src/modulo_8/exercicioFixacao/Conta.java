package modulo_8.exercicioFixacao;

public class Conta {
	private String nome;
	private int numeroConta;
	private double saldo, depositoInicial;
	
	public Conta(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = depositoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void deposit(double valor) {
		this.saldo += valor;
	}
	
	public void withdraw(double valor) {
		if(this.saldo<valor) {
			System.out.println("Your current balance is not enough.");
			return;
		}
		this.saldo -= valor;
		
	}
	
	public String toString() {
		return "Account: " + this.numeroConta + ", Holder: " + this.nome + ", Balance: $" + this.saldo;
	}
}
