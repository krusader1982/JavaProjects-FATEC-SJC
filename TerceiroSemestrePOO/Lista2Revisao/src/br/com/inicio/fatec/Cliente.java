package br.com.inicio.fatec;

public class Cliente {

	  public String nome;
	  public String cpf;
	  public String telefone;
	  
	  public String rua;
	  public String numero;
	  public String bairro;
	  public String cidade;
	  
	  public String data;
	
	  public String placa;
	  public String ano;
	  public String modelo;
	  public String valor;
	 
	  public Cliente(String data, String nome, String cpf,String telefone, String rua, String numero, 
			  String bairro, String cidade ,String placa, String ano, String modelo, String valor) { 
		  
		    this.data = data;
			this.nome = nome;
			this.cpf = cpf;
			this.telefone = telefone;
			this.rua = rua;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.placa = placa;
			this.ano = ano;
			this.modelo = modelo;
			this.valor = valor;
			
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



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public String getAno() {
		return ano;
	}



	public void setAno(String ano) {
		this.ano = ano;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}



	public void imprimir() {
		  System.out.println("-------------Clientes-------------");
		  System.out.println("Data da revisão: " + data);
		  System.out.println("Nome: " + getNome());
		  System.out.println("CPF: " + getCpf());
		  System.out.println("Telefone: " + getTelefone());
		  System.out.println("Rua: " + getRua());
		  System.out.println("Numero: " + getRua());
		  System.out.println("Bairro: " + getBairro());
		  System.out.println("Cidade: " + getCidade());
		  System.out.println("Placa: " + getPlaca());
		  System.out.println("Ano: " + getAno());
		  System.out.println("Modelo: " + getModelo());
		  System.out.println("Valor: " + getValor());
		  System.out.println("---------------------------------------");
		  
	  }
	  
	}
