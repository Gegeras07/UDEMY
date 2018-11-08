package unidade4;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		
		//Funcionario jose = new Funcionario();
		
		//Super-classe: Funcionario
		//Classes filhas: Professor, Administrativo, Diretor
		
		Funcionario antonio = new Professor();
		
		Funcionario andrea = new Administrativo();
		
		Funcionario pedro = new Diretor();
		
		verificarTipoFuncionario(andrea);
		verificarTipoFuncionario(antonio);
		verificarTipoFuncionario(pedro);
		
		/*
		
		Professor professor = new Professor(); 
		
		Autenticavel aut = professor; //Interface recebendo referência de um objeto
		
		Cidadao cidadao = professor;
		
		Contribuinte contribuinte = professor;
		
		*/
		
		

	}
	
	public static void verificarTipoFuncionario(Funcionario objeto) {
		
		if(objeto instanceof Diretor)
			System.out.println("Diretor");
		else if(objeto instanceof Professor)
			System.out.println("Professor");
		else
			System.out.println("Administrativo");
		
	}

}
