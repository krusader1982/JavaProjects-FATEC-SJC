package cadastros;

public class Animal {

		private String raca;
		private String genero;
		private int idade;
		
		public Animal(String raca, String genero, int idade) {
			
			this.raca = raca;
			this.genero = genero;
			this.idade = idade;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void imprimirPet() {
			System.out.println("Raça: "+raca);
			System.out.println("Genero: "+genero);
			System.out.println("Idade: "+idade);
		}
		
}
