package unidade1;

import java.io.IOException;

public class TesteLeitura {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[10];
		
		System.out.print("Digite algo: ");
		try {
			//Checked exception
			System.in.read(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("\nEco: " + new String(bytes));

	}

}
