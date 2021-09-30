package com.equipo.segundo.usuarios.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.equipo.segundo.usuarios.models.entity.User;

public interface UserAuthRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
	
}
