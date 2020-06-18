package com.studio.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studio.domain.Usuario;
import com.studio.domain.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuariosControler {
	@Autowired
	private UsuarioService service;
	
	@GetMapping()
	public Iterable<Usuario> get () {
		return service.getUsuario();
	}


}
