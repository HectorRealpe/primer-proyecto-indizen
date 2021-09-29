package com.equipo.segundo.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.segundo.usuarios.controllers.exception.RecursoNoEncontrado;
import com.equipo.segundo.usuarios.models.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.Usuario;

@CrossOrigin(origins= {"http://localhost:8081"})
@RestController
@RequestMapping("/api")
public class DBController {
	
	@Autowired
	private InterfaceCRUD dao;
	
	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return dao.getMapAll();
	}

	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> show(@PathVariable(value = "id") long id) throws RecursoNoEncontrado {
		var usuario = dao.findOne(id);
		return ResponseEntity.ok().body(usuario);
	}

	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		dao.anadeusu(usuario);
		return usuario;
	}

	@PutMapping("/usuarios/modificar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody Usuario usuario, @PathVariable long id) {
		this.dao.editausu(id, usuario);
	}

	@RequestMapping(value="/eliminar/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable(value="id") Long id) {
		this.dao.eliminausu(this.dao.findOne(id));
	}

}
