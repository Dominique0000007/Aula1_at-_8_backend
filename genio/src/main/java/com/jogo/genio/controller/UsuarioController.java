package com.jogo.genio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class UsuarioController {

	@RestControler
	@RequestMapping("api")
		public class UsuarioCrontroller{
			
		@PostMapping("/Cadastrar")
		public ResponseEntity <?> salvarUsuario(@valid @RequestBody UsuarioDTO user) {
			UsuarioModel usuario = new UsuarioModel(user);
			repository.save(usuario);
			return ReponseEntity.ok("Usuario cadastrado");
		
		}
	}
}

