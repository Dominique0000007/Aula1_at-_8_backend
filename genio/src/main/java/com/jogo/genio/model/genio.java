package com.jogo.genio.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "td_usuario")
public class genio {
	
	@Id
	@GenerateValue(strategy = GenerationType.UUID)
	private String id;
	
	private String cpf,aniver,email,senha;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAniver() {
		return aniver;
	}

	public void setAniver(String aniver) {
		this.aniver = aniver;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}