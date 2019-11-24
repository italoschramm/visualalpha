package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lealpha.visualalpha.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	@Query(value = "SELECT * FROM USUARIO WHERE LOGIN = :login", nativeQuery = true)
	public Usuario findByLogin(@Param("login") String login);
	
	@Query(value = "SELECT * FROM USUARIO WHERE LOGIN = :login AND SENHA = :senha AND ATIVO = TRUE", nativeQuery = true)
	public Usuario findByLoginSenhaAtivo(@Param("login") String login, @Param("senha") String senha);
	
	@Query(value = "SELECT * FROM USUARIO WHERE ATIVO = TRUE", nativeQuery = true)
	public List<Usuario> findByAtivos();
	
	@Query(value = "SELECT * FROM USUARIO WHERE ATIVO = FALSE", nativeQuery = true)
	public List<Usuario> findByInativos();
}
