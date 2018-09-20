package mygame.server;

public interface IComunicacaoServer {
	
	public boolean aceitarConexao();
	public boolean prepararEnvioDados();
	public boolean enviarDados();
	public boolean fecharConexao();
	

}
