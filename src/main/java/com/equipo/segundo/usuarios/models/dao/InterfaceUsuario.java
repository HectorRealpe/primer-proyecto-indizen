package com.equipo.segundo.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.equipo.segundo.usuarios.models.entity.Usuario;

public interface InterfaceUsuario extends CrudRepository<Usuario, Long> {
	
//	public Usuario finByUsername(String username);

}
