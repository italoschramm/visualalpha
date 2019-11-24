package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lealpha.visualalpha.model.TipoImovel;

public interface TipoImovelRepository extends CrudRepository<TipoImovel, Long>{
	
	@Query(value = "SELECT * FROM TIPOIMOVEL WHERE ATIVO = TRUE", nativeQuery = true)
	public List<TipoImovel> findByAtivos();
	
	@Query(value = "SELECT * FROM TIPOIMOVEL WHERE ATIVO = FALSE", nativeQuery = true)
	public List<TipoImovel> findByInativos();
}
