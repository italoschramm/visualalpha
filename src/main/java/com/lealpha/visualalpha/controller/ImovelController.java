package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.ImovelJson;
import com.lealpha.visualalpha.response.ImovelRespJson;
import com.lealpha.visualalpha.service.ImovelService;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

	@Autowired
	private ImovelService imovelService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody ImovelJson imovel) {
		if(imovelService.cadastrarImovel(imovel))
			return "Salvo com sucesso!";
		else
			return "Erro ao salvar!";
	}
	
	@GetMapping("/listarImoveisCliente/{idCliente}")
    public List<ImovelRespJson> listarAtivos(@PathVariable Long idCliente) {
		return imovelService.listarImoveisByCliente(idCliente);
	}
}
