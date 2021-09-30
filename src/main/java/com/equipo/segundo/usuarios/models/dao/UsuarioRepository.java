package com.equipo.segundo.usuarios.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equipo.segundo.usuarios.models.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findByNombre(String nombre);

}
