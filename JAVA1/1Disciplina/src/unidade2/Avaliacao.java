package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {
		
		/*double[] notas = {100, 76.9, 190.45, 46.7, 92.5, 85.3, 99.0, 10.6, -6.5};
		
		for(int i = 0; i < notas.length; i++) {
			
			//intervalo de nota v�lida
			if(notas[i] > 100 || notas[i] < 0) {
				System.out.printf("Aluno %d com nota em intervalo inv�lido = %.2f\n", i+1, notas[i]);
			}
			else {
				System.out.printf("Aluno %d = %.2f ", i+1, notas[i]);
				
				if(notas[i] >= 90)
					System.out.println("Excelente");
				else if(notas[i] >= 70 && notas[i] < 90)
					System.out.println("Bom");
				else if(notas[i] >= 50 && notas[i] < 70)
					System.out.println("Regular");
				else
					System.out.println("Insuficiente");
			}		
			
		}*/
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi a nota?", "Avalia��o", JOptionPane.QUESTION_MESSAGE));
		
		if(nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Informe uma nota no intervalo correto! (0-100)", "Erro", JOptionPane.ERROR_MESSAGE);
			main(null); //recursividade
		}
		else {
			if(nota < 50)
				JOptionPane.showMessageDialog(null, "Conceito: Insuficiente", "Avalia��o", JOptionPane.WARNING_MESSAGE);
			else if(nota < 70)
				JOptionPane.showMessageDialog(null, "Conceito: Regular", "Avalia��o", JOptionPane.INFORMATION_MESSAGE);
			else if(nota < 90)
				JOptionPane.showMessageDialog(null, "Conceito: Bom", "Avalia��o", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Conceito: Excelente", "Avalia��o", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
