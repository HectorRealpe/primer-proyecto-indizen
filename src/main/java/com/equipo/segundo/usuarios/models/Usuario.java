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

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario() {

	}

	public Usuario(String nombre, String apellido, String nick, String sexo, String email, int edad, String banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.sexo = sexo;
		this.email = email;
		this.edad = edad;
		this.banco = banco;
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

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", banco=" + banco + ", nick="
				+ nick + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	


}
