package com.lealpha.visualalpha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.UsuarioJson;
import com.lealpha.visualalpha.exception.SalvarException;
import com.lealpha.visualalpha.response.UsuarioRespJson;
import com.lealpha.visualalpha.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/cadastrar")
    public String cadastrar(@RequestBody UsuarioJson usuario) {
		if(usuarioService.cadastrarUsuario(usuario.getLogin(), usuario.getSenha(), usuario.getAtivo()))
			return "Salvo com sucesso!";
		else
			throw new SalvarException("Erro ao salvar!" );
	}
	
	@GetMapping("/listarAtivos")
    public List<UsuarioRespJson> listarAtivos() {
		return usuarioService.listarAtivos();
	}
	
	@GetMapping("/listarInativos")
    public List<UsuarioRespJson> listarInativos() {
		return usuarioService.listarInativos();
	}
}
