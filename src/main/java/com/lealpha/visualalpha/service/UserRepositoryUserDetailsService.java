package com.lealpha.visualalpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lealpha.visualalpha.model.Usuario;
import com.lealpha.visualalpha.repository.UsuarioRepository;

public class UserRepositoryUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UserRepositoryUserDetailsService() {
		
	}
	
	@Autowired
	public UserRepositoryUserDetailsService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	  
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByLogin(username);
	    if (usuario != null) {
	    	if(usuario.getAtivo()) {
	    		BCryptPasswordEncoder password = new BCryptPasswordEncoder();
	    		return new Usuario(
	    		        usuario.getUsername(), 
	    		        password.encode(usuario.getPassword()));
	    	}
	    	else
	    		throw new UsernameNotFoundException("Usuário '" + username + "' inativo");
	    }
	    throw new UsernameNotFoundException("Usuário '" + username + "' não encontrado");
	}


}
