package com.activiza.backendActiviza.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activiza.backendActiviza.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	
	Optional<Usuario> findOneByEmail(String email);
}
