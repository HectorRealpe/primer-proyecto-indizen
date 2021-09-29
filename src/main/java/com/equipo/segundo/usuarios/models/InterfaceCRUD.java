package com.equipo.segundo.usuarios.models;

import java.util.List;

public interface InterfaceCRUD {
	
	public List<Usuario> getMapAll();

	public void anadeusu(Usuario usuario);

	public void eliminausu(Usuario usuario);
	
	public Usuario findOne(long id);
	
	public void editausu(long id, Usuario usuario);
	
	
}
