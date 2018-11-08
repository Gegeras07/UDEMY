package unidade3.deitel;

import java.util.ArrayList;

public class WildcardTest {

	public static void main(String[] args) {

		Integer[] integers = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> integerList = new ArrayList<>();

		// insere elementos no ArrayList
		for (Integer element : integers)
			integerList.add(element);

		System.out.printf("integerList contains: %s%n", integerList);
		System.out.printf("Total of elements in integerList: %.0f%n%n", sum(integerList));
		
		Double[] doubles = { 1.1, 3.3, 5.5 };
		ArrayList<Double> doubleList = new ArrayList<>();

		// insere elementos no ArrayList
		for (Double element : doubles)
			doubleList.add(element);

		System.out.printf("doubleList contains: %s%n", doubleList);
		System.out.printf("Total of elements in doubleList: %.1f%n%n", sum(doubleList));
		
		Number[] numbers = { 1, 2.4, 3, 4.1 };
		ArrayList<Number> numberList = new ArrayList<>();

		// insere elementos no ArrayList
		for (Number element : numbers)
			numberList.add(element);

		System.out.printf("numberList contains: %s%n", numberList);
		System.out.printf("Total of elements in numberList: %.1f%n%n", sum(numberList));

	}

	private static double sum(ArrayList<? extends Number> list) {

		double total = 0;

		for (Number element : list)
			total += element.doubleValue();

		return total;
	}

}
