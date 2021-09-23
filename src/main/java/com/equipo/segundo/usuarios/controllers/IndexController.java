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

	// Routing inicial y paso de datos del controlador a la vista para un HTML muy básico
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "hola a todos");
		
		return "index";
		
	}
	
	
	// routing del perfil para probar un solo objeto del controlador a la vista
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
	
	
	// routing de un listado para pasar una lista de objetos del modelo a la vista
	@RequestMapping("/listar")
	public String listar(Model model) {
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Héctor", "Realpe", "helui", "Masculino", "hl.realpe@indizen.com", 38, "IB1293476213746"));
		
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		
		return "listar";
		
	}
	
	// Otra forma de generar el listado.
	
	
}
