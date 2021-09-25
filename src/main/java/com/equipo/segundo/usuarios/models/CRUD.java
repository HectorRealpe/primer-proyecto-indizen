package com.equipo.segundo.usuarios.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class CRUD implements InterfaceCRUD {
	
	private EntityManager em;
	
	Usuario u;
	int rd;
	int rd2;
	public List<Usuario> listausu;

	public List<Usuario> getListausu() {
		return listausu;
	}


	@Override
	public List<Usuario> creausuarios() {
				
		//Genero una lista de usuarios aleatoria (primera consulta)
	
		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };
		listausu = new ArrayList<>();
		for (int i = 0; i<10; i++) {
			rd = new Random().nextInt(15);
			rd2 = new Random().nextInt(15);
			String sexo= "femenino";
			boolean pelis= true;
			if (rd++%2==0){ 
				sexo="masculino";
				pelis= false;
				if (rd2++%2==0) {
					pelis= true;
				}
				}
			listausu.add(new Usuario(i,nombres[rd], apellidos[rd2], nombres[rd]+rd*2, sexo, nombres[rd]+"@indizen.com", rd+10, "IB1293476213746"+rd2*7, pelis));
		}
		listausu.add(new Usuario(20, "admin", "adminsuper", "hombre", "masculino", "admin@indizen.com", 20, "IBANFALSO", false));
		
		return listausu;
	}
	
	@Override
	public boolean existeusu(Usuario usuario) {
		boolean b = false;
		if (listausu.contains(usuario)) {
			b = true;
		}

		return b;
	}

	@Override
	public String anadeusu(Usuario u) {
		String a = "error";
		u.setId(listausu.size() + 1);
		if (!u.toString().isBlank()) {
			listausu.add(u);
			a = "usuario insertado con exito";
		}

		return a;
	}

	@Override
	public String eliminausu(Usuario usuario) {

		listausu.remove(usuario);
		String a = "usuario borrado con exito";
		if (new CRUD().existeusu(usuario)) {
			a = "error en el borrado";
			}
		return a;
	}

	@Override
	public Usuario devuelveusu(Usuario usuario) {
		Usuario us = null;
		if (new CRUD().existeusu(usuario)) {
			us = null;
		} else {
			us = listausu.get((int)usuario.getId());
		}
		return us;

	}
	
	@Override
	public List<Usuario> getMapAll() {

		return listausu;

	}
	
	
	// testeando el CRUD:
	
//	public static void main(String[] args) {
//		
//		CRUD crud = new CRUD();
//		
//		List<Usuario> usuarios;
//		
//		usuarios = crud.getListausu();
//		
//		System.out.println(usuarios);
//		
//		Usuario newUser = new Usuario(21, "prueba", "", "hombre", "masculino", "admin@indizen.com", 20, "IBANFALSO", false);
//		
//		crud.anadeusu(newUser);
//		
//		System.out.println(usuarios);
//		
//		
//	}


}
