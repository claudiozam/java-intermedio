package edu.curso.java.spring.sistemareclamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	@RequestMapping("/saludar")
	public String goToIndex(Model model) {
		model.addAttribute("nombre", "juan");
		return "/home/saludar";
	}
	
}