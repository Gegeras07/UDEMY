package unidade3.sisalucar;

public class Carro {

	private long idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	
	public Carro() {
		
	}
	
	public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria) {		
		setIdCarro(idCarro);
		setPlaca(placa);
		setFabricante(fabricante);
		setModelo(modelo);
		setAno(ano);
		setCor(cor);
		setValorDiaria(valorDiaria);
	}
	
	@Override
	public String toString() {
		return "Carro [idCarro=" + idCarro + ", placa=" + placa + ", fabricante=" + fabricante + ", modelo=" + modelo
				+ ", ano=" + ano + ", cor=" + cor + ", valorDiaria=" + valorDiaria + "]";
	}

	public long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
}
