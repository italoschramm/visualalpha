package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lealpha.visualalpha.model.Imovel;

public interface ImovelRepository extends CrudRepository<Imovel, Long>{

	@Query(value = "SELECT I.* FROM IMOVEL I "
			+ "INNER JOIN CLIENTE C ON I.IDCLIENTE = C.IDCLIENTE "
			+ "WHERE I.IDCLIENTE = :idCliente", nativeQuery = true)
	public List<Imovel> findByCliente(@Param("idCliente") Long idCliente);
	
}
