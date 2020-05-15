package br.com.utilities;

import br.com.user.User;

public class Authentication {
	public String username;
	public String password;
	
	public Authentication(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public boolean compareTo(Authentication auth) {
		String authUsername = auth.username;
		String authPassword = auth.password;
		boolean isAuthenticated = username.equals(authUsername) && password.equals(authPassword);
		
		if (isAuthenticated) {
			return true;
		} else {
			return false;
		}
	}
	
}
