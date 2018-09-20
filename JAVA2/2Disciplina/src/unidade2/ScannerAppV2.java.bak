package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppV2 {

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(new FileReader("C:\\Users\\Geraldo\\Documents\\ESTUDOS\\Estudos de JAVA\\UDEMY\\UDEMY\\JAVA2\\2Disciplina\\src\\unidade2\\numeros.txt"));
			
			double soma = 0;			
			
			while(input.hasNext()) {				
				soma += Double.parseDouble(input.next());
			}
			
			input.close();
			
			JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
