package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class UsuarioJson {
	
	@SerializedName("login")
	private String login;
	
	@SerializedName("senha")
	private String senha; 
	
	@SerializedName("ativo")
	private Boolean ativo;
	
	@SerializedName("idCliente")
	private Long idCliente;

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

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
