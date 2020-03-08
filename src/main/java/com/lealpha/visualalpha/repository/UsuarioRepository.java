package com.lealpha.visualalpha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lealpha.visualalpha.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	@Query(value = "SELECT * FROM USUARIO WHERE USERNAME = :username", nativeQuery = true)
	public Usuario findByLogin(@Param("username") String username);
	
	@Query(value = "SELECT * FROM USUARIO WHERE USERNAME = :username AND PASSWORD = :password AND ATIVO = TRUE", nativeQuery = true)
	public Usuario findByLoginSenhaAtivo(@Param("username") String login, @Param("password") String password);
	
	@Query(value = "SELECT * FROM USUARIO WHERE ATIVO = TRUE", nativeQuery = true)
	public List<Usuario> findByAtivos();
	
	@Query(value = "SELECT * FROM USUARIO WHERE ATIVO = FALSE", nativeQuery = true)
	public List<Usuario> findByInativos();
	
	
}
