package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral {

	public static void main(String[] args) {
		
		//Toda a estrutura foi ideia minha XD
		
		double total = 0.0;
		
		String[] meses = {"Janeiro","Fevereiro","Março"};
		
		for(int i = 0; i < meses.length; i++)
			total += Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o faturamento de " + meses[i] + " ?", "Faturamento", JOptionPane.QUESTION_MESSAGE));
		
		JOptionPane.showMessageDialog(null, "Faturamento dos meses: " + total, "Faturamento Total", JOptionPane.INFORMATION_MESSAGE);

	}

}
