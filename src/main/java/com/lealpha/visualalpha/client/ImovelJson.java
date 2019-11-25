package com.lealpha.visualalpha.client;

import java.util.Base64;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ImovelJson {
	
	@SerializedName("cep")
	private String cep;
	
	@SerializedName("estado")
	private String estado;
	
	@SerializedName("cidade")
	private String cidade;
	
	@SerializedName("bairro")
	private String bairro;
	
	@SerializedName("endereco")
	private String endereco;
	
	@SerializedName("numero")
	private String numero;
	
	@SerializedName("complemento")
	private String complemento;
	
	@SerializedName("quartos")
	private int quartos;
	
	@SerializedName("suites")
	private int suites;
	
	@SerializedName("vagasGaragem")
	private int vagasGaragem;
	
	@SerializedName("areaUtil")
	private int areaUtil;
	
	@SerializedName("areaTotal")
	private int areaTotal;
	
	@SerializedName("descricao")
	private String descricao;
	
	@SerializedName("valorVenda")
	private Float valorVenda;
	
	@SerializedName("valorAluguel")
	private Float valorAluguel;
	
	@SerializedName("idTipoTransacao")
	private Long idTipoTransacao;
	
	@SerializedName("idTipoImovel")
	private Long idTipoImovel;
	
	@SerializedName("idCliente")
    private Long idCliente;
	
	@SerializedName("fotos")
	private Base64 fotos;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getSuites() {
		return suites;
	}

	public void setSuites(int suites) {
		this.suites = suites;
	}

	public int getVagasGaragem() {
		return vagasGaragem;
	}

	public void setVagasGaragem(int vagasGaragem) {
		this.vagasGaragem = vagasGaragem;
	}

	public int getAreaUtil() {
		return areaUtil;
	}

	public void setAreaUtil(int areaUtil) {
		this.areaUtil = areaUtil;
	}

	public int getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(int areaTotal) {
		this.areaTotal = areaTotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public Long getIdTipoTransacao() {
		return idTipoTransacao;
	}

	public void setIdTipoTransacao(Long idTipoTransacao) {
		this.idTipoTransacao = idTipoTransacao;
	}

	public Long getIdTipoImovel() {
		return idTipoImovel;
	}

	public void setIdTipoImovel(Long idTipoImovel) {
		this.idTipoImovel = idTipoImovel;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Base64 getFotos() {
		return fotos;
	}

	public void setFotos(Base64 fotos) {
		this.fotos = fotos;
	}
	
}
