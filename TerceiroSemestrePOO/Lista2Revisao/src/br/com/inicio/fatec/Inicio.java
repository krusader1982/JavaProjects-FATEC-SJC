package br.com.inicio.fatec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.controle.fatec.Controle;
import br.com.controle.fatec.Menu;

public class Inicio{

public static void main(String[] args) {
	  
		List<Cliente> clientes = new ArrayList<Cliente>();
		Menu menu = new Menu();
		Scanner ctl = new Scanner(System.in);
		int op = 1000;
		
		while(op != 0) {
			menu.imprimirMenu();
			op = ctl.nextInt();
			switch(op) {
			
			case 1:
				
				System.out.print("Data revisão:");
				String data = ctl.next();
				System.out.print("Nome:");
				String nome = ctl.next();
				System.out.print("CPF:");
				String cpf = ctl.next();
				System.out.print("Telefone:");
				String telefone = ctl.next();
				System.out.println("Endereço");
				System.out.print("Rua:");
				String rua = ctl.next();
				System.out.print("Número:");
				String numero = ctl.next();
				System.out.print("Bairro:");
				String bairro = ctl.next();
				System.out.print("Cidade:");
				String cidade = ctl.next();
			    System.out.println("Carro");
		        System.out.print("Placa:");
		        String placa = ctl.next();
			    System.out.print("Ano:");
			    String ano = ctl.next();
			    System.out.print("Modelo:");
			    String modelo = ctl.next();
				System.out.print("Valor:");
				String valor = ctl.next();
			    
			    Cliente c = new Cliente(data, nome, cpf, telefone, rua, numero, bairro, cidade, placa, ano, modelo, valor);
			    
			    clientes.add(c);
			   
			break;
	
			case 2:
				
				if(clientes.isEmpty()){
		              System.out.println("Não existem revisões");
		              ctl.nextLine();
		              
		            } else {
		            	for (Cliente cliente : clientes) {
		            		cliente.imprimir();
		            	}
		              }
				break;
				
			case 3:
				System.out.println("Alterar data da revisão:");
				System.out.print("Digite a placa: ");
				String placaDigitada = ctl.next();
				for(Cliente cliente : clientes) { 
					String placaCarro = cliente.getPlaca();
					if(placaDigitada.equals(placaCarro)) {
						System.out.println("Nova data:");
						String dataNova = ctl.next();
						cliente.setData(dataNova); 
						} 
					}
			break;
			
			case 4:
				System.out.println("Cancelar revisão");
				System.out.print("Digite a placa: ");
				String placaCancelar = ctl.next();
				for(Cliente cliente : clientes) {
					String placaCarro = cliente.getPlaca();
					if(placaCancelar.equals(placaCarro)) {
						System.out.println("Revisão alterada para cancelado");
						String mensagem = ("!!!!!!! CANCELADO !!!!!!!");
						cliente.setData(mensagem);
					}
				}
				break;
					
				default:
					menu.imprimirMenu();
					break;
			}
		}
	}
}
