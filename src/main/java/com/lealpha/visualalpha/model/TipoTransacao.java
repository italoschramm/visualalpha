package com.lealpha.visualalpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TIPOTRANSACAO")
public class TipoTransacao {

	@Id
	@GeneratedValue
	@Column(name="IDTIPOTRANSACAO")
	private long id;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@OneToOne(mappedBy = "tipoTransacao")
    private Imovel imovel;

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

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
}
