package com.lealpha.visualalpha.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutenticaRequestJson {
	
    @JsonProperty("tokenStrava")
    private String tokenStrava;

	public String getTokenStrava() {
		return tokenStrava;
	}

	public void setTokenStrava(String tokenStrava) {
		this.tokenStrava = tokenStrava;
	}
    
}