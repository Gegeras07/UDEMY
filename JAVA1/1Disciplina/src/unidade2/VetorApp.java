package unidade2;

import java.util.Scanner;

public class VetorApp {

	public static void main(String[] args) {
		
		//vetor de tipos primitivos
		int[] vetor = new int[11];
		int t = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escolha um número: ");
		t = input.nextInt();
		
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = t * i;
		
		for(int j: vetor)
			System.out.print(j + " ");
		
		System.out.println();	
		
		//vetor de objetos
		String[] diasSemana = new String[3];
		
		for(int i = 0; i < diasSemana.length; i++)
		{
			System.out.print("Escreva um dia da semana: ");
			diasSemana[i] = input.next();
		}
		
		for(String dia: diasSemana)
			System.out.println("Dia da semana: " + dia);
		
		//matriz
		int[][] matriz = new int[3][3];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
			{
				if(i == j)
					matriz[i][j] = 1;
				else
					matriz[i][j] = 0;
			}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[ %d ]", matriz[i][j]);
			}
			
			System.out.println();
		}
					
		
		input.close();

	}

}
