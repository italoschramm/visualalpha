package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.exception.AutenticacaoException;
import com.lealpha.visualalpha.model.Usuario;
import com.lealpha.visualalpha.response.UsuarioRespJson;

public interface UsuarioService {
	
	public Usuario carregaUsuario(String usuario) throws AutenticacaoException;

	public Boolean autenticarUsuario(String login, String senha);
	
	public Boolean cadastrarUsuario(String login, String senha, Boolean ativo);
	
	public List<UsuarioRespJson> listarAtivos();
	
	public List<UsuarioRespJson> listarInativos();
}
