package unidade3.sisalucar;

public class Veiculo {
	
	//protected float autonomia; //Acess�vel apenas a subclasses da superclasse Veiculo
	private float autonomia; //Acess�vel apenas atrav�s do m�todo getAutonomia()
	//public float autonomia; Acesso irrestrito
	
	public void acelera() {}
	
	public void freia() {}
	
	public float getVelocidade() {return 0;}
	
	public int getPassageiros() {return 0;}
	
	public float getAutonomia() {
		return autonomia;
	}

}
