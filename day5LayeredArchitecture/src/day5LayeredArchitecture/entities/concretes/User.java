package day5LayeredArchitecture.entities.concretes;

import day5LayeredArchitecture.entities.abstracts.Entities;

public class User implements Entities {
	private int id;
	private String fisrtName;
	private String lastName;
	private String email;
	private String password;
	
	
public User() {
	
}


public User(int id, String fisrtName, String lastName, String email, String password) {
	super();
	this.id = id;
	this.fisrtName = fisrtName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}




public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFisrtName() {
	return fisrtName;
}


public void setFisrtName(String fisrtName) {
	this.fisrtName = fisrtName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}

	
	
	

}
