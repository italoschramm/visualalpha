package com.lealpha.visualalpha.response;

import com.google.gson.annotations.SerializedName;
import com.lealpha.visualalpha.model.Cliente;

public class ClienteRespJson {
	
	public ClienteRespJson(Cliente cliente) {
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.idCliente = cliente.getId();
		this.idUsuario = cliente.getUsuario().getId();
		this.nome = cliente.getNome();
		this.sobrenome = cliente.getSobrenome();
	}
		
	@SerializedName("idCliente")
	private Long idCliente;
	
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

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

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
