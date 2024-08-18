package com.activiza.backendActiviza.model;

import java.util.List;

public class EntrenadorDTO {
	private Long userId;
    private List<Long> rutinaIds;
    private List<Long> publicacionIds;
    private List<Long> clienteIds;

    public EntrenadorDTO() {
    	
    }
    
    public EntrenadorDTO(Long userId, List<Long> rutinaIds, List<Long> publicacionIds, List<Long> clienteIds) {
		super();
		this.userId = userId;
		this.rutinaIds = rutinaIds;
		this.publicacionIds = publicacionIds;
		this.clienteIds = clienteIds;
	}
	// Getters and Setters
    
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Long> getRutinaIds() {
		return rutinaIds;
	}
	public void setRutinaIds(List<Long> rutinaIds) {
		this.rutinaIds = rutinaIds;
	}
	public List<Long> getPublicacionIds() {
		return publicacionIds;
	}
	public void setPublicacionIds(List<Long> publicacionIds) {
		this.publicacionIds = publicacionIds;
	}
	public List<Long> getClienteIds() {
		return clienteIds;
	}
	public void setClienteIds(List<Long> clienteIds) {
		this.clienteIds = clienteIds;
	}

    
}
