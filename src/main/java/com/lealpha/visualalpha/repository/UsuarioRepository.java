package com.lealpha.visualalpha.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lealpha.visualalpha.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	@Query(value = "SELECT * FROM USUARIO WHERE LOGIN = :login AND SENHA = :senha", nativeQuery = true)
	public Usuario findByLoginSenha(@Param("login") String idStrava, @Param("senha") String senha);
}
