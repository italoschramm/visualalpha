package com.lealpha.visualalpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.exception.BuscaException;
import com.lealpha.visualalpha.model.CategoriaTipoImovel;
import com.lealpha.visualalpha.model.TipoImovel;
import com.lealpha.visualalpha.repository.CategoriaTipoImovelRepository;
import com.lealpha.visualalpha.repository.TipoImovelRepository;

@Service
public class CategoriaTipoImovelServiceImpl implements CategoriaTipoImovelService{

	@Autowired
	private CategoriaTipoImovelRepository categoriaTipoImovelRepository;
	
	@Autowired
	private TipoImovelRepository tipoImovelRepository;
	
	@Override
	public Boolean cadastrarCategoriaTipoImovel(String descricao, Boolean ativo, Long idTipoImovel) {
		TipoImovel tipoImovel = tipoImovelRepository.findById(idTipoImovel).orElse(null);
		if(tipoImovel == null)
			throw new BuscaException("Tipo imóvel não localizado!" );
		
		CategoriaTipoImovel categoriaTipoImovel = new CategoriaTipoImovel();
		categoriaTipoImovel.setDescricao(descricao);
		categoriaTipoImovel.setAtivo(ativo);
		categoriaTipoImovel.setTipoImovel(tipoImovel);
		try {
			categoriaTipoImovelRepository.save(categoriaTipoImovel);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public List<CategoriaTipoImovel> listarAtivos() {
		List<CategoriaTipoImovel> listaCategoriaImovelTransacao = categoriaTipoImovelRepository.findByAtivos();
		return listaCategoriaImovelTransacao;
	}

	@Override
	public List<CategoriaTipoImovel> listarInativos() {
		List<CategoriaTipoImovel> listaCategoriaTipoImovel = categoriaTipoImovelRepository.findByInativos();
		return listaCategoriaTipoImovel;
	}

}
