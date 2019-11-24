package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.model.TipoImovel;

public interface TipoImovelService {

	public Boolean cadastrarTipoImovel(String descricao, Boolean ativo);
	
	public List<TipoImovel> listarAtivos();
	
	public List<TipoImovel> listarInativos();
}
