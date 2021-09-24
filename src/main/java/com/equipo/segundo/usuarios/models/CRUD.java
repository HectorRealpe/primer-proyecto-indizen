package com.equipo.segundo.usuarios.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CRUD {
	Usuario u;
	int rd;
	int rd2;
	List<Usuario> listausu;
	
	
	public List<Usuario> getListausu() {
		return listausu;
	}

	
	public List<Usuario> creausuarios () {
		
		//Creamos un fichero para hacer de "base de datos"
		String sFichero = "fichero.txt";
		File fichero = new File(sFichero);
		
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
	public void creatxt() {
	/*	 CRUD c = null;
		 List<Usuario> listau = c.creausuarios();
		 FileInputStream fis = new FileInputStream("Datos/usuarios.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);

		

		 ois.close();*/
	}
	public String anadeusuario(Usuario u) {
		
		return null;
	}
	
	
	public boolean existeusu(int usuario) {
		boolean b = false;
		if (listausu.contains(usuario)) {
		b = true;
		}

		 return b;
		}

		 public String anadeusu(Usuario u) {
		String a = "error";
		u.setId(listausu.size() + 1);
		if (!u.toString().isBlank()) {
		listausu.add(u);
		a = "usuario insertado con exito";
		}

		 return a;
		}

		 public String eliminausu(int id) {

		 listausu.remove(id);
		String a = "usuario borrado con exito";
		if (new CRUD().existeusu(id)) {
		a = "error en el borrado";
		}
		return a;
		}

		 public Usuario devuelveusu(int id) {
		Usuario us = null;
		if (new CRUD().existeusu(id)) {
		us = null;
		} else {
		us = listausu.get(id);
		}
		return us;

		 }

		 public List<Usuario> getMapAll() {

		 return listausu;

		 }

}
