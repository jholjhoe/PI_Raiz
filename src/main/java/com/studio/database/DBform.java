package com.studio.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studio.domain.formPi;

public interface DBform extends JpaRepository<formPi, Long>{
	
	Optional<formPi> findByUsuarioAndSenha(String usuario, String senha);


	
}
