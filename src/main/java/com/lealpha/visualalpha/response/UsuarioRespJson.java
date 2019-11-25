package com.lealpha.visualalpha.response;

import com.google.gson.annotations.SerializedName;
import com.lealpha.visualalpha.model.Usuario;

public class UsuarioRespJson {

	public UsuarioRespJson(Usuario usuario) {
		this.idUsuario = usuario.getId();
		this.login = usuario.getLogin();
		this.senha = usuario.getSenha();
		this.ativo = usuario.getAtivo();
	}
	
	@SerializedName("idUsuario")
	private Long idUsuario;
	
	@SerializedName("login")
	private String login;
	
	@SerializedName("senha")
	private String senha; 
	
	@SerializedName("ativo")
	private Boolean ativo;

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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

}
