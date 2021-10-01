package com.equipo.segundo.usuarios.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equipo.segundo.usuarios.models.dao.UsuarioRepository;
import com.equipo.segundo.usuarios.models.entity.Usuario;

@CrossOrigin(origins= {"http://localhost:8081"})
@RestController
@RequestMapping(path = "/api", produces = "application/Json")
public class UsuarioController {	
	
	@Autowired
	UsuarioRepository userRepository;
	
	@Secured({"ROLE_USER"})
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAllUsuarios(@RequestParam(required = false) String nombre) {
		try {
			List<Usuario> usuarios = new ArrayList<Usuario>();

			if (nombre == null)
				userRepository.findAll().forEach(usuarios::add);
			else
				userRepository.findByNombre(nombre).forEach(usuarios::add);

			if (usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") long id) {
		Optional<Usuario> userData = userRepository.findById(id);

		if (userData.isPresent()) {
			return new ResponseEntity<>(userData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
		try {
			Usuario usu = userRepository.save(usuario);
			return new ResponseEntity<>(usu, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/editar/{id}")
	public ResponseEntity<Usuario> updateTutorial(@PathVariable("id") long id, @RequestBody Usuario usuario) {
		Optional<Usuario> usuarioData = userRepository.findById(id);

		if (usuarioData.isPresent()) {
			Usuario _usuario = usuarioData.get();
			_usuario.setNombre(usuario.getNombre());
			_usuario.setApellido(usuario.getApellido());
			_usuario.setNick(usuario.getNick());
			_usuario.setSexo(usuario.getSexo());
			_usuario.setEmail(usuario.getEmail());
			_usuario.setEdad(usuario.getEdad());
			_usuario.setBanco(usuario.getBanco());
			_usuario.setPelis(usuario.isPelis());
			return new ResponseEntity<>(userRepository.save(_usuario), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/borrar")
	@contentType
	public ResponseEntity<HttpStatus> deleteUsuario(@RequestBody Usuario usuario) {
		try {
			
			userRepository.delete(usuario);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
