package unidade1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecao {

	public static void main(String[] args) {
		
		int i = 0, j = 0;
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Informe um número para i: ");
			i = input.nextInt();
			System.out.print("Informe um número para j: ");
			j = input.nextInt();
			
			System.out.printf("%d / %d = %d\n", i, j, i/j);
			
			Object c = null;
			System.out.println(c.toString());
		}
		catch(ArithmeticException | NullPointerException | InputMismatchException e) {
			System.out.print("Erro: ");
			e.printStackTrace();
		}
	}

}
