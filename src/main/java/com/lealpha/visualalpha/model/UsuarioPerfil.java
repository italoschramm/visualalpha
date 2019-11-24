package com.lealpha.visualalpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOPERFIL")
public class UsuarioPerfil {
	
	@Id
	@GeneratedValue
	@Column(name = "IDPERFIL")
	private long id;

}
