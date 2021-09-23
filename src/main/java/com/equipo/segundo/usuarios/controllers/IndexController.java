package com.equipo.segundo.usuarios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Testeando pasar datos desde el controlador a la vista");
		return "index";
		
	}
	
}
