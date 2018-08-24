package unidade3;

public class VarArgs {

	public static void main(String[] args) {
		
		String nome1 = new String("Nome1");
		String nome2 = new String("Nome2");
		String nome3 = new String("Nome3");
		
		printNomes(nome1, nome2, nome3);

	}
	//Exemplo de varargs -> Uso para quando, por exemplo, se tem um número N de argumentos para se passar a uma função
	public static void printNomes(String ...nomes) {
		
		for(String nome: nomes)
			System.out.println("Nome: " + nome);
		
	}

}
