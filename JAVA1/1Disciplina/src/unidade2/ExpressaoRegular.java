//https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539

package unidade2;

import java.util.Scanner;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String email = "";
		String cpf = "";
		String regexEmail = "\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}";
		String regexCpf = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um email: ");
		email = input.next();
		
		if(email.matches(regexEmail)) {
			System.out.println("Email correto!");
		}
		else {
			System.out.println("Email incorreto!");
		}
		
		System.out.print("Informe um cpf: ");
		cpf = input.next();
		
		if(cpf.matches(regexCpf)) {
			System.out.println("Cpf correto!");
		}
		else {
			System.out.println("Cpf incorreto!");
		}
		
		input.close();

	}

}
