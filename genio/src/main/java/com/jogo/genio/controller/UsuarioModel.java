package com.jogo.genio.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Entity
@Tabele(name = "td usuario")
public class UsuarioModel {

	public UsuarioModel(@Valid UsuarioDTO user) {
		
		this.cpf= user.cpf();
		this.setAniver(user.aniver());
		this.setEmail(user.senha());
		this.setSenha(user.senha());
		
	}

	private void cpf() {
		// TODO Auto-generated method stub
		
	}

	public String getAniver() {
		return aniver;
	}

	public void setAniver(String aniver) {
		this.aniver = aniver;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUId id;
	@Valid
	@NotNull String cpf;
	private String aniver,email,senha;
}
