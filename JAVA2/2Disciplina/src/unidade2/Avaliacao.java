package unidade2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Avaliacao extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		
		String notas = JOptionPane.showInputDialog("Informe a nota: ");
		double nota = Double.parseDouble(notas);
		
		if(nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Nota inválida! Informe uma nota no intervalo correto [0-100]", "ERRO", JOptionPane.ERROR_MESSAGE);
			paint(null);
		}else {
			if(nota < 50)
				JOptionPane.showMessageDialog(null, "Insuficiente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			else if(nota < 70)
				JOptionPane.showMessageDialog(null, "Regular", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			else if(nota < 90)
				JOptionPane.showMessageDialog(null, "Bom", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Excelente", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
		
	}

}
