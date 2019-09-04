package unidade2;

import java.io.FileInputStream;

public class StreamApp {

	public static void main(String[] args) {

		try {

			// byteStream();
			System.out.print("Informar a letra a ser encontrada: ");
			char letra = (char) System.in.read();
			caracterStream(letra);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void byteStream() throws Exception {

		FileInputStream entrada = new FileInputStream(
				"C:\\Users\\Geraldo\\Documents\\ESTUDOS\\Estudos de JAVA\\UDEMY\\UDEMY\\JAVA2\\2Disciplina\\src\\unidade2\\dados.txt");

		int contador = 0;

		while (entrada.read() != -1) {
			contador++;
		}

		System.out.println("N�mero de caracteres: " + contador);

		entrada.close();

	}

	public static void caracterStream(char letra) throws Exception {

		FileInputStream entrada = new FileInputStream(
				"C:\\Users\\Geraldo\\Documents\\ESTUDOS\\Estudos de JAVA\\UDEMY\\UDEMY\\JAVA2\\2Disciplina\\src\\unidade2\\dados.txt");

		int contador = 0;
		int c;

		while ((c = entrada.read()) != -1) {
			if (c == letra)
				contador++;
		}

		System.out.println("N�mero de vezes que o caracter foi encontrado: " + contador);

		entrada.close();

	}

}