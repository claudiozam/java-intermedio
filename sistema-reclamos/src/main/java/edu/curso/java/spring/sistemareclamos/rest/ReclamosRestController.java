package edu.curso.java.spring.sistemareclamos.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.spring.sistemareclamos.bo.Reclamo;
import edu.curso.java.spring.sistemareclamos.service.ReclamosService;

import java.util.*;

@RestController
@RequestMapping("/api/reclamos")
public class ReclamosRestController {

	
	@Autowired
	private ReclamosService reclamosService;
	
	@GetMapping("/{id}") // ESTO ME QUEDA /api/reclamos/{eliddelreclamoquequierorecuperar} je: /api/reclamos/2
	public ReclamoDTO recuperarReclamoPorId(@PathVariable Long id) {
		Reclamo reclamo = reclamosService.recuperarReclamoPorId(id);
		ReclamoDTO reclamoDTO = new ReclamoDTO(reclamo);
		return reclamoDTO;
	}
	
	
	@GetMapping // ESTO ME QUEDA /api/reclamos
	public List<ReclamoDTO> recuperarReclamos() {
		List<Reclamo> reclamos = reclamosService.recuperarTodoLosReclamos();
		
		List<ReclamoDTO> reclamosDTO = new ArrayList<ReclamoDTO>();
		for (Reclamo reclamo : reclamos) {
			reclamosDTO.add(new ReclamoDTO(reclamo));
		}
		return reclamosDTO;
	}
	

	@PostMapping
	public ReclamoDTO altaDeReclamo(@RequestBody ReclamoDTO reclamoDTO) {
		Reclamo reclamo = new Reclamo();
		reclamo.setTitulo(reclamoDTO.getTitulo());
		reclamo.setDescripcion(reclamoDTO.getDescripcion());
		Long idGenerado = reclamosService.crearNuevoReclamo(reclamo);
		reclamoDTO.setId(idGenerado);
		return reclamoDTO;
	}
	
	@PutMapping("/{id}") // ESTO ME QUEDA /api/reclamos/{eliddelreclamoquequierorecuperar} je: /api/reclamos/2
	public ReclamoDTO actualizarReclamo(@PathVariable Long id, @RequestBody ReclamoDTO reclamoDTO) {
		Reclamo reclamo = reclamosService.recuperarReclamoPorId(id);
		reclamo.setTitulo(reclamoDTO.getTitulo());
		reclamo.setDescripcion(reclamoDTO.getDescripcion());
		reclamosService.actualizarReclamo(reclamo);
		return reclamoDTO;
	}
	
	
	@DeleteMapping("/{id}") // ESTO ME QUEDA /api/reclamos/{eliddelreclamoquequierorecuperar} je: /api/reclamos/2
	public void borrarReclamo(@PathVariable Long id) {
		reclamosService.borrarReclamo(id);
	}
	
	
	
}
