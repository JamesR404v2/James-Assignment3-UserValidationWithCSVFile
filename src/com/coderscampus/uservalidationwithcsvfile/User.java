package com.coderscampus.uservalidationwithcsvfile;

// this is a User POJO

public class User {
    private String username; // which are email addresses. 
	private String password;
	private String name; 
	
	public void LoadUser(String[] input) {
		this.username = input[0];
		this.password = input[1];
		this.name = input[2];
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
