package unidade4;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente("Gege", "Av. do Nada, 111", "111.222.333-44");
		Cliente cliente2 = new Cliente("HueBr", "Al. do Coringa, 456", "555.666.777-88");
		
		Conta conta1 = new Conta(1, 500, 200, cliente1);
		Conta conta2 = new Conta(2, 1000, 350, cliente2);
		
		System.out.println("Total de contas: " + Conta.numberAccounts());
		
		System.out.printf("Quanto você deseja sacar %s: ", conta1.getCliente().getNome());
		if(conta1.saca(input.nextDouble()))
			System.out.printf("Saque realizado!%nSaldo atual de %.2f%nLimite atual de %.2f%n", conta1.getSaldo(), conta1.getLimite());
		else {
			System.out.println("Saldo insuficiente para realizar operação\n");
		}
		
		System.out.printf("Quanto você deseja transferir %s? ", conta2.getCliente().getNome());
		if(conta2.transfere(conta1, input.nextDouble()))
			System.out.printf("Transferência realizada!%nSaldo atual de conta2: %.2f%nLimite atual de conta2: %.2f%n%nSaldo atual de conta1: %.2f", conta2.getSaldo(), conta2.getLimite(), conta1.getSaldo());
		else
			System.out.println("Não foi possível realizar a operação!");
		
		input.close();
		
	}

}
