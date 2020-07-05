package Inicio;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import menu.Menu;
import menu.Controle;
import cadastros.Cliente;
import cadastros.Profissional;
import cadastros.Telefone;
import cadastros.Endereco;
import cadastros.Animal;


public class Inicio{

public static void main(String[] args) {
	
	
	String nome;
	String cpf;
	String rua;
	String bairro;
	String cidade;
	int num;
	String telefone;
	String raca;
	String genero;
	int idade;
	int controle;
	  
		List<Profissional> profissionais = new ArrayList<Profissional>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		
		
		Menu menu = new Menu();
	
		int op = 1000;
		
		Controle ctl = new Controle();
		while(op != 0) {
			menu.ImprimirMenu();
			op = ctl.opcao();
			
			switch(op) {
			
			case 1:
				System.out.println("Informações sobre o Petsitter");
				nome = ctl.texto();
				System.out.println("Digite o Nome do Petsitter:");
			    nome = ctl.texto();
			    System.out.println("Digite o cpf:");
			    cpf = ctl.texto();
			    
			    System.out.println("Cliente em que esta trabalhando:");
			    String client = ctl.texto();
			    System.out.println("Animal com o qual esta trabalhando:");
			    String petcare = ctl.texto();
			    System.out.println("Digite o numero de telefone:");
			    telefone = ctl.texto();
			    System.out.println("Digite o nome da rua:");
			    rua = ctl.texto();
			    System.out.println("Digite o nome do bairro:");
			    bairro = ctl.texto();
			    System.out.println("Digite o nome da cidade:");
			    cidade = ctl.texto();
			    System.out.println("Digite o numero da casa:");
			    num = ctl.opcao();
			    
		
			    Endereco e = new Endereco(rua, bairro, cidade, num);
			    Telefone t = new Telefone(telefone);
			    Profissional c = new Profissional(nome,cpf,t,e,client,petcare);
			    
			    profissionais.add(c);
			   
			break;
	
			case 2:
		
				System.out.println("Informações do cliente");
				nome = ctl.texto();
				System.out.println("Digite o Nome do Cliente:");
			    nome = ctl.texto();
			    System.out.println("Digite o cpf:");
			    cpf = ctl.texto();
			    
			    System.out.println("Digite o numero de telefone:");
			    telefone = ctl.texto();
			    System.out.println("Digite o nome da rua:");
			    rua = ctl.texto();
			    System.out.println("Digite o nome do bairro:");
			    bairro = ctl.texto();
			    System.out.println("Digite o nome da cidade:");
			    cidade = ctl.texto();
			    System.out.println("Digite o numero da casa:");
			    num = ctl.opcao();
			    List<Animal> animais = new ArrayList<Animal>();
			    for (int x=0;x<4;x++) {
			    	 System.out.println("Informações do pet ");
			    	 raca = ctl.texto();
			    	 System.out.println("Digite a raça do pet:");
			    	 raca = ctl.texto();
			    	 System.out.println("Digite o genero do pet:");
			    	 genero =ctl.texto();
			    	 System.out.println("Digite a idade do pet:");
			    	 idade = ctl.opcao();
			    	 System.out.println("Deseja cadastrar outro pet? \nDigite 1 para sim e 0 para não");
			    	 controle = ctl.opcao();
			    	 Animal a = new Animal(raca,genero,idade);
			    	 animais.add(a);
			    	 if (controle != 1) {
			    		 x=4;
			    	 }
			    	 
			    }
			    
			   
			    Endereco e2 = new Endereco(rua, bairro, cidade, num);
			    Telefone t2 = new Telefone(telefone);
			    Cliente c2 = new Cliente(nome,cpf,t2,e2,animais);
			   
			    clientes.add(c2);
			    
				break;
				
			case 3:
				
				System.out.println("Adicionar pet a um cliente:");
				String cpfdigitado = ctl.texto();
				System.out.println("Digite o cpf do cliente: ");
				cpfdigitado = ctl.texto();
				
				for(Cliente cliente : clientes) { 
					String cpfcliente = cliente.getCpf();
					if ((cliente.animaiscliente).size()<4) {
						if(cpfdigitado.equals(cpfcliente)) {
							System.out.println("Digite a raça do pet:");
							raca = ctl.texto();
							System.out.println("Digite o genero do pet:");
							genero =ctl.texto();
							System.out.println("Digite a idade do pet:");
							idade = ctl.opcao();
							Animal a = new Animal(raca,genero,idade);
							cliente.animaiscliente.add(a); 
						} 
					}
					else {
						System.out.println("Número máximo de pets por cliente");
					}
					}
					
			break;
		
			
			case 4:
				
				System.out.println("Atribuir Petsitter a um cliente");
				String cpfpetsitter = ctl.texto();
				System.out.println("Digite o cpf do Petsitter: ");
				cpfpetsitter = ctl.texto();
				for(Profissional sitt : profissionais) { 
					String cpfbusca = sitt.getCpf();
					if (cpfpetsitter.equals(cpfbusca)) {
						System.out.println("Digite o cliente que o Petsitter esta trabalhando:");
						sitt.setCliente(ctl.texto());
						System.out.println("Digite o pet que o Petsitter irá cuidar");
						sitt.setAnimal(ctl.texto());
						}}
				
			case 5:
				
				while(op != 0) {
					menu.ImprimirRelatorios();
					op = ctl.opcao();
					switch(op) {
					case 1:
						
						int contf=0,contm =0;
						for(Cliente s : clientes) {
							for (String k : s.imprimiranimal()) {
								
							
							   if( k.contains("femea")) {
								   contf=contf+1;
								   System.out.println(s+"femea"+contf);
							   }
							   
							   else if (k.contains("macho")) {
								   contm= contm+1;
								   System.out.println(s+"macho"+contm);
							   }
							   }
						}
							if (contf>contm) {
								System.out.println("O genero preferido pelos clientes é Femea");
								
							}
							else {
								System.out.println("O genero preferido pelos clientes é Macho");
							}
						
						
				
						break;
						
						
					case 2:
						
						List<String> todasracas = new ArrayList<String>();
						for(Cliente l: clientes) {
							for (String p : l.QuantRaca()) {
								todasracas.add(p);
								
															
							}												
							}
						
						
						
						Map<String, Integer> map = new TreeMap<String, Integer>();

						for (String contaraca : todasracas) {
						Integer count = map.get(contaraca);
						if (count == null)
						count = 0;
						map.put(contaraca, count+1);
						}
						
						
						final Map<String, Integer> racasordenadas = map.entrySet()
						        .stream()
						        .sorted(Map.Entry.comparingByValue())
						        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e3) -> e1, LinkedHashMap::new));

					
						
						int contador = racasordenadas.size();
						
						for (String ordem : racasordenadas.keySet()) {
							contador = contador -1;
							if (contador<10) {
								System.out.printf("A %s ª raça preferida dos nosso clientes é %s com %s pets:\n ",contador+1,ordem,racasordenadas.get(ordem));
								
							}
							
							
						}
									
						
						
						
						
						break;
						
					case 3:
						
						menu.ImprimirMenu();
					
					
					
					
						break;
						
					case 4:
						
						System.out.println("################### Informações Petsitters ######################");
						
						for (Profissional prof:profissionais) {
							prof.imprimir();
						}
						
						System.out.println(" ############## fim das informações #####################");
						
						System.out.println("################### Informações Clientes ######################");
						for (Cliente cts : clientes) {
							cts.imprimir();	
							
						}
						System.out.println(" ############## fim das informações #####################");
						break;
						
				
					
					
					case 5:
						
						for (Profissional prof:profissionais) {
							System.out.println("Nome do Funcinonário: "+prof.getNome());
							System.out.println("Cliente atendido: "+prof.getCliente());
							System.out.println("Animal atendido: "+prof.getAnimal());
						}
						
						
						
						break;
					
					
					}
				
				
				break;
		}
	}
		
		

		
}
}}
