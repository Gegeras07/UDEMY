package mygame.client;

public interface IComunicacaoClient {
	
	public boolean solicitarConexao();
	public boolean receberDados();
	public boolean gravarDados();
	public boolean fecharConexao();

}
