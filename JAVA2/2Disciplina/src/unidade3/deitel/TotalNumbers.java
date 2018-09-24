package unidade3.deitel;

import java.util.ArrayList;

public class TotalNumbers {

	public static void main(String[] args) {
		
		//Cria, inicializa e gera saída de ArrayList de números contendo
		//tanto Integers como Doubles e, então, exibe o total dos elementos
		Number[] numbers = {1, 2.4, 3, 4.1};
		ArrayList<Number> numberList = new ArrayList<>();
		
		for(Number element: numbers)
			numberList.add(element);
		
		System.out.printf("numberList contains> %s%n", numberList);
		System.out.printf("Total of elements in numberList is: %.1f%n", sum(numberList));

	}

	private static Object sum(ArrayList<Number> list) {
		
		double total = 0;
		
		for(Number element: list)
			total += element.doubleValue();
		
		return total;
	}

}
