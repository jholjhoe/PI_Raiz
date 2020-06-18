package com.studio.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository rep;
	public Iterable<Usuario> getUsuario() {
		return rep.findAll();
	}
	
	
	
		
	
	}
