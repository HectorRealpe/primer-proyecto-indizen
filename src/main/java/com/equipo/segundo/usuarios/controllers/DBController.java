package com.equipo.segundo.usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.segundo.usuarios.models.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.Usuario;

@CrossOrigin(origins="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class DBController {
	
	@Autowired
	private InterfaceCRUD dao;
	
	@GetMapping("/tutorials")
	public ResponseEntity<Usuario> getAllUsuarios(@RequestParam(required = false) String title) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	

}
