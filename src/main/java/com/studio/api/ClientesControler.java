package com.studio.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studio.domain.Cliente;
import com.studio.domain.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesControler {
	@Autowired
	private ClienteService service;
	
	@GetMapping()
	public Iterable<Cliente> get () {
		return service.getClientes();
	}


}
