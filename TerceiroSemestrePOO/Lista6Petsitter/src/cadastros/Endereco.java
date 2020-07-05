package cadastros;

public class Endereco {
	public String rua;
	public String bairro;
	public String cidade;
	public int num;
	
	public Endereco(String rua, String bairro, String cidade, int num) {
		
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.num = num;
	}
	
	public void imprimirEnd() {
		
		System.out.println("Rua: "+rua);
		System.out.println("Bairro: "+bairro);
		System.out.println("Cidade: "+cidade);
		System.out.println("Numero: "+num);
	}

}
