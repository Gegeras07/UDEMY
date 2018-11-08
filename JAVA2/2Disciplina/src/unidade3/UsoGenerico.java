package unidade3;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		System.out.println("Valor de iob: " + iob.getObj());
		
		ExemploGenerics<String> sob = new ExemploGenerics<>("Geraldo");
		sob.showType();
		System.out.println("Valor de sob: " + sob.getObj());

	}

}
