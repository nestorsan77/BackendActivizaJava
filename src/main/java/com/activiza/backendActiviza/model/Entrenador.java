package com.activiza.backendActiviza.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrenador")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Usuario user;
    
    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    private List<Rutina> rutinas;
    
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Publicacion> publicaciones;
    
    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
    

	public Entrenador() {
		super();
	}

	public Entrenador(Usuario user, List<Rutina> rutinas, List<Publicacion> publicaciones, List<Cliente> clientes) {
		super();
		this.user = user;
		this.rutinas = rutinas;
		this.publicaciones = publicaciones;
		this.clientes = clientes;
	}

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

	public List<Rutina> getRutinas() {
		return rutinas;
	}

	public void setRutinas(List<Rutina> rutinas) {
		this.rutinas = rutinas;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
    
    
}

