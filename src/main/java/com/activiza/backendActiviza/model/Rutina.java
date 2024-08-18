package com.activiza.backendActiviza.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rutina")
public class Rutina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(mappedBy = "rutina", cascade = CascadeType.ALL)
    private List<Ejercicio> ejercicios;
    
    @Column(name = "duracion")
    private int duracion;
    
    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;
    
    @Column(name = "media")
    private String media;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "objetivo")
    private String objetivo;
    
    @Column(name = "lugar")
    private String lugar;
    
    @Column(name = "entrenamiento")
    private String entrenamiento;
	
	public Rutina() {
		super();
	}
	
	public Rutina(String nombre, String descripcion, List<Ejercicio> ejercicios, int duracion, Entrenador entrenador,
			String media, String genero, String objetivo, String lugar, String entrenamiento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ejercicios = ejercicios;
		this.duracion = duracion;
		this.entrenador = entrenador;
		this.media = media;
		this.genero = genero;
		this.objetivo = objetivo;
		this.lugar = lugar;
		this.entrenamiento = entrenamiento;
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
	public List<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(List<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getEntrenamiento() {
		return entrenamiento;
	}
	public void setEntrenamiento(String entrenamiento) {
		this.entrenamiento = entrenamiento;
	}
	
	
	
	
	

	
	
	
	
}
