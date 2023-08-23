package edu.curso.java.spring.sistemareclamos.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import edu.curso.java.spring.sistemareclamos.bo.*;
import edu.curso.java.spring.sistemareclamos.controller.rest.dto.ReclamoDTO;
import edu.curso.java.spring.sistemareclamos.service.ReclamosService;

@RestController
@RequestMapping("/api/reclamos")
public class ReclamosRestController {

	
	@Autowired
	private ReclamosService reclamosService;
	
	
	@GetMapping("/{id}")
	public ReclamoDTO recuperarReclamoPorId(@PathVariable Long id) {
		Reclamo reclamo = reclamosService.recuperarReclamoPorId(id);
		ReclamoDTO reclamoDTO = new ReclamoDTO(reclamo);
		return reclamoDTO;
	}
	
	@GetMapping
	public List<ReclamoDTO> recuperarReclamos() {
		List<Reclamo> reclamos = reclamosService.recuperarTodoLosReclamos();
		List<ReclamoDTO> reclamosDTO = new ArrayList<ReclamoDTO>();
		
		for(Reclamo r : reclamos) {
			reclamosDTO.add(new ReclamoDTO(r));
		}

		return reclamosDTO;
	}
	
	
	
}
