package com.jogo.genio.controller;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record UsuarioDTO(UUID id, @NotNull String cpf, String aniver,String email,String senha) {

	
}
