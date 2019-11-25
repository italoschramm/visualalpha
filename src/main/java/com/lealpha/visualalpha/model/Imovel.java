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
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "imovel", cascade = CascadeType.ALL)
	private TipoImovel tipoImovel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcliente", nullable = false)
    private Cliente cliente;
	
	@Column(name="FOTOS")
	private String fotos;
	
	
}
