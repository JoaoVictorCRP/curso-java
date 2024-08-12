package modulo_8.exercicioFixacao;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Conta conta;
		
		// Input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
        sc.nextLine(); // Essa linha faz com que o `\n` que restou do input numérico seja consumido. (Lembre-se que nextInt não consome quebra de linha)
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Would you like to make an initial deposit? (y/n): ");
		char initialDepositFlag = sc.next().charAt(0);

		if(initialDepositFlag=='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(holder, accountNumber, initialDeposit);
		} else {
			conta = new Conta(holder, accountNumber);
		};
		
		
		System.out.println("Account Data: ");
		System.out.printf("Account: %s, Holder: %s, Balance: $%.2f\n", conta.getNumeroConta(), conta.getNome(), conta.getSaldo());
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Updated account Data: ");
		System.out.printf("Account: %s, Holder: %s, Balance: $%.2f\n", conta.getNumeroConta(), conta.getNome(), conta.getSaldo());

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Updated account Data: ");
		System.out.printf("Account: %s, Holder: %s, Balance: $%.2f", conta.getNumeroConta(), conta.getNome(), conta.getSaldo());

	}

}
