package br.org.fatec.inicio;

import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) throws Exception {

		// ip = 192.168...
				Cliente c = new Cliente("127.0.0.1", 3000);
				//Cliente2 c2 = new Cliente2("127.0.0.1", 3000);
				Scanner entrada = new Scanner(System.in);
				
				// Informa texto e chave de criptografia
				System.out.println("*************************************************");
			    System.out.print("Informe o texto a ser criptografado: ");
			    String texto = entrada.nextLine();
			       
			       /** Variável do tipo inteiro para a criptografia
			        */
			       int chave = 3;
			       
			       /**
			        * Pergunta ao usuário a chave de deslocamento
			        * Descomentar as 2 linhas abaixo
			        */
			      // System.out.print("Informe a chave de deslocamento: ");
			      // int chave = entrada.nextInt();
			       
			    // Criptografando
			       String textoCriptografado = Cliente.encriptar(chave, texto);
			       // Descriptografando
			       String textoDescriptografado = Cliente.decriptar(chave, textoCriptografado);
			       
				entrada.close();
				c.enviar(textoCriptografado);
				//c2.enviar(textoDescriptografado);
				
				System.out.println("*************************************");
				System.out.println("Mensagem enviada pelo cliente 1: " + textoCriptografado);
				System.out.println("Mensagem recebida pelo cliente 2: " + textoDescriptografado);
			}
}
