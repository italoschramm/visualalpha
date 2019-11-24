package com.lealpha.visualalpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.exception.AutenticacaoException;
import com.lealpha.visualalpha.model.TipoTransacao;
import com.lealpha.visualalpha.repository.TipoTransacaoRepository;

@Service
public class TipoTransacaoServiceImpl implements TipoTransacaoService{

	@Autowired
	private TipoTransacaoRepository tipoTransacaoRepository;

	@Override
	public Boolean cadastrarTipoTransacao(String descricao) {
		TipoTransacao tipo = new TipoTransacao();
		tipo.setDescricao(descricao);
		try {
			tipoTransacaoRepository.save(tipo);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
}
