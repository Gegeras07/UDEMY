package unidade3.sisalucar;

public class Cliente {

	private long idCliente;
	private String cpf;
	private String nome;
	private String cnh;
	
	public Cliente() {
		
	}

	public Cliente(long idCliente, String cpf, String nome, String cnh) {
		setIdCliente(idCliente);
		setCpf(cpf);
		setNome(nome);
		setCnh(cnh);
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
