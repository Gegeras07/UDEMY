package unidade3.sisalucar;

public class Onibus extends Veiculo {
	
	public int getPassageiros() {
		
		return 40;
		
	} //Anula��o
	
	public void acelera(int limiteVelocidade) {
		
		System.out.println("Motorista, pode correr! A gurizada n�o tem medo de morrer! Limite: " + limiteVelocidade);
		
	} //Sobrecarga

}
