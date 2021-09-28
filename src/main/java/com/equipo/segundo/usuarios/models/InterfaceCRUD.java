package com.equipo.segundo.usuarios.models;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceCRUD extends JpaRepository<Usuario, Long>{

	List<Usuario> findByTitleContaining(String nombre);
}
