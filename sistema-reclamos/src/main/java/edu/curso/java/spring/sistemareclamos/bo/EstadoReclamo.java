package edu.curso.java.spring.sistemareclamos.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EstadoReclamo {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	public EstadoReclamo() {}

	public EstadoReclamo(String nombre) {
		this.nombre = nombre;
	}

	public EstadoReclamo(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
