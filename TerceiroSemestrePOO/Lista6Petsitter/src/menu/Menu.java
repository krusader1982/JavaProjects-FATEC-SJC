package menu;

public class Menu {
	
	public void ImprimirMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Cadastrar Petsitter!");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Adicionar pet a um cliente");
		System.out.println("4 - Atribuir Petsitter a um cliente");
		System.out.println("5 - Menu de relatórios");
		System.out.println("0 - Sair");
	}
	
	public void ImprimirRelatorios() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Gerar relatório de genêro preferido");
		System.out.println("2 - Gerar relatório de raças mais comuns");
		System.out.println("3 - Voltar para o menu anterior");
		System.out.println("4 - Imprimir todos os clientes e petsitter's");
		System.out.println("5 - Relatório de alocação dos petsitter's");
		System.out.println("0 - Sair");
	}
}