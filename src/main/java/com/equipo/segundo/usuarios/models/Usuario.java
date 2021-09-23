package com.equipo.segundo.usuarios.models;

public class Usuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String nick;
	private String sexo;
	private String email;
	private int edad;
	private String banco;
	private boolean pelis;

	public void setEmail(String email) {
		this.email = email;
	}



	public Usuario(int id, String nombre, String apellido, String nick, String sexo, String email, int edad,
			String banco, boolean pelis) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.sexo = sexo;
		this.email = email;
		this.edad = edad;
		this.banco = banco;
		this.setPelis(pelis);
	}




	public Usuario() {
		
	}



	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEmail() {
		return email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}



	public boolean isPelis() {
		return pelis;
	}



	public void setPelis(boolean pelis) {
		this.pelis = pelis;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", sexo="
				+ sexo + ", email=" + email + ", edad=" + edad + ", banco=" + banco + ", pelis=" + pelis + "]";
	}


	


}
