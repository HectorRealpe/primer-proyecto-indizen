package com.equipo.segundo.usuarios.models;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	private String apellido;
	private String nick;
	private String sexo;
	private String email;
	private int edad;
	private String banco;
	private boolean pelis;
	
	public Usuario() {
	}

	public Usuario(String nombre, String apellido, String nick, String sexo, String email, int edad, String banco, boolean pelis) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.sexo = sexo;
		this.email = email;
		this.edad = edad;
		this.banco = banco;
		this.pelis = pelis;
	}


	public long getId() {
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
	
	public void setEmail(String email) {
		this.email = email;
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toQuery() {
		return apellido + "," + banco + "," + edad + "," + email + ","
				+ nick + "," + nombre + "," + pelis + "," + sexo;
	}

	private static final long serialVersionUID = 1L;

}
