package com.equipo.segundo.usuarios.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.equipo.segundo.usuarios.models.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.Usuario;

@Controller
//@RequestMapping("/usuarios")
public class IndexController {
	
	@Autowired
	InterfaceCRUD dao;
	

	// Routing inicial y paso de datos del controlador a la vista para un HTML muy básico
	@GetMapping({"/index","/", "/home"})
	public String index(Model model) {	
		model.addAttribute("titulo", "Video Club");
		model.addAttribute("welcome", "Bienvenido");
		model.addAttribute("login", "Iniciar Sesion");
		model.addAttribute("email", "Tu id");
		model.addAttribute("password", "Tu nombre");
		model.addAttribute("question", "¿Aun no te has registrado?");
		model.addAttribute("singIn", "Registrar");
		return "index";
		
	}
	
	@GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario usuarios");
        return "formulario";
    }
    
    @PostMapping("/form")
    public String procesar(Usuario usuario, Model model) {
    	
    	

        model.addAttribute("titulo", "Hemos añadido este usuario a la base de datos");
        model.addAttribute("usuario", usuario);
        
        return "resultado";
    }
    
	
	@GetMapping("/listar")
	public String listar(Model model) {
		//Lista los usuarios que generamos en nuestra "base de datos"
		
//		this.dao.creausuarios();
		
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", this.dao.findAll());
		
		return "listar";
		
	}
	
	
	
	@GetMapping("/listarAdmin")
	public String listarAdmin(Model model) {
		//Lista los usuarios que generamos en nuestra "base de datos"
		
		
		model.addAttribute("titulo", "Listado de usuarios Administrador");
		model.addAttribute("usuarios", this.dao.findAll());
		
		return "listarAdmin";
		
	}
	
	@PostMapping("/listaAdmin")
	public String borrarUsuario (Model model, Usuario usuario) {

		this.dao.delete(usuario);
		
		return "listaAdmin";
	}
	
	
	
	@GetMapping("/actualizarAdmin")
    public String actualizarListarAdmi( Model model) {
    	
        return "actualizarAdmin";
    }
	
	@PostMapping("/actualizarListarAdmin")
	public String actualizarListarAdmin (Model model) {
		
		 //this.dao.
		
		return "listarAdmin";
	}
	
	
//	@PostMapping("/mandarListarAdmin")
//	public String mandarListarAdmin (Model model, Usuario usuario) {
//		if(model.equals("borrar")) {
//			this.dao.delete(usuario)
//			return "listarAdmin";
//		}else {
//			model.addAttribute("usuario", usuario);
//			return "actualizarAdmin";
//			
//		}
//		
//		
//	}
	
	
	
	
	@GetMapping("/anadirAdmin")
    public String anadirUsuari( Model model) {
    	
        return "anadirAdmin";
    }
	
	
	@PostMapping("/anadirAdmin")
    public String anadirUsuario(Usuario usuario, Model model) {
    	 this.dao.save(usuario);
        return "listarAdmin";
    }
	
}
