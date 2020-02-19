package com.lealpha.visualalpha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.client.ClienteJson;
import com.lealpha.visualalpha.exception.BuscaException;
import com.lealpha.visualalpha.model.Cliente;
import com.lealpha.visualalpha.model.Usuario;
import com.lealpha.visualalpha.repository.ClienteRepository;
import com.lealpha.visualalpha.repository.UsuarioRepository;
import com.lealpha.visualalpha.response.ClienteRespJson;

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
	
	@Override
	public List<ClienteRespJson> listarAtivos() {
		List<Cliente> listaCliente = clienteRepository.findByAtivos();
		List<ClienteRespJson> listaClienteResp = new ArrayList<ClienteRespJson>();
		for(Cliente cliente : listaCliente) {
			ClienteRespJson clienteResp = new ClienteRespJson(cliente);
			listaClienteResp.add(clienteResp);
		}
		return listaClienteResp;
	}

	@Override
	public List<ClienteRespJson> listarInativos() {
		List<Cliente> listaCliente = clienteRepository.findByInativos();
		List<ClienteRespJson> listaClienteResp = new ArrayList<ClienteRespJson>();
		for(Cliente cliente : listaCliente) {
			ClienteRespJson clienteResp = new ClienteRespJson(cliente);
			listaClienteResp.add(clienteResp);
		}
		return listaClienteResp;
	}

}
