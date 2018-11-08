package unidade3.sisalucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() {
		
		return 1;
		
	}//Anulação
	
	public void acelera(int limiteVelocidade) {
		
		//Sobrecarga
		System.out.println("Não seja um rachador! Limite: " + limiteVelocidade);
		
	}

}
