package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);
		
		double[] notas = new double[4];
		double total = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %dº nota: ", i+1);
			notas[i] = input.nextDouble();
			total += notas[i];			
		}
		
		double media = total / notas.length;
		
		saida.format("Média das %d notas informadas: %.2f%n", notas.length, media);	
		
		input.close();
		saida.close();
		
	}

}
