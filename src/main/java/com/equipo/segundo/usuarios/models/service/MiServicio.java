package com.equipo.segundo.usuarios.models.service;

import org.springframework.stereotype.Service;

@Service
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso...";
	}

}
