package com.equipo.segundo.usuarios.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "title")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "title")
	private String nick;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "banco")
	private String banco;
	
	@Column(name = "pelis")
	private boolean pelis = false;
	
	private static final long serialVersionUID = 1L;
	
	public Usuario() {
	}

	public Usuario(long id, String nombre, String apellido, String nick, String sexo, String email, int edad, String banco, boolean pelis) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.sexo = sexo;
		this.email = email;
		this.edad = edad;
		this.banco = banco;
		this.pelis = pelis;
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
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", sexo="
				+ sexo + ", email=" + email + ", edad=" + edad + ", banco=" + banco + ", pelis=" + pelis + "]";
	}

}
