package unidade4;

public class ContaPoupanca extends Conta /* Herança */ {

	// Anulação de métodos herdados
	public void rendimentos(double taxa) {
		super.saldo += super.saldo * (taxa / 100) * 3;
	}

}
