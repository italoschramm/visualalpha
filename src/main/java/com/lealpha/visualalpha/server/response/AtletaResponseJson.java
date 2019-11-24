package com.lealpha.visualalpha.server.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtletaResponseJson {

	@JsonProperty("id")
	 private Long id; 
	
	@JsonProperty("idStrava")
	 private Long idStrava; 
	
	@JsonProperty("firstName")
	 private String firstName;
	 
	 @JsonProperty("lastName")
	 private String lastName;;
	 
	 @JsonProperty("city")
	 private String city;
	 
	 @JsonProperty("state")
	 private String state;
	 
	 @JsonProperty("profile")
	 private String proto;
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProto() {
		return proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
	}

	public Long getIdStrava() {
		return idStrava;
	}

	public void setIdStrava(Long idStrava) {
		this.idStrava = idStrava;
	}

}