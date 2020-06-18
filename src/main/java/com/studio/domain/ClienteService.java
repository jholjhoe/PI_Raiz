package com.studio.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository rep;
	public Iterable<Cliente> getClientes() {
		return rep.findAll();
	}
	
	
	
		
	
	}
