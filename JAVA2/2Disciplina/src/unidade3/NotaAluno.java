package unidade3;

public class NotaAluno {
	
	double valor;
	
	//Construtor Genérico
	<T extends Number>NotaAluno(T obj){
		
		valor = obj.doubleValue();
		
	}
	
	//Método Genérico
	<T extends Number>double retornarValor(T obj){
		
		return obj.doubleValue();
		
	}
}
