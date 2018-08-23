package unidade2;

import java.util.Scanner;

public class AplicacaoExpoente {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double e = 0;
		
		System.out.print("Digite o valor de x: ");
		double x = input.nextDouble();
		
		for(int i = 1; i <= 50; i++)
			e += Math.pow(x, i)/i;
		
		System.out.printf("O valor de e(x)=%.2f", e);
		
		input.close();
	}

}
