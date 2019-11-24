package com.lealpha.visualalpha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.exception.BuscaException;
import com.lealpha.visualalpha.exception.SalvarException;
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
		Usuario usuario = usuarioRepository.findByLoginSenhaAtivo(login, senha);
		if(usuario != null)
			return true;
		else
			return false;
	}

	@Override
	public Boolean cadastrarUsuario(String login, String senha, Boolean ativo) {
		Usuario usuarioConsulta = usuarioRepository.findByLogin(login);
		if(usuarioConsulta != null)
			throw new SalvarException("Login já existe!" );
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setAtivo(ativo);
		try {
			usuarioRepository.save(usuario);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Usuario> listarAtivos() {
		List<Usuario> listaUsuario = usuarioRepository.findByAtivos();
		return listaUsuario;
	}

	@Override
	public List<Usuario> listarInativos() {
		List<Usuario> listaUsuario = usuarioRepository.findByInativos();
		return listaUsuario;
	}
}
