package edu.curso.java.spring.sistemareclamos.bo;


import javax.persistence.*;
import java.util.*;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	@OneToMany
	private List<Reclamo> reclamos = new ArrayList<Reclamo>();

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

	public List<Reclamo> getReclamos() {
		return reclamos;
	}

	public void setReclamos(List<Reclamo> reclamos) {
		this.reclamos = reclamos;
	}
	

	
}
