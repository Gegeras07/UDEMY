package unidade2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o 1� valor: ");
		double numero1 = input.nextInt();
		System.out.print("Informe o 2� valor: ");
		double numero2 = input.nextInt();
		
		//Operadores relacionais
		
		System.out.printf("%.2f > %.2f ? %b\n%.2f = %.2f ? %b\n%.2f < %.2f ? %b", numero1, numero2, (numero1 > numero2), numero1, numero2, (numero1 == numero2), numero1, numero2, (numero1 < numero2));
		
		//Operadores aritm�ticos
		
		/*System.out.println(String.format("Soma = %.2f\nSubtra��o = %.2f\nMultiplica��o = %.2f\nDivis�o = %.2f", numero1 + numero2, numero1 - numero2, numero1 * numero2, numero1 / numero2));*/
		
		input.close();

	}

}