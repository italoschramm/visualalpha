package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.model.Usuario;

public interface UsuarioService {

	public Boolean autenticarUsuario(String login, String senha);
	
	public Boolean cadastrarUsuario(String login, String senha, Boolean ativo);
	
	public List<Usuario> listarAtivos();
	
	public List<Usuario> listarInativos();
}
