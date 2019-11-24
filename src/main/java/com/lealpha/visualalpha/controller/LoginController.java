package com.lealpha.visualalpha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealpha.visualalpha.client.Login;
import com.lealpha.visualalpha.exception.AutenticacaoException;
import com.lealpha.visualalpha.service.UsuarioService;

@RestController
@RequestMapping
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/login")
    public String autentica(@RequestBody Login login) {
		if(usuarioService.autenticarUsuario(login.getLogin(), login.getSenha()))
			return "Logado com sucesso!";
		else
			throw new AutenticacaoException("Login e senha inválidos!" );
	}
}
