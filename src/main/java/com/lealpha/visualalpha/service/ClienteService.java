package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.client.ClienteJson;
import com.lealpha.visualalpha.response.ClienteRespJson;

public interface ClienteService {
	
	public Boolean cadastrarCliente(ClienteJson cliente);
	
	public List<ClienteRespJson> listarAtivos();
	
	public List<ClienteRespJson> listarInativos();
}
