package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class TipoTransacaoJson {
	 
	@SerializedName("descricao")
	private String descricao;

	@SerializedName("ativo")
	private Boolean ativo;
	
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
	 
}
