//Aqui esta utilizando um 'abc.jar' criado a partir das classes criadas em 2Disciplina

import unidade1.br.abctreinamentos.Universidade;
//Importa TODOS os métodos estáticos para serem usados sem a necessidade da declaração explícita da classe 
import static unidade1.br.abctreinamentos.Universidade.*;

public class Mec {
	
	void avaliarEnsino() {
		Universidade usp = new Universidade();
	}
	
	public static void main(String[] args) {
		//Acesso a um método static
		//Universidade.gerarRelatorioProfessoresMestresDoutores();
		gerarRelatorioProfessoresMestresDoutores();
	}

}
