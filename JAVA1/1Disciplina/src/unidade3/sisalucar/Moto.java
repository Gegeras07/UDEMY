package unidade3.sisalucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() {
		
		return 1;
		
	}//Anula��o
	
	public void acelera(int limiteVelocidade) {
		
		//Sobrecarga
		System.out.println("N�o seja um rachador! Limite: " + limiteVelocidade);
		
	}

}
