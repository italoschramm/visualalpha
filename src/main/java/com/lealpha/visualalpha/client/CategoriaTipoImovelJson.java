package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class CategoriaTipoImovelJson {

	@SerializedName("descricao")
	private String descricao;

	@SerializedName("ativo")
	private Boolean ativo;
	
	@SerializedName("idTipoImovel")
	private Long idTipoImovel;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Long getIdTipoImovel() {
		return idTipoImovel;
	}

	public void setIdTipoImovel(Long idTipoImovel) {
		this.idTipoImovel = idTipoImovel;
	}	
}
