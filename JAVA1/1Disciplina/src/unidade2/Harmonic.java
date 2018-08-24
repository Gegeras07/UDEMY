package unidade2;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		
		int n = 0;
		double h = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Informe um dado n: ");
		n = input.nextInt();
		
		for(int i = 2; i < n; i++)
			h += (double)1/i; //F�rmula da s�rie: 1 + (1/2) + (1/3) + (1/n)
		
		System.out.printf("Harmonic(%d) = %.1f", n, h);
		
		input.close();

	}

}
