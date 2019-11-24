package com.lealpha.visualalpha.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Imovel {

	@Id
	@GeneratedValue
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
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoTransacao", referencedColumnName = "IDTIPOTRANSACAO")
	private TipoTransacao tipoTransacao;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoImovel", referencedColumnName = "IDTIPOIMOVEL")
	private TipoImovel tipoImovel;
	
	@ManyToOne
	@JoinColumn(name="idcliente")
    private Cliente cliente;
	
	@Column(name="FOTOS")
	private String fotos;
}
