package com.lealpha.visualalpha.client;

import com.google.gson.annotations.SerializedName;

public class FotoJson {

	@SerializedName("foto")
	private String foto;

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
