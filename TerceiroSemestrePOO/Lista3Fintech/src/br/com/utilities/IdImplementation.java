package br.com.utilities;

import java.util.Date; 

public class IdImplementation {
	public long id;

	public IdImplementation() {
		Date idTime = new Date();
		this.id = idTime.getTime();
	}	
}
