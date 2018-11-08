package unidade3.deitel.stack;

public class StackTest {

	public static void main(String[] args) {

		double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Cria uma Stack<Double> e uma Stack<Integer>
		Stack<Double> doubleStack = new Stack<Double>(5);
		Stack<Integer> integerStack = new Stack<Integer>();

		// insere os elementos de doubleElements em doubleStack
		testPushDouble(doubleStack, doubleElements);
		testPopDouble(doubleStack);

		// insere os elementos de integerElements em integerStack
		testPushInteger(integerStack, integerElements);
		testPopInteger(integerStack);

	}

	private static void testPopInteger(Stack<Integer> stack) {

		// remove elementos da pilha
		try {
			System.out.println("\nPopping elements from integerStack");
			int popValue; // armazena o elemento removido da pilha

			// remove todos os elementos da Stack
			while (true) {
				popValue = stack.pop();
				System.out.printf("%d ", popValue);
			}
		} catch (EmptyStackException ex) {
			System.err.println();
			ex.printStackTrace();
		}

	}

	private static void testPushInteger(Stack<Integer> stack, int[] values) {

		System.out.println("\nPushing elements into integerStack");

		// insere elementos na Stack
		for (int value : values) {
			System.out.printf("%d ", value);
			stack.push(value);
		}

	}

	private static void testPopDouble(Stack<Double> stack) {

		// remove elementos da pilha
		try {
			System.out.println("\nPopping elements from doubleStack");
			double popValue; // armazena o elemento removido da pilha

			// remove todos os elementos da Stack
			while (true) {
				popValue = stack.pop();
				System.out.printf("%.1f ", popValue);
			}
		} catch (EmptyStackException ex) {
			System.err.println();
			ex.printStackTrace();
		}

	}

	// testa o método push com a pilha de doubles
	private static void testPushDouble(Stack<Double> stack, double[] values) {

		System.out.println("\nPushing elements into doubleStack");

		// insere elementos na Stack
		for (double value : values) {
			System.out.printf("%.1f ", value);
			stack.push(value);
		}

	}

}
