package com.lealpha.visualalpha.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@OneToMany
	@JoinColumn(name="idimovel")
    private List<Imovel> imovel;

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

	public List<Imovel> getImovel() {
		return imovel;
	}

	public void setImovel(List<Imovel> imovel) {
		this.imovel = imovel;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
