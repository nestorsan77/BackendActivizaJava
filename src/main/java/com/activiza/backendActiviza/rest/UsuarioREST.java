package com.activiza.backendActiviza.rest;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activiza.backendActiviza.model.Usuario;
import com.activiza.backendActiviza.service.UsuarioService;

@RestController()
@RequestMapping("/usuario")
public class UsuarioREST {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	@PostMapping
	private ResponseEntity<Usuario> saveUsuario (@RequestBody Usuario usuario){
		
		
		try {
			Usuario usuarioGuardado = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/rutina/"+usuarioGuardado.getId())).body(usuarioGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
	}
}
