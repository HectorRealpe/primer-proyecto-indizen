package com.equipo.segundo.usuarios.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.segundo.usuarios.models.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.Usuario;

@RestController
@RequestMapping("/api")
public class DBController {
	
	@Autowired
	InterfaceCRUD dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAllUsuarios(@RequestParam(required = false) String nombre) {
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();

			if (nombre == null)
				dao.findAll().forEach(usuarios::add);
			else
				dao.findByTitleContaining(nombre).forEach(usuarios::add);

			if (usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//	@PostMapping("/usuarios")
//	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
//		try {
//			dao.anadeusu(usuario);
//			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
//	@GetMapping("/usuarios/{id}")
//	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") long id) {
//		Optional<Usuario> usuarioData = dao.findById(id);
//
//		if (usuarioData.isPresent()) {
//			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

//	@PutMapping("/usuarios/{id}")
//	public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") long id, @RequestBody Usuario usuario) {
//		Optional<Usuario> usuarioData = dao.findById(id);
//
//		if (usuarioData.isPresent()) {
//			Usuario _usuario = usuarioData.get();
//			_usuario.setTitle(usuario.getTitle());
//			_usuario.setDescription(usuario.getDescription());
//			_usuario.setPublished(usuario.isPublished());
//			return new ResponseEntity<>(dao.save(_usuario), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@DeleteMapping("/usuarios/{id}")
//	public ResponseEntity<HttpStatus> deleteUsuario(@PathVariable("id") long id) {
//		try {
//			dao.deleteById(id);
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

//	@DeleteMapping("/usuarios")
//	public ResponseEntity<HttpStatus> deleteAllUsuarios() {
//		try {
//			dao.deleteAll();
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//
//	}
//
//	@GetMapping("/usuarios/published")
//	public ResponseEntity<List<Usuario>> findByPublished() {
//		try {
//			List<Usuario> usuarios = dao.findByPublished(true);
//
//			if (usuarios.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			return new ResponseEntity<>(usuarios, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}	

}
