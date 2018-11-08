package unidade3;

public class Tokenizador {

	public static void main(String[] args) {
		
		String s = "XHTML;CSS;JavaScript;jQuery;Java";
		
		String[] tokens = s.split(";");
		
		System.out.println("Qtd tokens = " + tokens.length);
		
		for(String token: tokens)
			System.out.println(token);

	}

}
