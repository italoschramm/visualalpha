package com.lealpha.visualalpha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealpha.visualalpha.client.FotoJson;
import com.lealpha.visualalpha.client.ImovelJson;
import com.lealpha.visualalpha.exception.BuscaException;
import com.lealpha.visualalpha.model.Imovel;
import com.lealpha.visualalpha.repository.ClienteRepository;
import com.lealpha.visualalpha.repository.ImovelRepository;
import com.lealpha.visualalpha.repository.TipoImovelRepository;
import com.lealpha.visualalpha.repository.TipoTransacaoRepository;
import com.lealpha.visualalpha.response.ImovelRespJson;
import com.lealpha.visualalpha.util.Util;

@Service
public class ImovelServiceImpl implements ImovelService{

	@Autowired
	private ImovelRepository imovelRepository;
	
	@Autowired
	private TipoTransacaoRepository tipoTransacaoRepository;
	
	@Autowired
	private TipoImovelRepository tipoImovelRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Boolean cadastrarImovel(ImovelJson imovel) {
		Imovel imovelSalvar = new Imovel();
		imovelSalvar.setCep(imovel.getCep());
		imovelSalvar.setEstado(imovel.getEstado());
		imovelSalvar.setCidade(imovel.getCidade());
		imovelSalvar.setBairro(imovel.getBairro());
		imovelSalvar.setEndereco(imovel.getEndereco());
		imovelSalvar.setNumero(imovel.getNumero());
		imovelSalvar.setComplemento(imovel.getComplemento());
		imovelSalvar.setQuartos(imovel.getQuartos());
		imovelSalvar.setSuites(imovel.getSuites());
		imovelSalvar.setVagasGaragem(imovel.getVagasGaragem());
		imovelSalvar.setAreaUtil(imovel.getAreaUtil());
		imovelSalvar.setAreaTotal(imovel.getAreaTotal());
		imovelSalvar.setDescricao(imovel.getDescricao());
		imovelSalvar.setValorVenda(imovel.getValorVenda());
		imovelSalvar.setValorAluguel(imovel.getValorAluguel());
		imovelSalvar.setTipoTransacao(tipoTransacaoRepository.findById(imovel.getIdTipoTransacao()).orElse(null));
		if(imovelSalvar.getTipoTransacao() == null)
			throw new BuscaException("Tipo transacao não encontrado!" );
		
		imovelSalvar.setTipoImovel(tipoImovelRepository.findById(imovel.getIdTipoImovel()).orElse(null));
		if(imovelSalvar.getTipoImovel() == null)
			throw new BuscaException("Tipo imóvel não encontrado!" );
		
		imovelSalvar.setCliente(clienteRepository.findById(imovel.getIdCliente()).orElse(null));
		if(imovelSalvar.getCliente() == null)
			throw new BuscaException("Cliente não encontrado!" );

		Util util = new Util();
		for(FotoJson foto : imovel.getFotos()) {
			byte[] byteImagem = util.converteBase64ToByte(foto.getFoto());
			util.salvarByteJpeg(byteImagem, "", "foto1");
		}
		imovelSalvar.setFotos("");
		imovelSalvar.setAtivo(imovel.isAtivo());
		imovelRepository.save(imovelSalvar);
		return true;
	}
	
	@Override
	public List<ImovelRespJson> listarImoveisByCliente(Long idCliente) {
		List<Imovel> listaImovel = imovelRepository.findByCliente(idCliente);
		List<ImovelRespJson> listaImovelResp = new ArrayList<ImovelRespJson>();
		for(Imovel imovel : listaImovel) {
			ImovelRespJson imovelResp = new ImovelRespJson(imovel);
			listaImovelResp.add(imovelResp);
		}
		return listaImovelResp;
	}
}
