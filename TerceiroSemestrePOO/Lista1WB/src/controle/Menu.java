package controle;

public class Menu {
		public void imprimirMenu() {
			System.out.println("\n##### MENU #####\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Editar cadastro");
			System.out.println("3 - Remover cadastro");
			System.out.println("4 - Listar em ordem alfabética");
			System.out.println("5 - Listar por gênero");
			System.out.println("6 - Lista de consumo por cliente");
			System.out.println("7 - Relatório");
			System.out.println("0 - Sair");
		}
		
		public void edCadastro() {
			System.out.println("\n#### MENU DE EDIÇÃO ####\n");
			System.out.println("1 - Editar nome");
			System.out.println("2 - Editar data de nascimento");
			System.out.println("3 - Editar gênero");
			System.out.println("4 - Editar telefone");
			System.out.println("0 - Voltar\n");
		}
}
