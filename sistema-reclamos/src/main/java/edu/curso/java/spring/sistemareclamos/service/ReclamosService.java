package edu.curso.java.spring.sistemareclamos.service;

import java.util.List;

import edu.curso.java.spring.sistemareclamos.bo.Reclamo;

public interface ReclamosService {

	Long crearNuevoReclamo(Reclamo reclamo);

	Reclamo recuperarReclamoPorId(Long id);

	List<Reclamo> recuperarTodoLosReclamos();
	
	void borrarReclamo(Long id);

}