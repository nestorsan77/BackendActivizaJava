package com.activiza.backendActiviza.model;

import java.util.List;

public class RutinaDTO {
	    private int id;
	    private String nombre;
	    private String descripcion;
	    private List<Integer> ejercicioIds;
	    private int duracion;
	    private int entrenadorId;
	    private String media;
	    private String genero;
	    private String objetivo;
	    private String lugar;
	    private String entrenamiento;

	    // Constructores
	    public RutinaDTO() {}

	    public RutinaDTO(int id, String nombre, String descripcion, List<Integer> ejercicioIds, int duracion, int entrenadorId, 
	                     String media, String genero, String objetivo, String lugar, String entrenamiento) {
	        this.id = id;
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	        this.ejercicioIds = ejercicioIds;
	        this.duracion = duracion;
	        this.entrenadorId = entrenadorId;
	        this.media = media;
	        this.genero = genero;
	        this.objetivo = objetivo;
	        this.lugar = lugar;
	        this.entrenamiento = entrenamiento;
	    }

	    // Getters y Setters
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

	    public List<Integer> getEjercicioIds() {
	        return ejercicioIds;
	    }

	    public void setEjercicioIds(List<Integer> ejercicioIds) {
	        this.ejercicioIds = ejercicioIds;
	    }

	    public int getDuracion() {
	        return duracion;
	    }

	    public void setDuracion(int duracion) {
	        this.duracion = duracion;
	    }

	    public int getEntrenadorId() {
	        return entrenadorId;
	    }

	    public void setEntrenadorId(int entrenadorId) {
	        this.entrenadorId = entrenadorId;
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
