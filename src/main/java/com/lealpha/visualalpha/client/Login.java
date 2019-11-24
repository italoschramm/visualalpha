package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class Login {
	
	 @SerializedName("login")
	 private String login;
	 
	 @SerializedName("senha")
	 private String senha;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
