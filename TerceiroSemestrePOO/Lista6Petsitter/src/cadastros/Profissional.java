package cadastros;

import cadastros.Endereco;
import cadastros.Telefone;

public class Profissional {
	
		private String nome;
		private String cpf;
		public Telefone telefone;
		public Endereco endereco;
		public String cliente;
		public String animal;
		
		public Profissional(String nome,String cpf, Telefone telefone, Endereco endereco, String cliente, String animal) {
			this.cpf=cpf;
			this.nome = nome;
			this.telefone = telefone;
			this.endereco = endereco;
			this.cliente = cliente;
			this.animal = animal;
					
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public void imprimir() {
			System.out.println("Nome: "+nome);
			System.out.println("CPF: "+cpf);
			endereco.imprimirEnd();
			telefone.imprimirTel();
			System.out.println("Trabalhando no cliente: "+cliente);
			System.out.println("Trabalhando com o pet: "+animal);
		
		
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getAnimal() {
			return animal;
		}

		public void setAnimal(String animal) {
			this.animal = animal;
		}
		
	}

