package unidade1;

public class Teste {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		int i = 0;
		String[] frases = {"um", "dois", "tres"};
		
		while(i < 4) {
			
			/*try {
				//Unchecked exception
				System.out.println(frases[i]);				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro no acesso ao vetor: " + e.getMessage());
			}
			
			i++;*/
			
			//Exceção tratada usando 'throws'
			System.out.println(frases[i]);
			i++;
		}
		
	}

}
