package com.equipo.segundo.usuarios.models;

import java.util.List;

public interface InterfaceCRUD {

	public List<Usuario> getListausu();
	
	public List<Usuario> creausuarios();
	
	public String anadeusu(Usuario u);
	
	public String eliminausu(int id);
	
	public Usuario devuelveusu(int id);
	
	public List<Usuario> getMapAll();
	
}
