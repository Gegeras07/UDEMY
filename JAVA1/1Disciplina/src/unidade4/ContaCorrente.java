package unidade4;

public class ContaCorrente extends Conta /*Heran�a*/ {
	
	//Anula��o de m�todos herdados
	public void rendimentos(double taxa) {
		super.saldo += super.saldo * (taxa/100) * 2; 
	}

}
