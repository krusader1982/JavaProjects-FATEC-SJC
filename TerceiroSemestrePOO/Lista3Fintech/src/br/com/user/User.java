package br.com.user;

import br.com.utilities.IdImplementation;
import br.com.utilities.Authentication;

public class User extends IdImplementation {
	private Authentication auth;
	private String name;
	private String phone;
	private Address address;
	
	public User(Authentication auth, String name, String phone, Address address) {
		super();
		this.auth = auth;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Authentication getAuth() {
		return auth;
	}

	public void setAuth(Authentication auth) {
		this.auth = auth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
