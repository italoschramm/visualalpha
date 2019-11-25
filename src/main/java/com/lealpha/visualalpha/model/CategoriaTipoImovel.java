package com.lealpha.visualalpha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIATIPOIMOVEL")
public class CategoriaTipoImovel {
	
	@Id
	@Column(name = "IDCATEGORIATIPOIMOVEL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CATEGORIATIPOIMOVEL")
	@SequenceGenerator(name="SEQ_CATEGORIATIPOIMOVEL", sequenceName="SEQ_CATEGORIATIPOIMOVEL")
	private long id;

	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@ManyToOne
	@JoinColumn(name="idtipoimovel", nullable = false)
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
