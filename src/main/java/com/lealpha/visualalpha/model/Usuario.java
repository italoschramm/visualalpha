package com.lealpha.visualalpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "IDUSUARIO")
	private long id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha; 
	
	@OneToOne(mappedBy = "usuario")
	private Cliente cliente;

}
