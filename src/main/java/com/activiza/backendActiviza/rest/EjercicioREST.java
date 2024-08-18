package com.activiza.backendActiviza.rest;

import java.net.URI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activiza.backendActiviza.model.Ejercicio;
import com.activiza.backendActiviza.service.EjercicioService;

@RestController()
@RequestMapping("/ejercicio")
public class EjercicioREST {

	@Autowired
	private EjercicioService ejercicioService;
	
	@GetMapping
	private ResponseEntity<List<Ejercicio>> getAllEjercicios(){
		return ResponseEntity.ok(ejercicioService.findAll());
	}
	
	@GetMapping("{idEjercicio}")
    public ResponseEntity<Ejercicio> getEjercicios(@PathVariable long idEjercicio) {
        try {
            Optional<Ejercicio> ejercicio = ejercicioService.findById(idEjercicio);
            if (ejercicio.isPresent()) {
                return ResponseEntity.ok(ejercicio.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
	
	@PostMapping
	private ResponseEntity<Ejercicio> saveEjercicio (@RequestBody Ejercicio ejercicio){
		
		
		try {
			Ejercicio ejercicioGuardado = ejercicioService.save(ejercicio);
			return ResponseEntity.created(new URI("/ejercicio/"+ejercicioGuardado.getId())).body(ejercicioGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
	}
	
}
