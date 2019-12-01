package com.lealpha.visualalpha.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMOVEL")
public class Imovel {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_IMOVEL")
	@SequenceGenerator(name="SEQ_IMOVEL", sequenceName="SEQ_IMOVEL")
	@Column(name = "IDIMOVEL")
	private long id;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="CIDADE")
	private String cidade;
	
	@Column(name="BAIRRO")
	private String bairro;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="NUMERO")
	private String numero;
	
	@Column(name="COMPLEMENTO")
	private String complemento;
	
	@Column(name="QUARTOS")
	private int quartos;
	
	@Column(name="SUITES")
	private int suites;
	
	@Column(name="VAGASGARAGEM")
	private int vagasGaragem;
	
	@Column(name="AREAUTIL")
	private int areaUtil;
	
	@Column(name="AREATOTAL")
	private int areaTotal;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="VALORVENDA")
	private Float valorVenda;
	
	@Column(name="VALORALUGUEL")
	private Float valorAluguel;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoTransacao", referencedColumnName = "IDTIPOTRANSACAO")
	private TipoTransacao tipoTransacao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tipoImovel", referencedColumnName = "IDTIPOIMOVEL")
	private TipoImovel tipoImovel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcliente", nullable = false)
    private Cliente cliente;
	
	@Column(name="FOTOS")
	private String fotos;
	
	@Column(name="ATIVO")
	private boolean ativo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public TipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(TipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
