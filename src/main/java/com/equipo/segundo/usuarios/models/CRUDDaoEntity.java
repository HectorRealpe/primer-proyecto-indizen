package com.equipo.segundo.usuarios.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.annotations.SQLInsert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("segundoServicioCRUD")
public class CRUDDaoEntity implements InterfaceCRUD {

	@PersistenceContext
	private EntityManager em;

	@Override
	public String anadeusu(Usuario usuario) {
		em.createQuery("insert into usuarios values (" + usuario.toQuery() + ");");
		return null;
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

	@Override
	public List<Usuario> getMapAll() {
		// TODO Auto-generated method stub
		return null;
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Usuario> getMapAll() {
//		//return em.createQuery("select * from usuarios;").getResultList();
//		 return em.createQuery("from Usuario").getResultList();
//	}



}
