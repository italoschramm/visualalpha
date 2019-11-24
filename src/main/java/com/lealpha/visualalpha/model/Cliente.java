package com.lealpha.visualalpha.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "IDCLIENTE")
	private long id;
	
	@OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "IDUSUARIO")
	private Usuario usuario;
	
	@Column(name="EMAIL")
    private String email;
	
	@Column(name="NOME")
    private String nome;
	
	@Column(name="SOBRENOME")
    private String sobrenome;

	@Column(name="CPF")
    private int cpf;
	
	@OneToMany(mappedBy = "cliente", targetEntity = Imovel.class, 
			fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Imovel> imovel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public List<Imovel> getImovel() {
		return imovel;
	}

	public void setImovel(List<Imovel> imovel) {
		this.imovel = imovel;
	}
	
	
}
