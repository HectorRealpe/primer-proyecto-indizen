package com.equipo.segundo.usuarios.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equipo.segundo.usuarios.models.Usuario;

@Controller
@RequestMapping("/usuarios")
public class IndexController {

	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Testeando pasar datos desde el controlador a la vista");
		
		return "index";
		
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();		
		usuario.setNombre("Héctor");
		usuario.setApellido("Realpe");
		usuario.setEmail("hl.realpe@indizen.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		List<Usuario> ususarios = new ArrayList<>();
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", ususarios);
		
		return "listar";
		
	}
	
}
