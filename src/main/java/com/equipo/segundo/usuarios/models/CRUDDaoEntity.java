package com.equipo.segundo.usuarios.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("segundoServicioCRUD")
public class CRUDDaoEntity implements InterfaceCRUD {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void creausuarios() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean existeusu(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getListausu() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

	@Override
	public String anadeusu(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminausu(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario devuelveusu(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getMapAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
