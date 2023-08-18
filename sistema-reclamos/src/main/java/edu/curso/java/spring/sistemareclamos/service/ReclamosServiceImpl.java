package edu.curso.java.spring.sistemareclamos.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.curso.java.spring.sistemareclamos.bo.Reclamo;
import edu.curso.java.spring.sistemareclamos.repository.EstadosReclamoRepository;
import edu.curso.java.spring.sistemareclamos.repository.ReclamosRepository;


@Service
@Transactional
public class ReclamosServiceImpl implements ReclamosService {

	@Autowired
	private ReclamosRepository reclamosRepository;
	
	@Autowired
	private EstadosReclamoRepository estadosReclamoRepository;
	

	@Override
	public void borrarReclamo(Long id) {
		reclamosRepository.deleteById(id);
	}

	@Override
	public Long crearNuevoReclamo(Reclamo reclamo) {
		reclamo.setFechaDeAlta(new Date());
		//reclamo.setEstadoReclamo(null); //TODO: Asignar el estado inicial....
		reclamosRepository.save(reclamo);
		return reclamo.getId();
	}
	
	@Override
	public Reclamo recuperarReclamoPorId(Long id) {
		return reclamosRepository.findById(id).get();
	}
	
	@Override
	public List<Reclamo> recuperarTodoLosReclamos() {
		return reclamosRepository.buscarTodosLosReclamos();
	}

	@Override
	public void actualizarReclamo(Reclamo reclamo) {
		reclamosRepository.save(reclamo);
	}

	
}

