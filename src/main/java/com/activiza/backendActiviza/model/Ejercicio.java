package com.activiza.backendActiviza.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "repeticiones")
    private int repeticiones;
    
    @Column(name = "duracion")
    private int duracion;
    
    @Column(name = "descanso")
    private int descanso;
    
    @Column(name = "media")
    private String media;
    
    @ManyToOne
    @JoinColumn(name = "id_rutina")
    private Rutina rutina;
    
	
	public Ejercicio() {
		super();
	}
	
	public Ejercicio(String nombre, String descripcion, int repeticiones, int duracion, int descanso, String media,
			Rutina rutina) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.repeticiones = repeticiones;
		this.duracion = duracion;
		this.descanso = descanso;
		this.media = media;
		this.rutina = rutina;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getRepeticiones() {
		return repeticiones;
	}
	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getDescanso() {
		return descanso;
	}
	public void setDescanso(int descanso) {
		this.descanso = descanso;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public Rutina getRutina() {
		return rutina;
	}
	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}
	
	
}
