package unidade3;

public class StringEx {

	public static void main(String[] args) {
		
		String string1 = new String("O Curso de Java");
		String string2 = new String("é ótimo");
		
		System.out.println(string1 + " " + string2);
		
		System.out.println(string1.substring(string1.length() - 4));

	}

}
