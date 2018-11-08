package unidade3;

public class EnumTest {
	
	private static final double PI = 3.14159; //Valor Constante

	public static void main(String[] args) {
		
		System.out.println(PI);
		
		System.out.println(PecasXadrez.BISPO);
		
		System.out.println(Medida.M.titulo);
		
		for(Medida m: Medida.values()) //Exibir todos os valores em enum
			System.out.println(m + " : " + m.titulo);
		
		andar(Medida.M, 100);

	}
	
	//utilizando enum
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			//... código
		}
	}

}
