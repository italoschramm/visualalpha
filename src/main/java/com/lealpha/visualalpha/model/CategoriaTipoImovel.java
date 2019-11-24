package com.lealpha.visualalpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIATIPOIMOVEL")
public class CategoriaTipoImovel {
	
	@Id
	@GeneratedValue
	@Column(name = "IDCATEGORIATIPOIMOVEL")
	private long id;

	@Column(name="DESCRICAO")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="IDTIPOIMOVEL")
    private TipoImovel tipoImovel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	
}
