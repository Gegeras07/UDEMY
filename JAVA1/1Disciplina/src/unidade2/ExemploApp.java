package unidade2;

import javax.swing.JOptionPane;

public class ExemploApp {

	public static void main(String[] args) {		
		
		//Fazer com o looping foi ideia minha XD
		/*for(int i = 1; i <= 4; i++)
			System.out.println("Mensagem " + i);*/
		
		//Adicionar os outros parâmetros no JOptionPane e o looping foi ideia minha XD
		for(int i = 1; i <= 4; i++)
			JOptionPane.showMessageDialog(null, "Ola huehuebrbr. Mensagem " + i, "Bem-vindo ao básico, pato!", JOptionPane.INFORMATION_MESSAGE);
	}

}