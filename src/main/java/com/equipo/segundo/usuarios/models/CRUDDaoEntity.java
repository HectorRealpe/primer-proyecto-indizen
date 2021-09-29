package com.equipo.segundo.usuarios.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CRUDDaoEntity implements InterfaceCRUD {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public List<Usuario> getMapAll() {
		 return em.createQuery("from Usuario").getResultList();
	}

	@Override
	@Transactional
	public void anadeusu(Usuario usuario) {
		em.merge(usuario);
	}

	@Override
	public String eliminausu(Usuario usuario) {
		int id = (int) usuario.getId();
		em.createQuery("delete * from usuarios where id='" + id + "';").getSingleResult();
		return null;
	}

	@Override
	public Usuario devuelveusu(Usuario usuario) {
		int id = (int) usuario.getId();
		return (Usuario) em.createQuery("select * from usuarios where id='" + id + "';").getSingleResult();

	}


}
