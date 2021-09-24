package com.equipo.segundo.usuarios.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.equipo.segundo.usuarios.models.entity.UsuarioEntity;


@Repository
public class UsuarioDaoImple implements IUsuarioDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("uncheked")
	@Transactional(readOnly=true)
	@Override
	public List<UsuarioEntity> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

}
