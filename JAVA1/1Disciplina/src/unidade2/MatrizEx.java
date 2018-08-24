package unidade2;

import java.util.Random;

public class MatrizEx {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4]; //inicializa uma matriz 4x4
		int[] contador = new int[10]; //inicializa um vetor para contar as ocorrências
		
		Random random = new Random(); //inicializa um objeto para gerar números aleatórios
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				matriz[i][j] = random.nextInt(10); //preenche a matriz com números aleatórios de 0 a 9
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("[ %d ]", matriz[i][j]);
			}
			
			System.out.println();
		}//exibe a matriz
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				contador[matriz[i][j]]++; //Contabiliza o vetor 'contador' de acordo com o conteúdo da matriz, sendo utilizado como índice
		
		for(int i = 0; i < 10; i++) {
			if(contador[i] > 0) {
				System.out.printf("Elemento %d = %dx\n", i, contador[i]); //Se contador[i] for maior que zero
			}
		}

	}

}
