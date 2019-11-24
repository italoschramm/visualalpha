package com.lealpha.visualalpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.model.TipoTransacao;
import com.lealpha.visualalpha.repository.TipoTransacaoRepository;

@Service
public class TipoTransacaoServiceImpl implements TipoTransacaoService{

	@Autowired
	private TipoTransacaoRepository tipoTransacaoRepository;

	@Override
	public Boolean cadastrarTipoTransacao(String descricao, Boolean ativo) {
		TipoTransacao tipo = new TipoTransacao();
		tipo.setDescricao(descricao);
		tipo.setAtivo(ativo);
		try {
			tipoTransacaoRepository.save(tipo);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<TipoTransacao> listarAtivos() {
		List<TipoTransacao> listaTipoTransacao = tipoTransacaoRepository.findByAtivos();
		return listaTipoTransacao;
	}

	@Override
	public List<TipoTransacao> listarInativos() {
		List<TipoTransacao> listaTipoTransacao = tipoTransacaoRepository.findByInativos();
		return listaTipoTransacao;
	}
	
	
}
