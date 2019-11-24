package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.lealpha.visualalpha.model.CategoriaTipoImovel;

public interface CategoriaTipoImovelRepository extends CrudRepository<CategoriaTipoImovel, Long>{
	
	@Query(value = "SELECT * FROM CATEGORIATIPOIMOVEL WHERE ATIVO = TRUE", nativeQuery = true)
	public List<CategoriaTipoImovel> findByAtivos();
	
	@Query(value = "SELECT * FROM CATEGORIATIPOIMOVEL WHERE ATIVO = FALSE", nativeQuery = true)
	public List<CategoriaTipoImovel> findByInativos();
}
