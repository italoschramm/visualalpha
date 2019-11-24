package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class ClienteJson {
	
	@SerializedName("idUsuario")
	private Long idUsuario;
	
	@SerializedName("email")
    private String email;
	
	@SerializedName("nome")
    private String nome;
	
	@SerializedName("sobrenome")
    private String sobrenome;

	@SerializedName("cpf")
    private String cpf;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
