package unidade3.deitel.stack;

import java.util.ArrayList;

public class Stack<T> {
	
	private ArrayList<T> elements; //ArrayList armazena elementos de pilha
	
	//Construtor sem argumento cria uma pilha do tamanho padrão
	public Stack() {
		this(10);
	}

	public Stack(int capacity) {
		
		int initCapacity = capacity > 0 ? capacity : 10; //validação
		elements = new ArrayList<>(initCapacity); //cria a ArrayList
		
	}
	
	//insere elemento na pilha
	public void push(T pushValue) {
		elements.add(pushValue);
	}
	
	//retorna o elemento superior se não estiver vazia; do contrário lança uma EmptyStackException
	public T pop() {
		if(elements.isEmpty())
			throw new EmptyStackException("Stack is empty, cannot pop");
		
		return elements.remove(elements.size() - 1);
	}

}
