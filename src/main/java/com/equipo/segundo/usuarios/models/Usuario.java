package com.equipo.segundo.usuarios.models;

public class Usuario {
	
	int id;
	String nombre;
	String apellido;
	String banco;
	String nick;
	String sexo;
	int edad;

	public Usuario(String nombre, String apellido, String banco, String nick, String sexo, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.banco = banco;
		this.nick = nick;
		this.sexo = sexo;
		this.edad = edad;
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
