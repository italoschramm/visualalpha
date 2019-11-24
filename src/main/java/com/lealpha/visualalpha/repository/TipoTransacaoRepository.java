package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lealpha.visualalpha.model.TipoTransacao;

public interface TipoTransacaoRepository extends CrudRepository<TipoTransacao, Long>{
	
	@Query(value = "SELECT * FROM TIPOTRANSACAO WHERE ATIVO = TRUE", nativeQuery = true)
	public List<TipoTransacao> findByAtivos();
	
	@Query(value = "SELECT * FROM TIPOTRANSACAO WHERE ATIVO = FALSE", nativeQuery = true)
	public List<TipoTransacao> findByInativos();

}
