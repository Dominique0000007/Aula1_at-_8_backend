package com.example.PerfumesModel;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="perfume")
public class PerfumeModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	
	private UUID Id;
	public PerfumeModel(UUID id, String nome, double preco) {
		Id = id;
		this.setNome(nome);
		this.setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private String nome;
	private double preco;
	
	}


   