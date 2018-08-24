package unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {
	
	private long idLocacao;
	private long idCliente;
	private long idCarro;
	private float valorLocado;
	private LocalDate datainicial;
	private LocalDate datafinal;
	
	public Locacao() {
		
	}
	
	public Locacao(long idLocacao, long idCliente, long idCarro, float valorLocado, LocalDate datainicial,
			LocalDate datafinal) {
		setIdLocacao(idLocacao);
		setIdCliente(idCliente);
		setIdCarro(idCarro);
		setValorLocado(valorLocado);
		setDatainicial(datainicial);
		setDatafinal(datafinal);
	}
	public long getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(long idLocacao) {
		this.idLocacao = idLocacao;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}
	public float getValorLocado() {
		return valorLocado;
	}
	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}
	public LocalDate getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(LocalDate datainicial) {
		this.datainicial = datainicial;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	@Override
	public String toString() {
		return "Locacao [idLocacao=" + idLocacao + ", idCliente=" + idCliente + ", idCarro=" + idCarro
				+ ", valorLocado=" + valorLocado + ", datainicial=" + datainicial + ", datafinal=" + datafinal + "]";
	}

}
