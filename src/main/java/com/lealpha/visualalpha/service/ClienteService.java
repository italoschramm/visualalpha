package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.client.ClienteJson;
import com.lealpha.visualalpha.model.Cliente;

public interface ClienteService {
	
	public Boolean cadastrarCliente(ClienteJson cliente);
	
	public List<Cliente> listarAtivos();
	
	public List<Cliente> listarInativos();
}
