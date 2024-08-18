package com.activiza.backendActiviza.security;

import lombok.Data;

@Data
public class AuthCredentials {
	private String email;
	private String password;
	
	public AuthCredentials() {

	}
	
	public AuthCredentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
