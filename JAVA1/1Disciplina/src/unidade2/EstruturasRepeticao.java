package unidade2;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		//While - Verifica a condi��o antes do looping come�ar
		while(x < 10) {
			System.out.println("X = " + x);
			x++;
		}		
		
		System.out.println();
		
		//Do-While - Executa o looping primeiro para s� depois verificar a condi��o
		do {
			System.out.println("X = " + x);
			x++;
			
		}while(x < 10);
		
		//For
		for(x = 0; x < 10; x++)
			System.out.print(x + " ");
		
		System.out.println();
		
		String[] nomes = {"Geraldo", "Jos�", "Maria"};
		
		//For para arrays
		for(String y: nomes)
			System.out.println(y);
		
	}

}
