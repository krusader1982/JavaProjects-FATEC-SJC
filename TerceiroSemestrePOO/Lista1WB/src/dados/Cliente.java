package dados;

public class Cliente {
	public int id;
	public int dia;
	public int mes;
	public int ano;
	public int idade;
	public String nome;
	public String genero;
	public String telefone;
	public String servico;

	public Cliente(int id, int dia, int mes, int ano, int idade, String nome, String genero, String telefone, String servico) {
		this.id = id;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.idade = idade;
		this.nome = nome;
		this.genero = genero;
		this.telefone = telefone;
		this.servico = servico;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	@Override
	public String toString() {
		String p = "\n";
		p = p + "ID: " + id + "\n";
		p = p + "Nome: " + nome + "\n";
		p = p + "Data de Nascimento: " + dia + "/" + mes + "/" + ano + "\n";
		p = p + "Idade: " + idade + "\n";
		p = p + "Gênero: " + genero + "\n";
		p = p + "Telefone: " + telefone + "\n";
		p = p + "Serviço: " + servico + "\n";
		return p;
	}
}
