package com.equipo.segundo.usuarios.models;

import java.io.Serializable;

public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String authority;
	
}
