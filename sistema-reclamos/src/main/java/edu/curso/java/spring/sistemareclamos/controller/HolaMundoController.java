package edu.curso.java.spring.sistemareclamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/holamundo")
public class HolaMundoController {

	//PARA LLAMAR A LA PAGINA LA URL FINAL ES http://localhost:8080/holamundo/saludar
	@RequestMapping("/saludar")	
	public String saludar(Model model) {
		model.addAttribute("nombre", "Claudio");		
		return "/holamundo/saludar"; //EN ESTA CARPETA VAMOS A TENER UNA PAGINA EN HTML LLAMADA saludar.jsp
	}
}
