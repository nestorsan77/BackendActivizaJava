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

import com.activiza.backendActiviza.model.Entrenador;
import com.activiza.backendActiviza.model.EntrenadorDTO;
import com.activiza.backendActiviza.service.EntrenadorService;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorREST {

	@Autowired
	private EntrenadorService entrenadorService;
	
	@GetMapping
	private ResponseEntity<List<Entrenador>> getAllEntrenadores(){
		return ResponseEntity.ok(entrenadorService.findAll());
	}
	@PostMapping
	private ResponseEntity<Entrenador> saveEntrenador (@RequestBody EntrenadorDTO entrenadorDTO){
		try {
			Entrenador entrenadorGuardado = entrenadorService.createEntrenador(entrenadorDTO);
			return ResponseEntity.created(new URI("/entrenador/"+entrenadorGuardado.getId())).body(entrenadorGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
	}
}
