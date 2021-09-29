package com.equipo.segundo.usuarios.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.segundo.usuarios.models.InterfaceCRUD;
//import com.equipo.segundo.usuarios.models.InterfaceCRUD;
import com.equipo.segundo.usuarios.models.Usuario;

@CrossOrigin(origins="http://localhost:8081")
@RestController
@RequestMapping("/api")
public class DBController {
	
	@Autowired
	private InterfaceCRUD dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAllUsuarios() {
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			dao.getMapAll().forEach(usuarios::add);
			
			if (usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
		try {
			dao.anadeusu(usuario);
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/usuarios/{id}")
	public ResponseEntity<HttpStatus> deleteUsuario(@PathVariable("id") long id) {
		try {
			if(id > 0) {
				dao.eliminausu(id);
			}
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") long id) {
		Usuario usuarioData = dao.findOne(id);

		if (usuarioData != null) {
			return new ResponseEntity<>(usuarioData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
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
	

}
