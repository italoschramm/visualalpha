package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.TipoTransacaoJson;
import com.lealpha.visualalpha.exception.SalvarException;
import com.lealpha.visualalpha.model.TipoTransacao;
import com.lealpha.visualalpha.service.TipoTransacaoService;

@RestController
@RequestMapping("/tipotransacao")
public class TipoTransacaoController {
	
	@Autowired
	private TipoTransacaoService tipoTransacaoService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody TipoTransacaoJson tipoTransacao) {
		if(tipoTransacaoService.cadastrarTipoTransacao(tipoTransacao.getDescricao(), tipoTransacao.getAtivo()))
			return "Salvo com sucesso!";
		else
			throw new SalvarException("Erro ao salvar!" );
	}
	
	@GetMapping("/listarAtivos")
    public List<TipoTransacao> listarAtivos() {
		return tipoTransacaoService.listarAtivos();
	}
	
	@GetMapping("/listarInativos")
    public List<TipoTransacao> listarInativos() {
		return tipoTransacaoService.listarInativos();
	}
}
