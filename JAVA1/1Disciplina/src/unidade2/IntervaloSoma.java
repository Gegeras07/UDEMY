package unidade2;

import java.util.Scanner;

public class IntervaloSoma {

	public static void main(String[] args) {
		
		int a = 0, b = 0, soma = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um n�mero a: ");
		a = input.nextInt();
		System.out.print("Informe um n�mero b: ");
		b = input.nextInt();
		
		for(int i = a; i <= b; i++)
			soma += i;
		
		System.out.printf("Soma dos n�meros entre %d e %d �: %d", a, b, soma);
		
		input.close();
		
	}

}
