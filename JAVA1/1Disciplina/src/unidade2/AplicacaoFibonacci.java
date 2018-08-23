package unidade2;

import java.util.Scanner;

public class AplicacaoFibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int f = 0;
		int count = 0;
		int soma = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Numero de fatores do Fibonacci: ");
		f = input.nextInt();
		
		input.close();
		
		while(count < f) {
			c = a + b;
			soma += c;
			System.out.print(c + " ");
			b = a;
			a = c;
			
			count++;
			
		}
		
		System.out.printf("\nMédia dos fatores: %.2f", (double)soma / f);
		
	}

}
