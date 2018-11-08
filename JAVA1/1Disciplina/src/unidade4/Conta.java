package unidade4;

public class Conta {

	private int numero;
	//private double saldo;
	protected double saldo;
	private double limite;
	private Cliente cliente;
	//private Cliente[] cliente; //Associa��o

	private static int totalDeContas; // Atributo acessado pela CLASSE e n�o pelo objeto

	public Conta() {
		Conta.totalDeContas += 1;
	}

	public Conta(int numero, double saldo, double limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
		
		Conta.totalDeContas += 1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0)
			this.saldo = 0;
		else
			this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite < 0)
			this.limite = 200;
		else
			this.limite = limite;
	}

	public boolean saca(double valor) {

		if (valor <= saldo)
			saldo -= valor;
		else if (valor <= limite + saldo) {
			double dif = valor - saldo;

			valor -= dif;
			saldo -= valor;
			limite -= dif;
		} else
			return false;

		return true;
	}

	public boolean deposita(double valor) {

		if (valor > 0)
			saldo += valor;
		else
			return false;

		return true;

	}

	public boolean transfere(Conta destino, double valor) {

		if (this.saca(valor))
			destino.deposita(valor);
		else
			return false;

		return true;

	}
	
	public void rendimentos(double taxa) {
		this.saldo += this.saldo * (taxa/100); 
	}

	public static int numberAccounts() {
		return totalDeContas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
