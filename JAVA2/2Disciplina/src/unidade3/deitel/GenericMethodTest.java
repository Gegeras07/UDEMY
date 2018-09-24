package unidade3.deitel;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		//Cria arrays de diferentes tipos
		Integer[] intArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("intArray: ");
		printArray(intArray);
		System.out.println("doubleArray: ");
		printArray(doubleArray);
		System.out.println("charArray: ");
		printArray(charArray);

	}
	
	//método genérico printArray
	public static <T> void printArray(T[] inputArray) {
		for(T element : inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}

}
