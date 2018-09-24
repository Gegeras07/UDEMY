package unidade3.deitel.stack;

public class EmptyStackException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//construtor sem argumento
	public EmptyStackException() {
		this("Stack is empty");
	}

	public EmptyStackException(String message) {
		super(message);
	}

}
