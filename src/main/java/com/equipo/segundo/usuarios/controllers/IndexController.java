package com.equipo.segundo.usuarios.controllers;


import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.equipo.segundo.usuarios.models.dao.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.dao.UsuarioRepository;
import com.equipo.segundo.usuarios.models.entity.Usuario;

@Controller
public class IndexController {
	
	@Autowired
	private InterfaceCRUD dao;
	
	@Autowired
	private UsuarioRepository userRepo;

	
   
    //LISTAR USUARIOS
	@Secured({"ROLE_USER"})
	@GetMapping("/listar")
	public String listar(Model model) {
		//Lista los usuarios que generamos en nuestra "base de datos"
		
		
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", userRepo.findAll());
		
		return "listar";
		
	}
	
	
	// LISTAR USUARIOS EN ADMIN
	
	@GetMapping("/listarAdmin")
	public String listarAdmin(Model model) {
		//Lista los usuarios que generamos en nuestra "base de datos"
		
		//this.dao.getMapAll();
		model.addAttribute("titulo", "Listado de usuarios Administrador");
		model.addAttribute("usuarios", this.dao.getMapAll());
		
		return "listarAdmin";
		
	}
	
	
	@PostMapping("/mandarListarAdmin")
	public String mandarListarAdmin (HttpServletRequest req, Model model, Usuario usuario) {
		
		
		if("Borrar".equals(req.getParameter("borrar"))) {
			//this.dao.eliminausu(usuario);
			this.userRepo.delete(usuario);
			return "listarAdmin";
		}else {
			model.addAttribute("usuario", usuario);
			return "actualizarAdmin";
		}
	
	}
	
	
	
	//ACTUALIZAR USUARIO
	
	@GetMapping("/actualizarAdmin")
    public String actualizarListarAdmi( Model model) {
    	
        return "actualizarAdmin";
    }
	
	@PostMapping("/actualizarListarAdmin")
	public String actualizarListarAdmin (Model model, Usuario usuario) {
		
		 //this.dao.
		
		return "listarAdmin";
	}
	
	

	
	//ANADIR USUARIO
	
	@GetMapping("/anadirAdmin")
    public String anadirUsuari( Model model) {
    	
        return "anadirAdmin";
    }
	
	
	@PostMapping("/anadirAdmin")
    public String anadirUsuario(Usuario usuario, Model model) {
    	 this.dao.anadeusu(usuario);
			return "anadirAdmin";
	
       
    }
	
	
}
