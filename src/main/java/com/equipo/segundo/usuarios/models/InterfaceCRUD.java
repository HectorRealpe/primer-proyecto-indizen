package com.equipo.segundo.usuarios.models;

import java.util.List;

public interface InterfaceCRUD {
	
	public List<Usuario> getMapAll();

	public void anadeusu(Usuario usuario);

	public void eliminausu(long id);

	public Usuario devuelveusu(Usuario usuario);
	
	public Usuario findOne(Long id);
	
}
