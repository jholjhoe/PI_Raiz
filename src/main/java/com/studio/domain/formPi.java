package com.studio.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class formPi implements Serializable{

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String sobrenome;
	private String telefone;
	private String usuario;
	private String cep;
	private String endereco;
	private String complemento;
	private String senha;
	private int tipousuario;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public long getId(Long contatoID) {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipousuario() {
		return tipousuario;
	}
	public void setTipousuario(int tipousuario) {
		this.tipousuario = tipousuario;
	}
	public String getUsuario() {
		
		return null;
	}
	

	
	
}