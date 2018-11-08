//https://www.devmedia.com.br/java-socket-entendendo-a-classe-socket-e-a-serversocket-em-detalhes/31894

//Esta classe deve ser iniciada primeiro

package br.com.loginremoto.util;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(3322);
			System.out.println("Servidor iniciado na porta 3322");
			
			Socket cliente = server.accept();
			System.out.println("Cliente conectado do IP " + cliente.getInetAddress().getHostAddress());
			Scanner entrada = new Scanner(cliente.getInputStream());
			
			while(entrada.hasNextLine()) {
				System.out.println(entrada.nextLine());
			}
			
			entrada.close();
			server.close();
			
		} catch (IOException e) {
			Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
		}

	}

}
