//Aqui esta utilizando um 'abc.jar' criado a partir das classes criadas em 2Disciplina

import unidade1.br.abctreinamentos.Universidade;
//Importa TODOS os m�todos est�ticos para serem usados sem a necessidade da declara��o expl�cita da classe 
import static unidade1.br.abctreinamentos.Universidade.*;

public class Mec {
	
	void avaliarEnsino() {
		Universidade usp = new Universidade();
	}
	
	public static void main(String[] args) {
		//Acesso a um m�todo static
		//Universidade.gerarRelatorioProfessoresMestresDoutores();
		gerarRelatorioProfessoresMestresDoutores();
	}

}
