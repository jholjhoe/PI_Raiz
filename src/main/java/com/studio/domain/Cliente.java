package com.studio.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idcliente;
	public Long getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}


	public String getAval_fisica() {
		return aval_fisica;
	}


	public void setAval_fisica(String aval_fisica) {
		this.aval_fisica = aval_fisica;
	}


	private String aval_fisica;
	

	public Cliente() {
		
	}
	
	

	
	
	
}
