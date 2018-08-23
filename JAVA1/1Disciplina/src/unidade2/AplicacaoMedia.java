package unidade2;

import java.util.Scanner;

public class AplicacaoMedia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		int count = 0;
		int sum = 0;
		int newInput = 0;
		double average = 0;
		
		System.out.print("Enter a new number or -1 to exit: ");
		newInput = input.nextInt();
		
		while(newInput != -1) {
			sum += newInput;
			count++;
			
			if(newInput > max)
				max = newInput;
			
			if(count != 1)
			{
				if(newInput < min)
					min = newInput;
			}				
			else {
				min = newInput;
			}
			
			System.out.print("Enter a new number or -1 to exit: ");
			newInput = input.nextInt();
		}
		
		if(count == 0) {
			System.out.println("No numbers entered!");
		}
		else {
			average = (double) sum / count;
			
			System.out.printf("Average for %d entered numbers = %.2f\nMax number = %d\nMin number = %d", count, average, max, min);
		}
		
		input.close();

	}

}
