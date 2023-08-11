package edu.curso.java.spring.sistemareclamos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.curso.java.spring.sistemareclamos.bo.EstadoReclamo;

@Controller
@RequestMapping("/holamundo")
public class HolaMundoController {

	//PARA LLAMAR A LA PAGINA LA URL FINAL ES http://localhost:8080/holamundo/saludar
	@RequestMapping("/saludar")	
	public String saludar(Model model) {
		model.addAttribute("nombre", "Claudio");
		
		EstadoReclamo estadoReclamo = new EstadoReclamo();
		estadoReclamo.setId(1234L);
		estadoReclamo.setNombre("Ejemplo Estado");
		model.addAttribute("estadoReclamo", estadoReclamo);
		
		List<EstadoReclamo> estadosReclamo = new ArrayList<EstadoReclamo>();
		estadosReclamo.add(new EstadoReclamo(1L, "Estado 1"));
		estadosReclamo.add(new EstadoReclamo(2L, "Estado 2"));
		estadosReclamo.add(new EstadoReclamo(3L, "Estado 3"));
		model.addAttribute("estadosReclamo", estadosReclamo);


		return "/holamundo/saludar"; //EN ESTA CARPETA VAMOS A TENER UNA PAGINA EN HTML LLAMADA saludar.jsp
	}
}
