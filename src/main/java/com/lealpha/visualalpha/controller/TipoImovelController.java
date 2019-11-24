package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.TipoImovelJson;
import com.lealpha.visualalpha.exception.SalvarException;
import com.lealpha.visualalpha.model.TipoImovel;
import com.lealpha.visualalpha.service.TipoImovelService;

@RestController
@RequestMapping("/tipoimovel")
public class TipoImovelController {

	@Autowired
	private TipoImovelService tipoImovelService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody TipoImovelJson tipoImovel) {
		if(tipoImovelService.cadastrarTipoImovel(tipoImovel.getDescricao(), tipoImovel.getAtivo()))
			return "Salvo com sucesso!";
		else
			throw new SalvarException("Erro ao salvar!" );
	}
	
	@GetMapping("/listarAtivos")
    public List<TipoImovel> listarAtivos() {
		return tipoImovelService.listarAtivos();
	}
	
	@GetMapping("/listarInativos")
    public List<TipoImovel> listarInativos() {
		return tipoImovelService.listarInativos();
	}
}
