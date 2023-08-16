package edu.curso.java.spring.sistemareclamos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.curso.java.spring.sistemareclamos.bo.Reclamo;
import edu.curso.java.spring.sistemareclamos.repository.ReclamosRepository;
import edu.curso.java.spring.sistemareclamos.service.ReclamosService;

@Controller
@RequestMapping("/reclamos")
public class ReclamosController {

	@Autowired
	private ReclamosService reclamosService;
	
	// URL FINAL => /reclamos/listar
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Reclamo> reclamos = reclamosService.recuperarTodoLosReclamos();
		model.addAttribute("reclamos", reclamos);
		return "/reclamos/listar";
	}


	// URL FINAL => /reclamos/ver/{el id del reclamo}
	@RequestMapping("/ver/{id}")
	public String ver(Model model, @PathVariable Long id) {
		Reclamo reclamo = reclamosService.recuperarReclamoPorId(id);
		model.addAttribute("reclamo", reclamo);
		return "/reclamos/ver";
	}

	
	
}
