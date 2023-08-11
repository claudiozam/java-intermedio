package edu.curso.java.spring.sistemareclamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reclamos")
public class ReclamosController {

	@RequestMapping("/listado")
	public String listado(Model model) {
		return "/reclamos/listado";
	}

	@RequestMapping("/ver/{id}")
	public String ver(Model model, @PathVariable Long id) {
		return "/reclamos/ver";
	}

	@RequestMapping("/nuevo")
	public String nuevo(Model model) {
		return "/reclamos/formulario";
	}

	@RequestMapping("/guardar")
	public String guardar(Model model) {
		return "?????????";
	}
	
	@RequestMapping("/editar/{id}")
	public String editar(Model model, @PathVariable Long id) {
		return "/reclamos/formulario";
	}

	@RequestMapping("/borrar/{id}")
	public String borrar(Model model, @PathVariable Long id) {
		return "?????????";
	}
	
}
