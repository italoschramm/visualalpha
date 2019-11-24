package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lealpha.visualalpha.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	@Query(value = "SELECT C.* FROM CLIENTE C "
			+ "INNER JOIN USUARIO U ON C.IDUSUARIO = U.IDUSUARIO "
			+ "WHERE U.ATIVO = TRUE", nativeQuery = true)
	public List<Cliente> findByAtivos();
	
	@Query(value = "SELECT C.* FROM CLIENTE C "
			+ "INNER JOIN USUARIO U ON C.IDUSUARIO = U.IDUSUARIO "
			+ "WHERE U.ATIVO = FALSE", nativeQuery = true)
	public List<Cliente> findByInativos();

}
