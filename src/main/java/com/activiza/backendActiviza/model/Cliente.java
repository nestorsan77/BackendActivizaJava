package com.activiza.backendActiviza.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Usuario user;
    
    @Column(name = "altura")
    private float altura;
    
    @Column(name = "peso")
    private float peso;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "objetivo")
    private String objetivo;
    
    @Column(name = "lugar_entrenamiento")
    private String lugarEntrenamiento;
    
    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

	    public Cliente() {
	    	super();
	    }
	    
		public Cliente(Usuario user, float altura, float peso, String genero, String objetivo,
				String lugarEntrenamiento, Entrenador entrenador) {
			super();
			this.user = user;
			this.altura = altura;
			this.peso = peso;
			this.genero = genero;
			this.objetivo = objetivo;
			this.lugarEntrenamiento = lugarEntrenamiento;
			this.entrenador = entrenador;
		}
	    // Getters and Setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Usuario getUser() {
			return user;
		}

		public void setUser(Usuario user) {
			this.user = user;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso;
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

		public String getLugarEntrenamiento() {
			return lugarEntrenamiento;
		}

		public void setLugarEntrenamiento(String lugarEntrenamiento) {
			this.lugarEntrenamiento = lugarEntrenamiento;
		}

		public Entrenador getEntrenador() {
			return entrenador;
		}

		public void setEntrenador(Entrenador entrenador) {
			this.entrenador = entrenador;
		}
	    
}
