package unidade3;

public class NotaAluno {
	
	double valor;
	
	//Construtor Gen�rico
	<T extends Number>NotaAluno(T obj){
		
		valor = obj.doubleValue();
		
	}
	
	//M�todo Gen�rico
	<T extends Number>double retornarValor(T obj){
		
		return obj.doubleValue();
		
	}
}
