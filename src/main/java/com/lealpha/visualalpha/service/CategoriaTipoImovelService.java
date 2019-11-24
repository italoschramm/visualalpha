package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.model.CategoriaTipoImovel;

public interface CategoriaTipoImovelService {

	public Boolean cadastrarCategoriaTipoImovel(String descricao, Boolean ativo, Long idTipoImovel);
	
	public List<CategoriaTipoImovel> listarAtivos();
	
	public List<CategoriaTipoImovel> listarInativos();
}
