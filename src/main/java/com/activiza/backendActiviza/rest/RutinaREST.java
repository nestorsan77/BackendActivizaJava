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

import com.activiza.backendActiviza.model.Rutina;
import com.activiza.backendActiviza.service.RutinaService;

@RestController()
@RequestMapping("/rutina")
public class RutinaREST {

	@Autowired
	private RutinaService rutinaService;
	
	@GetMapping
	private ResponseEntity<List<Rutina>> getAllRutinas(){
		return ResponseEntity.ok(rutinaService.findAll());
	}
	@GetMapping("{idRutina}")
    public ResponseEntity<Rutina> getEjercicios(@PathVariable long idRutina) {
        try {
            Optional<Rutina> rutina = rutinaService.findById(idRutina);
            if (rutina.isPresent()) {
                return ResponseEntity.ok(rutina.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
	
	@PostMapping
	private ResponseEntity<Rutina> saveRutina (@RequestBody Rutina rutina){
		
		
		try {
			Rutina rutinaGuardado = rutinaService.save(rutina);
			return ResponseEntity.created(new URI("/rutina/"+rutinaGuardado.getId())).body(rutinaGuardado);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		
	}
}
