package com.equipo.segundo.usuarios.models.dao;

import java.util.List;

import com.equipo.segundo.usuarios.models.entity.Usuario;

public interface InterfaceCRUD {
	
	public List<Usuario> getMapAll();

	public void anadeusu(Usuario usuario);

	public void eliminausu(Usuario usuario);
	
	public Usuario findOne(long id);
	
	public void editausu(long id, Usuario usuario);

	void eliminausu(int usuario);
	
	
}
