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
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "mensaje")
    private String mensaje;
    
    @Column(name = "media")
    private String media;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Entrenador autor;

	    public Publicacion() {
	    	super();
	    }
	    
		public Publicacion(String titulo, String mensaje, String media, Entrenador autor) {
			super();
			this.titulo = titulo;
			this.mensaje = mensaje;
			this.media = media;
			this.autor = autor;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		public String getMedia() {
			return media;
		}

		public void setMedia(String media) {
			this.media = media;
		}

		public Entrenador getAutor() {
			return autor;
		}

		public void setAutor(Entrenador autor) {
			this.autor = autor;
		}
	    
	    
	
}
