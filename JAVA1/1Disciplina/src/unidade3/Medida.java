package unidade3;

public enum Medida {
	
	MM("Milímetro"), CM("Centímetro"), M("Metro");
	
	String titulo;
	
	private Medida(String titulo) {
		this.titulo = titulo;
	}

}
