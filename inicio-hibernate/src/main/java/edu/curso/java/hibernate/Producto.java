package edu.curso.java.hibernate;

import javax.persistence.*;

@Entity //CON ESTO DEFINIMOS QUE ES UNA CLASE HIBERNATE PARA GUARDAR EN ALGUN MOMENTO.....
@Table(name = "productos") //ESTO ES OPCIONAL
public class Producto {

	@Id //DEFINI QUE ESTE CAMPO ES LA PRIMARY KEY
	@GeneratedValue // DEFINE QUE EL VALOR DE LA PK SE AUTO GENERA Y NO LO TENEMOS QUE PONER A MANO....
	private Long id;
	
	private String nombre;
	
	@Column(length = 2000)
	private String descripcion;
	
	private Double precio;
	
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
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
