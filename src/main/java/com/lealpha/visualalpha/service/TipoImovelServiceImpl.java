package com.lealpha.visualalpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.model.TipoImovel;
import com.lealpha.visualalpha.repository.TipoImovelRepository;

@Service
public class TipoImovelServiceImpl implements TipoImovelService{

	@Autowired
	private TipoImovelRepository tipoImovelRepository;
	
	public Boolean cadastrarTipoImovel(String descricao, Boolean ativo) {
		TipoImovel tipo = new TipoImovel();
		tipo.setDescricao(descricao);
		tipo.setAtivo(ativo);
		try {
			tipoImovelRepository.save(tipo);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public List<TipoImovel> listarAtivos() {
		List<TipoImovel> listaImovelTransacao = tipoImovelRepository.findByAtivos();
		return listaImovelTransacao;
	}

	@Override
	public List<TipoImovel> listarInativos() {
		List<TipoImovel> listaImovelTransacao = tipoImovelRepository.findByInativos();
		return listaImovelTransacao;
	}
	
}
