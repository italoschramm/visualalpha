package com.lealpha.visualalpha.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtividadesRequestJson {
	
	@JsonProperty("idAtleta")
	private Long idAtleta;
	
	@JsonProperty("idStrava")
	private Long idStrava;
	
	@JsonProperty("tokenStrava")
	private String token;

	public Long getIdStrava() {
		return idStrava;
	}

	public void setIdStrava(Long idStrava) {
		this.idStrava = idStrava;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getIdAtleta() {
		return idAtleta;
	}

	public void setIdAtleta(Long idAtleta) {
		this.idAtleta = idAtleta;
	}

}