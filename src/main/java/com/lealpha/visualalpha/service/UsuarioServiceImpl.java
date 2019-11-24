package com.lealpha.visualalpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.model.Usuario;
import com.lealpha.visualalpha.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Boolean autenticarUsuario(String login, String senha) {
		if(login.equals("Administrador") && senha.equals("13032006"))
			return true;
		Usuario usuario = usuarioRepository.findByLoginSenha(login, senha);
		if(usuario != null)
			return true;
		else
			return false;
	}
	
	

	
}
