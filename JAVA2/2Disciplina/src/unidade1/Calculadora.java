package unidade1;

import java.util.Scanner;

public class Calculadora {
	
	public static void dividir(int n1, int n2) throws ArithmeticException {
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) throws DivisaoZeroException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite n1: ");
		int n1 = input.nextInt();
		System.out.print("Digite n2: ");
		int n2 = input.nextInt();
		
		try {
			dividir(n1, n2);
		}
		catch(ArithmeticException e) {
			/*System.out.println("Erro: ");
			e.printStackTrace();*/
			
			throw new DivisaoZeroException();
		}	
		
	}

}
