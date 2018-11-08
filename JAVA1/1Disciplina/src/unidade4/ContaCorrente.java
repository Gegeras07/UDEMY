package unidade4;

public class ContaCorrente extends Conta /*Herança*/ {
	
	//Anulação de métodos herdados
	public void rendimentos(double taxa) {
		super.saldo += super.saldo * (taxa/100) * 2; 
	}

}
