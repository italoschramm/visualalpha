package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.ClienteJson;
import com.lealpha.visualalpha.exception.SalvarException;
import com.lealpha.visualalpha.model.Cliente;
import com.lealpha.visualalpha.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody ClienteJson cliente) {
		if(clienteService.cadastrarCliente(cliente))
			return "Salvo com sucesso!";
		else
			throw new SalvarException("Erro ao salvar!" );
	}
	
	@GetMapping("/listarAtivos")
    public List<Cliente> listarAtivos() {
		return clienteService.listarAtivos();
	}
	
	@GetMapping("/listarInativos")
    public List<Cliente> listarInativos() {
		return clienteService.listarInativos();
	}

}
