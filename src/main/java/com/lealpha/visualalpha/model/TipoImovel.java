package com.lealpha.visualalpha.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TIPOIMOVEL")
public class TipoImovel {

	@Id
	@GeneratedValue
	@Column(name = "IDTIPOIMOVEL")
	private long id;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@OneToMany(mappedBy = "tipoImovel", targetEntity = CategoriaTipoImovel.class, 
			fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CategoriaTipoImovel> categoriaTipoImovel;
	
	@OneToOne(mappedBy = "tipoImovel")
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

	public List<CategoriaTipoImovel> getCategoriaTipoImovel() {
		return categoriaTipoImovel;
	}

	public void setCategoriaTipoImovel(List<CategoriaTipoImovel> categoriaTipoImovel) {
		this.categoriaTipoImovel = categoriaTipoImovel;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
