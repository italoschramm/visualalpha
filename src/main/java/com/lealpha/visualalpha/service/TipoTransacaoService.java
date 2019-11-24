package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.model.TipoTransacao;

public interface TipoTransacaoService {

	public Boolean cadastrarTipoTransacao(String descricao, Boolean ativo);
	
	public List<TipoTransacao> listarAtivos();
	
	public List<TipoTransacao> listarInativos();
}
