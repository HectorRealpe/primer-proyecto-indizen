package com.equipo.segundo.usuarios.models;

import java.util.List;

public interface InterfaceCRUD {
	
	public List<Usuario> creausuarios();
	
	public boolean existeusu(Usuario usuario);
	
	public List<Usuario> getListausu();
	
	public String anadeusu(Usuario usuario);
	
	public String eliminausu(Usuario usuario);
	
	public Usuario devuelveusu(Usuario usuario);
	
	public List<Usuario> getMapAll();
	
}
