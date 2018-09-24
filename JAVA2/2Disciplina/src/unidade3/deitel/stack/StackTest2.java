package unidade3.deitel.stack;

public class StackTest2 {

	public static void main(String[] args) {

		Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Cria uma Stack<Double> e uma Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();

		// Insere os elementos em doubleStack
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack); // remove elementos de doubleStack

		// Insere os elementos em integerStack
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack); // remove elementos de doubleStack

	}

	// método genérico testPop remove elementos de uma Stack
	private static <T> void testPop(String name, Stack<T> stack) {

		// remove elementos da pilha
		try {
			System.out.printf("%nPopping elements from %s%n", name);
			T popValue; // armazena o elemento removido da pilha

			// remove todos os elementos da Stack
			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException ex) {
			System.out.println();
			ex.printStackTrace();
		}

	}

	// método genérico testPush insere elementos em uma Stack
	private static <T> void testPush(String name, Stack<T> stack, T[] elements) {

		System.out.printf("%nPushing elements into %s%n", name);

		// insere elementos na Stack
		for (T element : elements) {

			System.out.printf("%s ", element);
			stack.push(element);
		}

	}

}
