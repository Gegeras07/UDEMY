package unidade3;

public class Conta {
	
	private int numero;
	private double saldo;
	private double limite;
	private String nome;
	
	private static int totalDeContas; //Atributo acessado pela CLASSE e n�o pelo objeto
	
	public Conta() {
		Conta.totalDeContas += 1; 
	}	
	
	public Conta(int numero, double saldo, double limite, String nome) {
		Conta.totalDeContas += 1;
		
		setNumero(numero);
		setSaldo(saldo);
		setLimite(limite);
		setNome(nome);
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
		if(saldo < 0)
			this.saldo = 0;
		else
			this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		if(limite < 0)
			this.limite = 200;
		else
			this.limite = limite;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean saca(double valor) {
		
		if(valor <= saldo)
			saldo -= valor;
		else if(valor <= limite + saldo) {
			double dif = valor - saldo;
			
			valor -= dif;
			saldo -= valor;
			limite -= dif;
		}
		else
			return false;
		
		return true;
	}
	
	public boolean deposita(double valor) {
		
		if(valor > 0)
			saldo += valor;
		else
			return false;
		
		return true;
		
	}
	
	public boolean transfere(Conta destino, double valor) {
		
		if(this.saca(valor))
			destino.deposita(valor);
		else
			return false;
		
		return true;
		
	}
	
	public static int numberAccounts() {
		return totalDeContas;
	}

}
