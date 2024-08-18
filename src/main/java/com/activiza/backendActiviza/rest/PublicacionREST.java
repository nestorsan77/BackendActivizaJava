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

import com.activiza.backendActiviza.model.Publicacion;
import com.activiza.backendActiviza.service.PublicacionService;

@RestController()
@RequestMapping("/publicaciones")
public class PublicacionREST {

	@Autowired
	private PublicacionService publicacionService;
	
	@GetMapping
	private ResponseEntity<List<Publicacion>> getAllPublicaciones(){
		return ResponseEntity.ok(publicacionService.findAll());
	}
	@PostMapping
	private ResponseEntity<Publicacion> savePublicacion (@RequestBody Publicacion publicacion){
		
		
		try {
			Publicacion publicacionGuardado = publicacionService.save(publicacion);
			return ResponseEntity.created(new URI("/publicacion/"+publicacionGuardado.getId())).body(publicacionGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
	}
}
