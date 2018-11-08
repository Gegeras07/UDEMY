package unidade4;

//Uso de interfaces
public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte {

	//Método abstrato
	@Override
	public void getBonificacao() {
		// TODO Auto-generated method stub
		
	}
	
	//Métodos das Interfaces

	@Override
	public void pagaIR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void vota() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
