package com.lealpha.visualalpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.client.ClienteJson;
import com.lealpha.visualalpha.exception.BuscaException;
import com.lealpha.visualalpha.model.CategoriaTipoImovel;
import com.lealpha.visualalpha.model.Cliente;
import com.lealpha.visualalpha.model.TipoImovel;
import com.lealpha.visualalpha.model.Usuario;
import com.lealpha.visualalpha.repository.ClienteRepository;
import com.lealpha.visualalpha.repository.UsuarioRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Boolean cadastrarCliente(ClienteJson cliente) {
		Usuario usuario = usuarioRepository.findById(cliente.getIdUsuario()).orElse(null);
		if(usuario == null)
			throw new BuscaException("Usuário não localizado!" );
		
		Cliente clienteSalvar = new Cliente();
		clienteSalvar.setCpf(cliente.getCpf());
		clienteSalvar.setEmail(cliente.getEmail());
		clienteSalvar.setNome(cliente.getNome());
		clienteSalvar.setSobrenome(cliente.getSobrenome());
		clienteSalvar.setUsuario(usuario);
		try {
			clienteRepository.save(clienteSalvar);
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
