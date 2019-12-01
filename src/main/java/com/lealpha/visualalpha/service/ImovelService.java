package com.lealpha.visualalpha.service;

import java.util.List;

import com.lealpha.visualalpha.client.ImovelJson;
import com.lealpha.visualalpha.response.ImovelRespJson;

public interface ImovelService {

	public Boolean cadastrarImovel(ImovelJson imovel);
	
	public List<ImovelRespJson> listarImoveisByCliente(Long idCliente);
}
