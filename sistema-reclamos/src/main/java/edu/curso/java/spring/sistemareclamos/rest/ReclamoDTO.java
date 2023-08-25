package edu.curso.java.spring.sistemareclamos.rest;

import edu.curso.java.spring.sistemareclamos.bo.Reclamo;

public class ReclamoDTO {
	
	private Long id;
	private String titulo;
	private String descripcion;
	
	public ReclamoDTO() {}
	
	public ReclamoDTO(Reclamo reclamo) {
		this.id = reclamo.getId();
		this.titulo = reclamo.getTitulo();
		this.descripcion = reclamo.getDescripcion();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
