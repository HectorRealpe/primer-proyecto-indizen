package com.equipo.segundo.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.equipo.segundo.usuarios.models.entity.UserAuth;

public interface UserAuthRepository extends CrudRepository<UserAuth, Long> {

	public UserAuth findByUsername(String username);
	
}
