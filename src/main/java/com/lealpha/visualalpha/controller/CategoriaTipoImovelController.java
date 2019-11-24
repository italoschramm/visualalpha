package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.CategoriaTipoImovelJson;
import com.lealpha.visualalpha.exception.SalvarException;
import com.lealpha.visualalpha.model.CategoriaTipoImovel;
import com.lealpha.visualalpha.service.CategoriaTipoImovelService;

@RestController
@RequestMapping("/categoriatipoimovel")
public class CategoriaTipoImovelController {
	
	@Autowired
	private CategoriaTipoImovelService categoriaTipoImovelService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody CategoriaTipoImovelJson categoriaTipoImovel) {
		if(categoriaTipoImovelService.cadastrarCategoriaTipoImovel(categoriaTipoImovel.getDescricao(), categoriaTipoImovel.getAtivo(),
				categoriaTipoImovel.getIdTipoImovel()))
			return "Salvo com sucesso!";
		else
			throw new SalvarException("Erro ao salvar!" );
	}
	
	@GetMapping("/listarAtivos")
    public List<CategoriaTipoImovel> listarAtivos() {
		return categoriaTipoImovelService.listarAtivos();
	}
	
	@GetMapping("/listarInativos")
    public List<CategoriaTipoImovel> listarInativos() {
		return categoriaTipoImovelService.listarInativos();
	}

}
