import java.util.ArrayList;

import br.com.cash.*;
import br.com.user.*;
import br.com.utilities.*;

public class App {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<CashFlow> cashFlows = new ArrayList<CashFlow>();

		AsciiArt.printAsciiArt("FINTECH");
		Menu menu = new Menu();
		int op = 1000;

		while (op != 0) {
			menu.printMainMenu();
			Control ctl = new Control();
			op = ctl.option();

			switch (op) {
			case 1:
				User newUser = registerUser();
				users.add(newUser);
				break;
				
			case 2:
				Authentication login  = loginUser();
				for (User user: users) {
					boolean isAuthenticated = user.getAuth().compareTo(login);
					if (isAuthenticated) {
						
					}
				}

				break;
				
			default:
				menu.printMainMenu();
				break;
			}
		}

	}

	public static User registerUser() {
		Control ctl = new Control();

		System.out.println("Entre com as seguintes informa��es");

		ctl = new Control();
		System.out.println("Nome: ");
		String name = ctl.text();

		ctl = new Control();
		System.out.println("Email: ");
		String email = ctl.text();

		System.out.println("Por favor, insira seu endere�o completo");

		ctl = new Control();
		System.out.println("Cidade: ");
		String city = ctl.text();

		ctl = new Control();
		System.out.println("Bairro: ");
		String neighborhood = ctl.text();

		ctl = new Control();
		System.out.println("Rua: ");
		String street = ctl.text();

		ctl = new Control();
		System.out.println("N�mero da casa: ");
		int number = ctl.number();

		System.out.println("Insira suas credenciais para logar em nosso sistema!");

		ctl = new Control();
		System.out.println("Nome de usu�rio: ");
		String username = ctl.text();

		ctl = new Control();
		System.out.println("Senha: ");
		String password = ctl.text();

		Authentication auth = new Authentication(username, password);
		Address address = new Address(city, neighborhood, street, number);
		User user = new User(auth, name, email, address);

		return user;
	}

	public static Authentication loginUser() {
		Control ctl = new Control();

		System.out.println("Bem-vindo a FINTECH!");

		ctl = new Control();
		System.out.println("Digite seu usu�rio: ");
		String registeredUsername = ctl.text();
		
		ctl = new Control();
		System.out.println("Digite sua senha: ");
		String registeredPassword = ctl.text();
		
		Authentication authLogin = new Authentication(registeredUsername, registeredPassword); 
		
		return authLogin;
	}

}
